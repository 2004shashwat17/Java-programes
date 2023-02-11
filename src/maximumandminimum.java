//Define two methods to print the maximum and the minimum number respectively among three numbers enter?
import java.util.Scanner;
public class maximumandminimum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maximum = max(a,b,c);
        int minimum = min(a,b,c);
        System.out.println("Maximum = "+maximum);
        System.out.println("Minimum = "+minimum);
    }
    static int max(int a,int b, int c){
        int maxi = a;
        if(b>maxi){
            maxi = b;
        }
        if(c>maxi){
            maxi=c;
        }
        return maxi;
    }
    static int min(int a,int b,int c){
        int mini =a;
        if(b<mini){
            mini=b;
        }
        if(c<mini){
            mini=c;
        }
        return mini;
    }
}
