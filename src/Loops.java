import java.util.Scanner;
public class Loops {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
      //  int n = in.nextInt();
// we use for loop when we know hpow much time the loop will run.
        /*
        Syntax for all loops:

        for (initialisation; conditions; increment/decrement){
               //body
               }
         */
            //Q: Print number from 1-5?
            // for (int num=1; num<=5; num+=1){
            //  System.out.println(num);

            // Q:Print no from 1-n where n  is our input?
//            for (int num=1; num<=n; num++) {
//
//              System.out.print("hello world");
//                //  System.out.print(num + "");
//
//        }
        //You have to run the while loop when you do not known how much time will the loop will run.

            //While loop:
        /*
        Syntax:
        while(condition){
                //body
        }
         */
//     int num =1;     //initialization
//         while (num<=5){   //condition
//            System.out.print(num);    //output
//            num += 1;      //increment or decrement
//        }
                     //do while
      // the difference b/w while and do while ---- The do while will run the code atleast once and after that they check the condition
      //  is it satisfied or not if it will satisfied then it will run otherwise break.
        /*
        do{
           //body
          }while(condition);
         */
        int n=1;
        do{
            System.out.print("Hello world");
        }while(n!=1);
    }

}
