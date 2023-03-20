import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args){
        int a [][]= new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Data:\n");
        for(int i=0;i<=1;i++){ //rows
            for(int j=0;j<=1;j++){ //columns
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array Matrix:\n");
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("Transpose Matrix:\n");
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                System.out.println(a[j][i]+" ");
            }
            System.out.println("\n");
        }
    }
}
