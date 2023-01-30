import java.util.Scanner;
public class areaofparallaogram {
    public static void main(String[] args) {
        int Base;
        int Height;
        int area;
        Scanner in =new Scanner(System.in);
        System.out.println("Entre Base");
        Base=in.nextInt();
        System.out.println("Entre Height");
        Height=in.nextInt();
        area=Base*Height;
        System.out.println("Area of Parallaogram:"+area);
    }
}
