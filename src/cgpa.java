//cgpa
import java.util.Scanner;
public class cgpa {
    public static void main(String[] args) {
        double la,Dm,Java,d,e,cgpa,cgpafinal;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter course 1: ");
         la= in.nextDouble();
        System.out.println("Enter course 2: ");
         Dm= in.nextDouble();
        System.out.println("Enter course 3: ");
         Java= in.nextDouble();
        System.out.println("Enter course 4: ");
         d= in.nextDouble();
        System.out.println("Enter course 5: ");
         e= in.nextDouble();
         cgpa=(la+Dm+Java+d+e)/(5.0);
         cgpafinal=(float)(9.5*(cgpa));
        System.out.println("Cgpa Percentage is: "+cgpafinal);

    }
}
