//import java.util.Scanner;
//public class primeNo {
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int temp=0;
//            for(int i=2;i<num-1;i++){        //while
//                if(num%i==0){
//                    temp=temp+i;
//                }
//            }
//            if(temp>0){
//                System.out.println("it is not a prime: ");
//            }
//            else{
//                System.out.println("It is a prime no.: ");
//            }
//    }
//}
//using methods?
import java.util.Scanner;
public class primeNo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp=0;
        primeno(num,temp);
    }
    static int primeno(int num,int temp){
        for(int i=2;i<num-1;i++){
            if(num%i==0) {
                temp = temp + i;
            }
            if(temp>0){
                System.out.println("It is not a prime no. ");
            }
            else{
                System.out.println("It is a prime no. ");
            }
        }
        return temp;
    }
}
//prime no between two nos?