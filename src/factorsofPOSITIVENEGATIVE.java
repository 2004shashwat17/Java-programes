import javax.swing.plaf.metal.MetalBorders;
import java.util.Scanner;

//public class factorsofPOSITIVENEGATIVE {
//
//        public static void main(String[] args) {
//            int number = 60;
//            System.out.print("Factors of " + number + " are: ");
//            for (int i = 1; i <= number; ++i) {
//                if (number % i == 0) {
//                    System.out.print(i + " ");
//                }
//            }
//        }
//    }
//
 public class factorsofPOSITIVENEGATIVE {
    public static void main(String[] args){
        int number = -60;
        System.out.print("Factors of " + number + " are: ");
        for(int i = number; i <= Math.abs(number); ++i) {
            if(i == 0) {
                continue;
            }
            else {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
