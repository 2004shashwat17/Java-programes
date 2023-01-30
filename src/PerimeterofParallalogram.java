
import java.util.Scanner;

public class PerimeterofParallalogram {
    public static void main(String[] args) {
        int a;//side
        int b;//base
        int p;//perimeter
        Scanner in =  new Scanner(System.in);
        System.out.print("enter the side: ");
        a= in.nextInt();
        System.out.print("enter the base: ");
        b= in.nextInt();
        p= (a+b)*2;
        System.out.println("Perimeter of parallalogram: "+p);


    }
}
