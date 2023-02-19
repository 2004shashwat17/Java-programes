//
//// compound interest - Principle*(1+(rate/100))^time
//import java.lang.*;
//import java.util.Scanner;
//public class compoundInterest {
//    public static void main(String[] args) {
//        double principle,time,rate,compoundinterest;
//        Scanner in =new Scanner(System.in);
//        System.out.println("Enter a principle number: ");
//        principle = in.nextInt();
//        System.out.println("Enter the rate of interest: ");
//        rate = in.nextInt();
//        System.out.println("Enter the time period in years: ");
//        time = in.nextInt();
//        compoundinterest=principle*(Math.pow((1+rate/100),time));
//        System.out.println("The compound Interest is:"+compoundinterest);
//
//    }
//}
//compound interest using method?
import java.lang.*;
import java.util.Scanner;
public class compoundInterest {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a principle number: ");
        double prin=in.nextInt();
        System.out.println("Enter the rate of interest: ");
        double rate =in.nextInt();
        System.out.println("Enter the time period in years: ");
        double time = in.nextInt();
        cp( prin, rate, time);
    }
    static double cp(double prin,double rate,double time){
        double compoundInte = prin*(Math.pow((1+rate/100),time));
    System.out.println("The compound Interest is: "+compoundInte);
    return compoundInte;
    }
}