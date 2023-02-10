//vowels or consonant?
import java.util.Scanner;
public class vowelsorconsonant {
    public static void main(String[] args) {

        char ch;
        System.out.println("Enter any character: ");
        Scanner in = new Scanner(System.in);
        ch=in.next().charAt(0);
        if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
            System.out.println("VOWEL"+ch);
        }
        else{
            System.out.println("CONSONANT: "+ch);
        }
    }
}
