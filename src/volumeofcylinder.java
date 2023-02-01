import java.util.Scanner;
import java.lang.Math;
public class volumeofcylinder {
    public static void main(String[] args) {
        Double Volume;//V=πr2h
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the  Radius: ");
        int r= in.nextInt();
        System.out.println("Enter the Height");
        int h= in.nextInt();
        Volume= (Math.PI*(r*r)*h);
        System.out.println("Volume of cylinder: "+Volume);



    }
}
