import java.util.Scanner;
public class powerinjava {
    public static void main(String[] args){
        int n,p,result=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        n=in.nextInt();
        System.out.println("Enter p: ");
        p=in.nextInt();
        for(int i=1;i<=p;i++){
            result=n * result;
        }
        System.out.println("power"+result);

    }

}
