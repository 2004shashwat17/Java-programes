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
//TO FIND ARMSTRONG NUMBER BETWEEEN TWO GIVEN NUMBERS?
import java.util.Scanner;
public class Armstrongno {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);

        System.out.println("Enter lower bound");
        int lower= reader.nextInt();
        System.out.println("Enter upper bound");
        int upper= reader.nextInt();
        for (int number=lower;number<upper;++number){
            int digits=0;
            int result=0;
            int originalnumber=number;
            //calculate number of digits
            while(originalnumber!=0) {
                originalnumber /= 10;
                ++digits;
            }
            originalnumber=number;
            while(originalnumber !=0) {
                int remainder = originalnumber % 10;
                result += Math.pow(remainder, digits);
                originalnumber /= 10;
            }
            if(result==number){
                System.out.println(number+"");
            }

        }
    }
}
