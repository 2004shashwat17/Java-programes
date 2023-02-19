//power in java
//import java.util.Scanner;
//public class powerinjava {
//    public static void main(String[] args){
//        int n,p,result=1;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter n: ");
//        n=in.nextInt();
//        System.out.println("Enter p: ");
//        p=in.nextInt();
//        for(int i=1;i<=p;i++){
//            result=n * result;
//        }
//        System.out.println("power"+result);
//
//    }
//
//}
import java.util.Scanner;
public class powerinjava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter n: ");
        int p = in.nextInt();
        System.out.println("Enter p: ");
        int result=1;
        power(n,p,result);
    }
    static int power(int n,int p,int result) {
        for (int i = 1; i <= p; i++) {
            result = n * result;
        }
        System.out.println("power" + result);
        return n;
    }
}