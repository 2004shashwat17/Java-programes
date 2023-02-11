//Addition of two numbers?
//import java.util.Scanner;
//public class Main{
//    public static void main(String []args){
//        Scanner in =new Scanner(System.in);
//        System.out.println("Enter number1: ");
//        int n1 = in.nextInt();
//        System.out.println("Enter number2: ");
//        int n2 = in.nextInt();
//        int sum = n1+n2;
//        System.out.println("Sum of 2 numbers: "+sum);
//    }
//}
//Write a program to print the sum of two numbers entered by user by defining your own method?
import java.util.Scanner;
public class sumof2numbers {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1 and 2 number: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = s(n1 ,n2);
        System.out.println("sum of 2 numbers: "+sum);
    }
    static int s(int n1,int n2){
        int sum1 = n1+n2;
        return sum1;
    }

}

