
public class countingoccurence {
    public static void main(String[] args) {
        int count = 0;
        int n = 45335;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 4) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
