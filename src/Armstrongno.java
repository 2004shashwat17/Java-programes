//THIS PROGRAM IS TO CHECK WHETHER THE GIVEN NUMBER IS ARMSTRONG OR NOT?
//import java.util.Scanner;
//public class Armstrongno {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num= in.nextInt();
//        int t=num;
//        int sum=0;
//
//        while(num>0) {
//            sum=sum+(num % 10)*(num % 10)*(num % 10);
//            num = num / 10;
//        }
//        if(sum==t){
//            System.out.println("the no.is armstrong");
//        }
//        else{
//            System.out.println("the no is not an armstrong");
//        }
//
//
//    }
//}
//TO FIND ARMSTRONG NUMBER using methods?

public class Armstrongno {

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int numDigits = String.valueOf(number).length(); // count the number of digits
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10; // get the last digit
            sum += Math.pow(digit, numDigits); // add the digit raised to the power of numDigits to the sum
            temp /= 10; // remove the last digit
        }
        return number == sum;
    }

    // Main function to test the isArmstrong function
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
}
