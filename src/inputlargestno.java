import java.util.Scanner;
public class inputlargestno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a= sc.nextInt();
        System.out.print("Enter the second number:");
        int b= sc.nextInt();
        int largest;
        if(a>b)
        largest=a;
        else
            largest=b;
        System.out.println("largest="+largest);

    }

}
