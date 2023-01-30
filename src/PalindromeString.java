
import java.util.Scanner;
public class PalindromeString{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        int t= num;
        int rev=0;

        while(num >0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if(t==rev){
            System.out.println("palindrome ");
        } else{
            System.out.println("not palindrome");
        }

    }
}