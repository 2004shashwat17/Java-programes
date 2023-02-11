//without using method?
//import java.util.Scanner;
//public class voteeligibility {
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your age=");
//        int age = sc.nextInt();
//        if(age>=18){
//            System.out.println("you are eligible to vote");
//        }
//        else{
//            System.out.println("you are note eligible to vote");
//        }
//    }
//}
//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;
public class voteeligibility {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the age: ");
        int age = sc.nextInt();
        System.out.println(vote(age));
    }
    static String vote(int age){
        String s ="";
        if(age>=18){
            System.out.println("you are eligible for vote.");
        }
        else{
            System.out.println("you are not eligible to vote.");
        }
        return s;
    }
}
