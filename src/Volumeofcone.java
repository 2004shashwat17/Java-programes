//volume of cone
import java.util.Scanner;
public class Volumeofcone {
    public static void main(String[] args) {
        int Height;
        int Radius;
        Double Volume;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the height: ");
        Height= in.nextInt();
        System.out.println("enter the radius: ");
        Radius= in.nextInt();
        Volume= Math.PI*(Radius*Radius)*Height/3;
        System.out.print("volume of cone: "+Volume);

    }
}
