//area of rhombus?
//import java.util.Scanner;
//    public class areaofRhombus {
//    public static void main(String[]args){
//        double Diagonal1;
//        double Diagonal2;
//        double Area;
//    Scanner sc= new Scanner(System.in);
//        System.out.println("Enter first& second diagonal=");
//        Diagonal1=sc.nextDouble();
//        Diagonal2=sc.nextDouble();
//        Area=(Diagonal1*Diagonal2/2);
//        System.out.println("Area of Rhombus"+Area);
//
//        }
//
//        }
//area of rhombus using methods?
import java.util.Scanner;
public class areaofRhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double dig1= sc.nextDouble();
        double dig2= sc.nextDouble();
        double Area=area(dig1,dig2);
        System.out.println("Area of rhombus: "+Area);
    }
    static double  area(double dig1,double dig2){
        double Area= dig1+dig2/2;
        return Area;
    }
}