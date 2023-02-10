import java.sql.SQLOutput;
// To calculate area of triangle
import java.util.Scanner;
public class Areaoftriangle {
    public static void main(String[] args) {
        int h;
        int b;
        int area;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter h");
        h= sc.nextInt();
        System.out.println("enter b");
        b= sc.nextInt();
        area =(h*b)/2;
        System.out.println("Area of the Triangle:"+area);

    }
}
