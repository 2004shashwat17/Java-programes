import java.util.Scanner;
public class Volumeofpyramid {
    public static void main(String[] args) {
        Double Volume;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Base: ");
        int l=in.nextInt();//Base
        System.out.println("Enter Width: ");
        int w=in.nextInt();//Width
        System.out.println("Enter Height: ");
        int h=in.nextInt();//Height
        Volume = (double)l*w*h/3;
        System.out.println("Volume of Pyramid: "+Volume);


    }
}
