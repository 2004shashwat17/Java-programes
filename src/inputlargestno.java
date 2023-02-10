//input largest number?
//import java.util.Scanner;
//public class inputlargestno {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the first number:");
//        int a= sc.nextInt();
//        System.out.print("Enter the second number:");
//        int b= sc.nextInt();
//        int largest;
//        if(a>b)
//        largest=a;
//        else
//            largest=b;
//        System.out.println("largest="+largest);
//
//    }
//
//}
//Take integer inputs till the user enters 0 and print the largest number from ?
import java.util.Scanner;
public class inputlargestno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
  boolean flag =true;
        while (true) {
            int a = in.nextInt();
            if (a > num) {
                num = a;
            }
            if(a==0){
                System.out.println("largest number: "+num);
                break;
            }
        }

        }

    }





















































































































































































