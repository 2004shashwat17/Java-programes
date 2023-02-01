import java.util.Scanner;
public class VolumeofPrism {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Base: ");
        int Base = in.nextInt();
        System.out.println("Enter Height");
        int Height= in.nextInt();
        System.out.println("Enter Length ");
        int Length = in.nextInt();
        Double volume=(double) (1/2*(Length*Base*Height));
        System.out.println("Enter volume of prism:" +volume);
    }
}
