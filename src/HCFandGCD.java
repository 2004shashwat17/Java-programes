//to calculate hcf and gcd?

//import java.util.Scanner;
// public class HCFandGCD {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the two numbers: ");
//         int a = in.nextInt();
//         int b = in.nextInt();
//
//         int g = 0;
//
//         for (int i = 1; i <= a; i++) {
//             if (a % i == 0 && b % i == 0)
//                 g = i;
//         }
//         System.out.println("GCD =" + g);
//     }
//}
//to calculate hcf by using method?
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class HCFandGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        hcf(a,b);
        System.out.println("hcf of a no : "+hcf(a,b));
    }
    static int hcf(int a,int b){
        int hcf=0;
        for(int i=1;i<=a||i<=b;i++) {
            if (a%i==0 && b%i==0){
                hcf = i;
         }
         }
        return hcf ;
    }

}
