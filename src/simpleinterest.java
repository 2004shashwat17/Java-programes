import java.util.*;
public class simpleinterest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the principle value:");
        float p=sc.nextFloat();
        System.out.print("enter the rate of interest:");
        float r=sc.nextFloat();
        System.out.print("Enter the time period:");
        float t=sc.nextFloat();
        float SI=(p*r*t)/100;
        System.out.print("Simple Interest="+SI);
    }
}
