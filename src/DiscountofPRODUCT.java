//Discount of products
////import java.util.Scanner;
//public class DiscountofPRODUCT {
//    public static void main(String[] args) {
//        double dis,Amount,marketprice,s;
//        Scanner in = new Scanner (System.in);
//        System.out.println("Enter market price: ");
//        marketprice= in.nextDouble();
//        System.out.println("Enter discount percentage: ");
//        dis=in.nextInt();
//        s=100-dis;
//        Amount=(s*marketprice)/100;
//        System.out.println("amount after discount="+ Amount);
//
//    }
//}
//Discounts of products using methods?
import java.util.Scanner;
public class DiscountofPRODUCT{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter market price: ");
        int mp = sc.nextInt();
        System.out.println("Enter discount percentage: ");
        int dis = sc.nextInt();
        int s=1;
        marketprice( mp, dis, s);
        }
        static int marketprice(int mp,int dis,int s){
        int Amount = (100-dis)*mp/100;
        System.out.println("amount after discount: "+Amount);
        return Amount;
    }
}