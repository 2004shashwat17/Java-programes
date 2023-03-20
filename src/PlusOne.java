public class PlusOne {
    public static int[] main(String[] args){
        int digits[]={1,2,3,4,5,6,7,8,9,10};
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9) {
                digits[i]++;
                break;
            }
            else{
                digits[i]=0;
            }
        }
        if(digits[0] ==0) {
            int []res = new int[n+1];
            res[0]=1;
            return res;
        }
            return digits;
    }
}
