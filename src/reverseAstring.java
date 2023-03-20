//reverse a string?
//import java.util.Scanner;
//public class reverseAstring {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the String: ");
//        String name= in.nextLine();
//        int leng= name.length();
//        String rev="";
//        for(int i=leng-1;i>=0;i--){
//            rev=rev+name.charAt(i);
//        }
//        System.out.println("Reverse of a String: "+rev);
//    }
//}
//import java.util.Scanner;
//public class reverseAstring{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entre the string: ");
//        String name = sc.nextInt();
//        int leng = name.length();
//        reversestring(name,leng);
//    }
//    static int reversestring(int name,int leng){
//        String rev="";
//        for(int i=leng-1;i>=0;i++){
//            rev=rev+name.charAt(i);
//        }
//        System.out.println("Reverse of a String: "+rev);
//        return String;
//    }
//}

//reverse a number?
//public class reverseAstring {
//    public static void main(String[] args){
//        int num = 28479;
//        int answer=0;
//        while(num>0) {
//            int rem = num % 10;
//            num /= 10;
//            answer = answer * 10 + rem;
//        }
//        System.out.println(answer);
//    }
//}
//reverse a number using methods?
import java.util.Scanner;
public class reverseAstring {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the no : ");
        int num = sc.nextInt();
        int answer = reversestring(num);
        System.out.println(answer);
    }
    static int reversestring(int num){
        int answer=0;
        while(num>0){
            int rem = num%10;
            num/=10;
            answer=answer *10 +rem;
        }
        return answer;
    }

}
