//commision percentage
import java.util.Scanner;
public class commisionpercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount= in.nextDouble();
        System.out.println("Enter commision percentage: ");
        double cp=in.nextDouble();//cp=commision percentage
        double commision = (cp/100)*amount;
        System.out.println("commision amount= "+commision);

    }
}
