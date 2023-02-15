//area of parallaogram
//import java.util.Scanner;
//public class areaofparallaogram {
//    public static void main(String[] args) {
//        int Base;
//        int Height;
//        int area;
//        Scanner in =new Scanner(System.in);
//        System.out.println("Entre Base");
//        Base=in.nextInt();
//        System.out.println("Entre Height");
//        Height=in.nextInt();
//        area=Base*Height;
//        System.out.println("Area of Parallaogram:"+area);
//    }
//}
//area of parallaogram using methods?
import java.util.Scanner;
public class areaofparallaogram {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int Base = in.nextInt();
        System.out.println("Enter the Height: ");
        int Height = in.nextInt();
        int area = A(Base,Height);
        System.out.println("area of the parallaogram:"+area);
    }
    static int A(int Base,int Height){
        int area = Base*Height;
        return area;

    }

}