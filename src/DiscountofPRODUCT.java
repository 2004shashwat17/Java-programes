//Discount of products
import java.util.Scanner;
public class DiscountofPRODUCT {
    public static void main(String[] args) {
        double dis,Amount,marketprice,s;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter market price: ");
        marketprice= in.nextDouble();
        System.out.println("Enter discount percentage: ");
        dis=in.nextInt();
        s=100-dis;
        Amount=(s*marketprice)/100;
        System.out.println("amount after discount="+ Amount);

    }
}
