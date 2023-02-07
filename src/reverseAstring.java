import java.util.Scanner;
public class reverseAstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name= in.nextLine();
        int leng= name.length();
        String rev="";
        for(int i=leng-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println("Reverse of a String: "+rev);
    }
}
