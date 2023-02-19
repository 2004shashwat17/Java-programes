//average marks
//import java.util.Scanner;
//public class AverageMarks {
//    public static void main(String[] args) {
//        float sum=0;
//        float avg;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter marks for 5 subjects: ");
//        for(int i=0;i<=5;i++){
//            sum=sum+i;
//        }
//        avg= sum/5;
//        System.out.println("Average marks: "+avg);
//    }
//}
//AVERAGE MARKS USING METHODS?
import java.util.Scanner;
public class AverageMarks {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects: ");
        double avg =1;
        double sum=0;
        avermarks(avg,sum);
    }
    static double avermarks(double avg,double sum){
        for(int i=0;i<=5;i++){
            sum=sum+i;
        }
        double aveg =sum/5;
        System.out.println("Average marks :"+aveg);
        return sum;
    }
}