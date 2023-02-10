//avergae ofn number
import java.util.Scanner;
public class AverageofN {
    public  static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
                int num= sc.nextInt();
        int i;
        float Total =0;
        for(i=1;i<=num;i++){
            System.out.println("Enter the numbers"+i);
            int number= sc.nextInt();
            Total = number+Total;
        }
        System.out.println("the avg is: "+Total/num);
    }
}
