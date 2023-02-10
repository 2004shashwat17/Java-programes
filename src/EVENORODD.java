//import java.util.Scanner;
//public class EVENORODD {
//    public static void main (String[] args){
//            Scanner reader =new Scanner(System.in);
//            System.out.print("print a number: ");
//            int num = reader.nextInt();
//            if(num%2==0)
//                System.out.println(num + "is even");
//            else
//                System.out.println(num + "is odd");
//
//    }
//}
import java.util.Scanner;
public class EVENORODD{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("print a number:");
            int num = reader.nextInt();
            if (num % 2 == 0)
                System.out.println(num + "is even");
            else
                System.out.println(num + "is odd");
        }
    }
}
