//lcm
//import java.util.Scanner;
//public class lcm {
//    public static void main(String[] args) {
//        int lcm;
//        int i;
//        Scanner in = new Scanner(System.in);
//        int a= in.nextInt();
//        int b= in.nextInt();
//        int l = a>b?a:b;
//        for(i=l;i<=a*b;i+=l){
//            if(i%a==0&&i%b==0) {
//                break;
//            }
//        }
//        lcm = i;
//        System.out.println("LCM is: "+lcm);
//    }
//}
//lcm using method?
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class lcm{
    public static void main(String[]  args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        lcm(a,b);
        System.out.println("lcm:"+lcm(a,b));
    }
     static int lcm(int a,int b) {
         int i;
         int l = a > b ? a : b;
         int lcm;
         for (i = l; i <= a * b; i += l) {
             if (i % a == 0 && i % b == 0) ;
             break;
         }
         lcm = i;
         System.out.println("enter lcm:" + lcm);
         return lcm;
     }
        }
