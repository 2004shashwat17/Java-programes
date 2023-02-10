//gretting
import java.util.Scanner;
public class gretting {
    public static void main(String[] args){
        System.out.println("Please enter your name");
        Scanner input=new Scanner(System.in);
        String name= input.next();
        System.out.print("hello"+name);
    }
}
