//sum of 2 numbers
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}
//Addition of two numbers?
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number1: ");
        int n1 = in.nextInt();
        System.out.println("Enter number2: ");
        int n2 = in.nextInt();
        int sum = n1+n2;
        System.out.println("Sum of 2 numbers: "+sum);
    }
}