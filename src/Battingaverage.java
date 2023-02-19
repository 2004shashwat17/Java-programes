//batting average
/*
In cricket, a player's batting average is the total number of runs
they have scored divided by the number of times
 they have been out, usually given to two decimal places.
 */
//import java.util.Scanner;
//public class Battingaverage {
//    public static void main(String[] args) {
//        int totalruns,innings,notout;
//        double avg;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Total runs: ");
//        totalruns = in.nextInt();
//        System.out.println("Enter Total innings: ");
//        innings = in.nextInt();
//        System.out.println("not out: ");
//        notout = in.nextInt();
//        avg=totalruns/(innings-notout);
//        System.out.println("Batting average= "+avg);
//    }
//}
import java.util.Scanner;
public class Battingaverage {
    public static void main(String []args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter total runs: ");
        int totalruns = in.nextInt();
        System.out.println("Enter innings: ");
        int innings = in.nextInt();
        System.out.println("Not out:");
        int notout = in.nextInt();
        battingave(totalruns,innings,notout);
    }
    static int battingave(int totalruns,int innings,int notout){
        int average = (totalruns/innings-notout);
        System.out.println("average no:"+average);
        return average;
    }

}