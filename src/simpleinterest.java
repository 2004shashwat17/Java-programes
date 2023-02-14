//simple interest
//import java.util.*;
//public class simpleinterest {
//    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        System.out.print("enter the principle value:");
//        float p=sc.nextFloat();
//        System.out.print("enter the rate of interest:");
//        float r=sc.nextFloat();
//        System.out.print("Enter the time period:");
//        float t=sc.nextFloat();
//        float SI=(p*r*t)/100;
//        System.out.print("Simple Interest="+SI);
//    }
//}
import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principle rate: ");
        float p= in.nextInt();
        System.out.println("Enter the time: ");
        float t= in.nextInt();
        System.out.println("Enter rate of interest: ");
        float r=in.nextInt();
       float si=SimpleInterest(p,r,t);
        System.out.println("simple interest:"+SimpleInterest(p,r,t));

    }
    static int SimpleInterest(float p,float r,float t){
        float si = (p*r*t)/100;
        return (int) si;
    }
}