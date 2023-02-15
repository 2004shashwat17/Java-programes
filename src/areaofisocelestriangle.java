//area of isoceles triangle?
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;
//public class areaofisocelestriangle {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the length of the same Side");
//        double a= sc.nextDouble();
//
//        System.out.println("Enter the length of the second Side");//A = ½[√(a2 − b2 ⁄4) × b]
//        double b = sc.nextDouble();
//
//        double area=(b/4)*Math.sqrt((4*a*a-(b*b)));
//        System.out.println("area of isoceles triangle is"+area);
//
//    }
//}
//arae of isoceles triangle using methods?
import java.util.Scanner;
public class areaofisocelestriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the same Side");
        int a = sc.nextInt();
        System.out.println("Enter the length of second side");
        int b = sc.nextInt();
        double area=A(a,b);
        System.out.println("area of isocelestriangle"+area);
    }
    static double A(int a,int b){
        double area=(b/4)*Math.sqrt((4*a*a-(b*b)));
        return area;
    }
}