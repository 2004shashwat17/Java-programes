//calculate factorial of a number?
//import java.util.Scanner;
//public class Factorial {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n=0;
//        int fac=1;
//        System.out.println("Enter no to find factorial");
//        n=in.nextInt();
//        while(n>0){
//            fac=fac*n;
//            n=n-1;
//            System.out.println("FActorial:" +fac);
//        }
//    }
//}
//calculate factorial of a number using method?
import java.util.Scanner;
public class Factorial {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anumber for find factorial: ");
        int n =sc.nextInt();
        factorial(n);

   }
   static int factorial(int n){
       int i=1;
       int f=1;
       while(i<=n){                                            //USING WHILE LOOP:
           f=f*i;
           i++;
       }
       System.out.println("factorial of "+n+"is :"+f);
       return f;
   }
//    static int factorial(int n) {
//        int i;
//        int f = 1;
//        for (i = 1; i <= n; i++) {                              //USING FOR LOOP:
//            f = f * i;
//        }
//        System.out.println("Factorial of the " + n + "is:" + f);
//        return f;

    }
