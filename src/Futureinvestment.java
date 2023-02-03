//fv=pv*(1+i/100)^N
//fv=Future investment
//pv=present investment
//i=interest paid by the investment
//n= no.of period the investment will be held
import java.lang.*;
import java.util.Scanner;
public class Futureinvestment {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the pv: ");
        double pv= in.nextInt();
        System.out.println("Enter the interest: ");
        double i=in.nextInt();
        System.out.println("Enter the no.of periods: ");
        double N=in.nextInt();
        double fv=pv*Math.pow((1+i/100),N);
        System.out.println("Future investment: "+fv);
    }
}
