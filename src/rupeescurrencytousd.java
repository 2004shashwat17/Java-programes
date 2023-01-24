import java.util.Scanner;
public class rupeescurrencytousd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please entre rupees: ");
        long rupees = sc.nextLong();
        double dollars = rupees/70;
        System.out.print(dollars + "dollars");
    }

}
