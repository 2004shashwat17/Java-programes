import java.util.Scanner;
public class SumofnaturalNNO {
    public static void main(String[] args) {
        int num;
        int sum=0;
        int i;
        Scanner in =new Scanner(System.in);
        System.out.println("Sum from: ");
        i= in.nextInt();
        System.out.println("Sum up to: ");
        num= in.nextInt();
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of natural numbers: "+sum);
    }
}
