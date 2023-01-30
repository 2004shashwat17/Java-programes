import java.util.Scanner;
    public class areaofRhombus {
    public static void main(String[]args){
        double Diagonal1;
        double Diagonal2;
        double Area;
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter first& second diagonal=");
        Diagonal1=sc.nextDouble();
        Diagonal2=sc.nextDouble();
        Area=(Diagonal1*Diagonal2/2);
        System.out.println("Area of Rhombus"+Area);

        }

        }
