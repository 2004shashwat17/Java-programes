//perfect number
import java.util.Scanner;
public class perfectnumber {      //that no which is divisible till the no divisible. and then add till that number.
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter any number: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum)
            System.out.println("perfect number:");
        else
            System.out.println("it is not a perfect number: ");
    }
        }


