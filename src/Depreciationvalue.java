//depreciation valyue
/*
 amount = ((100-depprecet percentage)*amount)/100
 */
//import java.util.Scanner;
//public class Depreciationvalue {
//    public static void main(String[] args) {
//        long amount,deppercent,year, afterdep,temp;
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter amount: ");
//        amount = in.nextLong();
//        System.out.println("Enter depreciation percentage: ");
//        deppercent = in.nextLong();
//        System.out.println("Enter number of years:");
//        year=in.nextLong();
//        temp=amount;
//        for(int i=0;i<=year;i++);
//        temp=((100-deppercent)*temp)/100;
//        System.out.println("after depreciation: "+temp);
//    }
//}
import java.util.Scanner;
public class Depreciationvalue {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the deprecent: ");
        int deprecent = in.nextInt();
        System.out.println("Enter the amount: ");
        int amount = in.nextInt();
        System.out.println("Enter no of year: ");
        int year = in.nextInt();
        depreciation(deprecent,amount,year);
    }
    static int depreciation(int deprecent,int amount ,int year){
        for(int i=1;i<=year;i++){
          amount = ((100-deprecent)*amount)/100;
        }
        System.out.println("After depreciation: "+amount);
        return amount;
    }
}