import java.util.Scanner;
public class perimeterofcircle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Double Radius;
        Double Perimeter;
        Radius= in.nextDouble();
        Perimeter=2*Math.PI*Radius;
        System.out.println("Perimeter of circle"+Perimeter);
    }
}
