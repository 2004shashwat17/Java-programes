//calculate factorial of a number?
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0;
        int fac=1;
        System.out.println("Enter no to find factorial");
        n=in.nextInt();
        while(n>0){
            fac=fac*n;
            n=n-1;
            System.out.println("FActorial:" +fac);
        }
    }
}
