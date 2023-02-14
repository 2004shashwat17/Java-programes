//even or odd?
//import java.util.Scanner;
//public class EVENORODD{
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        while (true) {
//            System.out.print("print a number:");
//            int num = reader.nextInt();
//            if (num % 2 == 0)
//                System.out.println(num + "is even");
//            else
//                System.out.println(num + "is odd");
//        }
//    }
//}
//even or odd using methods?
import java.sql.SQLOutput;
import java.util.Scanner;
public class EVENORODD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(evenOdd(number));
    }
    static String evenOdd(int n){
        String s ="";
        if(n%2==0){
            s=n+" is an even number";
        }else{
            s=n+" is an odd number";
        }
        return s;
    }
}