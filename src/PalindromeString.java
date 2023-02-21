//pa
//To check whether the given number is a palindrome or not?
//import java.util.Scanner;
//public class PalindromeString{
//    public static void main(String[] args) {
//        Scanner in= new Scanner(System.in);
//        int num = in.nextInt();
//        int t= num;
//        int rev=0;
//
//        while(num >0) {
//            rev = rev * 10 + num % 10;
//            num = num / 10;
//        }
//        if(t==rev){
//            System.out.println("palindrome ");
//        } else{
//            System.out.println("not palindrome");
//        }

//
//    }
//}
//q2)To check whether the given string is a palindrome or not?
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String num =in.nextLine();
        String reverse ="";
        int length =num.length();
        for(int i= length-1;i >= 0;i--){
            reverse = reverse +num.charAt(i);
        }
        if(num==reverse){
            System.out.println("the entered string "+num+"is a palindrome: ");
        }
        else{
            System.out.println("the entered string "+num+"is not a palindrome: ");
        }
    }
}