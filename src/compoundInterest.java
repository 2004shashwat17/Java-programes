
// compound interest - Principle*(1+(rate/100))^time
import java.lang.*;
import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args) {
        double principle,time,rate,compoundinterest;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a principle number: ");
        principle = in.nextInt();
        System.out.println("Enter the rate of interest: ");
        rate = in.nextInt();
        System.out.println("Enter the time period in years: ");
        time = in.nextInt();
        compoundinterest=principle*(Math.pow((1+rate/100),time))-principle;
        System.out.println("The compound Interest is:"+compoundinterest);

    }
}
