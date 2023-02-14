//area of equlaterial triangle?
//import java.util.Scanner;
//public class areaofequilateraltriangle {
//public static void main(String[] args)
//{
//        Scanner s= new Scanner(System.in);
//        System.out.println("Enter the side of the Triangle:");
//        double a = s.nextDouble();
//        double  area=(Math.sqrt(3)/4)*(a*a);
//        System.out.println("Area of Triangle is: " + area);
//        }
//        }
import java.util.Scanner;
import java.lang.Math;
public class areaofequilateraltriangle {
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the side of the traingle: ");
                double a=in.nextInt();
                double A=Area(a);
        }
        static double Area(double a){
             double area=(Math.sqrt(3)/4)*(a*a);
             return area;
        }
}