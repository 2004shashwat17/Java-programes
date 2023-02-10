//calculate perimeter of reactangle?
import java.util.Scanner;
public class Perimeterofrectangle {
    public static void main(String[] args) {
        int perimeter;
        Scanner in =new Scanner(System.in);
        System.out.println("enter side one: ");
        int a= in.nextInt();
        System.out.println("enter side second: ");
        int b= in.nextInt();
        System.out.println("enter third side");
        int c= in.nextInt();
        perimeter=a+b+c;
        System.out.println("perimeter of reactangle: "+perimeter);
    }

}
