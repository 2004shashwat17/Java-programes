//product of two numbers using methods?
//import java.util.Scanner;
//public class productof2nos {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1 and 2nd number: ");
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        int product = p(n1,n2);
//        System.out.println("sum of 2 numbers:"+product);
//    }
//    static int p(int n1,int n2){
//        int product =n1*n2;
//        return product;
//    }
//}
//product of two numbers without method?
//import java.util.Scanner;
//public class productof2nos {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1 and 2 no: ");
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        int product= n1*n2;
//        System.out.println("product of"+product);
//    }
//}
//Take a number as input and print the multiplication table for it.?
//import java.util.Scanner;
//public class productof2nos{
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("entre the number: ");
//        int num = sc.nextInt();
//        for(int i=0;i<10;i++){
//            System.out.println(num+"x"+(i+1)+"="+(num*(i+1)));
//        }
//
//    }
//}
//mulitplication table using method?
import java.util.Scanner;
public class productof2nos {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multiplication(n);
    }
    static int multiplication(int n){
        for(int i=0;i<10;i++){
            System.out.println(n+"x"+(i+1)+"="+(n*(i+1)));
        }
        return n;
    }
}
