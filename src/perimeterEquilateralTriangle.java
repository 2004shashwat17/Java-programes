//primeter of equilateraltriangle?
import java.util.Scanner;
public class perimeterEquilateralTriangle {
    public static void main(String[] args) {
        int area;
        Scanner in = new Scanner(System.in);
        System.out.println("enterno. of sides:");
        int a= in.nextInt();
        area=3*a;
        System.out.println("Perimeter of Equilaterial Triangle: "+area);

    }
}
