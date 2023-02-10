//counting occurence

//public class countingoccurence {
//    public static void main(String[] args) {
//        int count = 0;
//        int n = 44335;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 4) {
//                count++;
//            }
//            n = n / 10;
//        }
//        System.out.println(count);
//    }
//}
/*Kunal is allowed to go out with his friends only on the even days of a given month.
Write a program to count the number of days he can go out in the month of August?*/
public class countingoccurence{
    public static void main(String[] args){
        int count=0;
        int i;
        for( i=1;i<=31;i++){
            if(i%2==0)
                count+=1;}
        System.out.println(count);
    }

}
