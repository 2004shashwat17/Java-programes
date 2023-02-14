//leap year
//import java.util.Scanner;
//public class Leapyear {
//    public static void main(String[] args) {
//        int year;
//        System.out.println("Enter the year: ");
//        Scanner in = new Scanner(System.in);
//        year= in.nextInt();
//        if((year%4==0 && year%100!=0|| year%400==0)){
//            System.out.println("Specified year is a leap year: ");
//        }
//        else{
//            System.out.println("Specified year is not a leap year: ");
//        }
//
//    }
//}
//leap year using method?
import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year: ");
            int year=in.nextInt();
        System.out.println(leapyear(year));
    }
    static String leapyear(int  year){

    if((year%4==0 && (year%100!=0 ||year%400==0))){
        return "specified year is a leap year";
    }
    else{
        return "specified year is not a leap year";
    }

    }
}
