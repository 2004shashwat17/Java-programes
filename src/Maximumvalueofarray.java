//maximum value in array?
//public class Maximumvalueofarray {
//    public static void main(String[] args){
//        int[] arr ={1,23,45,78};
//        System.out.println(max(arr));
//    }
//    static int max(int[] arr){
//        int maxVal = arr[0];
//        for(int i=1;i <arr.length;i++){
//            if(arr[i]>maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return  maxVal;
//    }
//}
//maximum value between two numbers?
public class Maximumvalueofarray {
    public static void main(String[] args) {
        int[] arr = {1, 23, 45, 78};
        System.out.println(maxRange(arr, 1, 3));
    }

    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}