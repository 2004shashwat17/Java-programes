//perfect number
//import java.util.Scanner;
//public class perfectnumber {      //that no wh and theich is divisible till the no divisible.n add till that number.
//    public static void main(String[] args) {
//        int n, sum = 0;
//        System.out.println("Enter any number: ");
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0) {
//                sum = sum + i;
//            }
//        }
//        if (n == sum)
//            System.out.println("perfect number:");
//        else
//            System.out.println("it is not a perfect number: ");
//    }
//        }
//perfect no using methods?
import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
//        input.close();

        if (isPerfectNumber(n)) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}


