//cgpa
//import java.util.Scanner;
//public class cgpa {
//    public static void main(String[] args) {
//        double la,Dm,Java,d,e,cgpa,cgpafinal;
//        Scanner in= new Scanner(System.in);
//        System.out.println("Enter course 1: ");
//         la= in.nextDouble();
//        System.out.println("Enter course 2: ");
//         Dm= in.nextDouble();
//        System.out.println("Enter course 3: ");
//         Java= in.nextDouble();
//        System.out.println("Enter course 4: ");
//         d= in.nextDouble();
//        System.out.println("Enter course 5: ");
//         e= in.nextDouble();
//         cgpa=(la+Dm+Java+d+e)/(5.0);
//         cgpafinal=(float)(9.5*(cgpa));
//        System.out.println("Cgpa Percentage is: "+cgpafinal);
//
//    }
//}
import java.util.Scanner;
public class cgpa{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter course 1: ");
        double la= in.nextDouble();
        System.out.println("Enter course 2: ");
        double Dm= in.nextDouble();
        System.out.println("Enter course 3: ");
        double Java= in.nextDouble();
        System.out.println("Enter course 4: ");
        double d= in.nextDouble();
        System.out.println("Enter course 5: ");
        double e= in.nextDouble();
        cgpaa(la,Dm,Java,d,e);
    }
    static double cgpaa(double la,double Dm,double Java,double d,double e){
        double cgpa =(la+Dm+Java+d+e)/(5.0);
        double cgpafinal=(9.5*(cgpa));
        System.out.println("cgpa of a student: "+cgpafinal);
        return cgpa;
    }
}