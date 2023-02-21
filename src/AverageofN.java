//avergae ofn number
//import java.util.Scanner;
//public class AverageofN {
//    public  static void  main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the no.");
//                int num= sc.nextInt();
//        int i;
//        float Total =0;
//        for(i=1;i<=num;i++){
//            System.out.println("Enter the numbers"+i);
//            int number= sc.nextInt();
//            Total = number+Total;
//        }
//        System.out.println("the avg is: "+Total/num);
//    }
//}
//avr age of n nos using methods?
import java.util.Scanner;
public class AverageofN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        float Total = average(num);
        System.out.println(Total/num);
    }
    static float average(int num) {
        float total=0;
        for (int i = 0; i <= num; i++) {
            total = i + total;
        }
        return total;
    }
}
