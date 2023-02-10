//to calculate hcf and gcd
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
 public class HCFandGCD {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the two numbers: ");
         int a = in.nextInt();
         int b = in.nextInt();

         int g = 0;

         for (int i = 1; i <= a; i++) {
             if (a % i == 0 && b % i == 0)
                 g = i;
         }
         System.out.println("GCD =" + g);
     }
}
