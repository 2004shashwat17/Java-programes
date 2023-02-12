//perimeter/circumference of circle?
//import java.util.Scanner;
//public class perimeterofcircle {
//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        Double Radius;
//        Double Perimeter;
//        Radius= in.nextDouble();
//        Perimeter=2*Math.PI*Radius;
//        System.out.println("Perimeter of circle"+Perimeter);
//    }
//}
//perimeter /circumference of circle?
import java.util.Scanner;
import java.lang.*;
public class perimeterofcircle {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Double radius = sc.nextDouble();
        Double Perimeter=P(radius);
        System.out.println("perimeter of a circle"+Perimeter);
    }
    static double P ( double radius){
            double area = 2*Math.PI*(radius*radius);
            return area;
    }
}
