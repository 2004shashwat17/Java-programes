//to clacualate csa of cylinder?
import java.util.Scanner;
public class CSAofCylinder {//Curved surface area of cylinder
    public static void main(String[] args) {//2pie*r*h
        Double Area;
        Scanner in =new Scanner(System.in);
        System.out.println("Radius: ");
        int r= in.nextInt();
        System.out.println("Height: ");
        int h= in.nextInt();
        Area=2* Math.PI*r*h;
        System.out.println("Curved Surface Area: "+Area);



    }
}
