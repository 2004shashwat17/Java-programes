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
public class PalindromeString{
    public static void main(String[] args) {
        String s=new String();
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string to Check");
        s=in.nextLine();
        int i,j,flag=0;
        i=0;
        j=s.length()-1;
        flag=0;
        while(i<j && flag==0)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                flag = 1;
                break;
            }
            i++;
            j--;
        }
        if(flag==0)
            System.out.println("palindrome ");
         else
            System.out.println("not palindrome");


    }
}