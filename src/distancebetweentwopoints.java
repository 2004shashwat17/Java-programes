//distance between two points?
//import java.util.Scanner;
//public class distancebetweentwopoints {
//    public static void main(String[] args) {
//        int x1,x2,y1,y2;
//        double dis;
//        Scanner in = new Scanner (System.in);
//        System.out.println("enter value for x1: ");
//        x1= in.nextInt();
//        System.out.println("enter value for y1: ");
//        y1= in.nextInt();
//        System.out.println("enter value for x2: ");
//        x2= in.nextInt();
//        System.out.println("enter value for y2: ");
//        y2= in.nextInt();
//        dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
//        System.out.println("Distence between two points:" +"("+x1+","+y1+"),"+"("+x2+","+y2+")= "+dis);
//
//
//
//    }
//
//}
import java.util.Scanner;
public class distancebetweentwopoints {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value for x1: ");
        int x1= sc.nextInt();
        System.out.println("enter the value for x1: ");
        int x2= sc.nextInt();
        System.out.println("enter the value for x1: ");
        int y1= sc.nextInt();
        System.out.println("enter the value for x1: ");
        int y2= sc.nextInt();
        distbetween2points(x1,x2,y1,y2);
    }
    static int distbetween2points(int x1,int x2,int y1,int y2){
        double dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between 2 points: "+dis);
        return (int) dis;
    }
}