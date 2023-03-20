//Linear search code
public class Linearsearch {
    public static void main(String[] args) {
        //search in the array : return the index if the item found
        //otherwise if item not found return -1
        int[] nums = {25, 45, 67, 72, 47};
        int target = 72;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }
    static int linearsearch(int [] nums,int target){
        if (nums.length == 0){
            return -1;
        }
        for(int index = 0;index <nums.length;index++){
            int element = nums[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}