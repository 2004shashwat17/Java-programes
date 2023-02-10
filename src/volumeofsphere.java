//volume of sphere?
import java.util.Scanner;
import java.lang.Math;
public class volumeofsphere {//V=4/3πr3
    public static void main(String[] args) {
        Double Volume;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        int Radius= in.nextInt();
        Volume= 4/3* Math.PI*Radius*Radius*Radius;
        System.out.println("Volume of Sphere: "+Volume);


    }
}
