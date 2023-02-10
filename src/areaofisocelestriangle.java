//area of isoceles triangle?
import java.sql.SQLOutput;
import java.util.Scanner;
public class areaofisocelestriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the same Side");
        double a= sc.nextDouble();

        System.out.println("Enter the length of the second Side");
        double b = sc.nextDouble();

        double area=(b/4)*Math.sqrt((4*a*a-(b*b)));
        System.out.println("area of isoceles triangle is"+area);

    }
}
