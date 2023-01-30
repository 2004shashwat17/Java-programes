import java.util.Scanner;
public class Armstrongno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        int t=num;
        int sum=0;

        while(num>0) {
            sum=sum+(num % 10)*(num % 10)*(num % 10);
            num = num / 10;
        }
        if(sum==t){
            System.out.println("the no.is armstrong");
        }
        else{
            System.out.println("the no is not an armstrong");
        }


    }
}
