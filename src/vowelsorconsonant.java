//vowels or consonant?
//import java.util.Scanner;
//public class vowelsorconsonant {
//    public static void main(String[] args) {
//
//
//        System.out.println("Enter any character: ");
//        Scanner in = new Scanner(System.in);
//        char ch=in.next().charAt(0);
//        if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
//            System.out.println("VOWEL"+ch);
//        }
//        else{
//            System.out.println("CONSONANT: "+ch);
//        }
//    }
//}
//vowels or consonants using methods?
import java.util.Scanner;
public class vowelsorconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       char ch=sc.next().charAt(0);
       vorc(ch);
    }
    static void vorc(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
            System.out.println("Vowels: " + ch);
        }
            else {
                System.out.println("consonant: " + ch);
            }
        }
    }
