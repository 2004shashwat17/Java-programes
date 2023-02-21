//calculator
import java.util.Scanner;
//public class calculator {
//    public static void main(String[]args){
//        Scanner in = new Scanner(System.in);
//        int ans = 0;
//        while (true){
//            System.out.println("Enter the operator: ");
//            char op = in.next().trim().charAt(0);
//
//            if (op == '+' || op == '-' || op == '*' || op == '/'|| op == '%') {
//                System.out.println("Enter two numbers: ");
//                int num1 = in.nextInt();
//                int num2 = in.nextInt();
//
//                if ( op == '+') {
//                    ans = num1 + num2;
//                }
//                if (op == '-') {
//                    ans = num1 - num2;
//                }
//                if (op == '*') {
//                    ans = num1 * num2;
//                }
//                if (op == '/') {
//                    if (num2 != 0) {
//                        ans = num1 / num2;
//                    }
//                }
//                if (op =='%') {
//                    ans = num1 % num2;
//                }
//            } else if ( (op == 'x') || op == 'X') {
//                    break;
//            } else{
//                    System.out.println("Invalid operation!!");
//            }
//                System.out.println(ans);
//            }
//     }
//}
//calculator program using methods?
import java.util.Scanner;
public class calculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double n1= sc.nextInt();
        System.out.println("Enter second number: ");
        double n2= sc.nextInt();
        System.out.println("Entre operator(+,-,*,/,%): ");
        char operator =sc.next().charAt(0);
        double result =calculate(n1,n2,operator);
        System.out.println("Result: "+result);
    }
    public static double calculate(double n1,double n2,char operator){
        double result =0;
        switch (operator) {
            case '+':
                result=n1+n2;
                break;
            case '-':
                result =n1-n2;
                break;
            case '*':
                result = n1*n2;
                break;
            case'/':
                result =n1/n2;
                break;
            case'%':
                result =n1%n2;
                break;
            default:
                System.out.println("Error: Invalid operator");

        }
        return result;
    }
}