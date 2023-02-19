//electricity bill
//import java.util.Scanner;
//public class electricitybill {
//    public static void main(String[] args) {
//        System.out.println("Enter the units: ");
//        Scanner in = new Scanner(System.in);
//        int unit = in.nextInt();
//        int y;
//        int z;
//        if(unit<=100){
//            System.out.println("Bill amount=0");
//        }
//        else if(unit>100 && unit<=200){
//            unit-=100;
//            unit*=5;
//            System.out.println("Bill amount"+unit);
//        }
//        else if(unit>200 && unit<=300) {
//            unit -= 200;
//            unit *= 10;
//            y = 100 * 5;
//            unit += y;
//            System.out.println("Bill amount" + unit);
//        }
//        else if(unit>300){
//            unit-=300;
//            unit*=15;
//            y=100*5;
//            z=100*10;
//            unit+=y+z;
//            System.out.println("Bill amount "+unit);
//        }
//    }
//}
import java.util.Scanner;
public class electricitybill {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the units: ");
        int unit = sc.nextInt();
        int y=1;
        int z=1;
        electricbill(unit,y,z);
    }
    static int electricbill(int unit,int y,int z){
        if (unit>100){
            System.out.println("Bill amount=0");
        } else if(unit>100 && unit>=200) {
            unit-=100;
            unit*=5;
            System.out.println("BIll amount"+unit);

        } else if (unit>200 && unit>=300) {
            unit-=200;
            unit*=10;
            y=100*5;
            unit+=y;
            System.out.println("Bill amount"+unit);
        } else if(unit>300){
            unit-=300;
            unit*=15;
            y=100*5;
            z=100*10;
            unit+=y+z;
            System.out.println("Bill amount"+unit);
        }
        return unit;
    }
}
