import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row ");
        int r = sc.nextInt();
        System.out.println("Enter the column");
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        System.out.println("Enter the value");
        for(int i = 0; i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix");
        for(int i = 0; i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        int [][] Arr = new int [c][r];
        System.out.println("Transepose of matrix");
        for(int i = 0; i<arr.length;i++ ){
            for(int j = 0;j<arr[i].length;j++){
                Arr[j][i]=arr[i][j];
               
            }
           
        }
         System.out.println("Transpose of matrix");

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(" " + Arr[i][j]);
            }
            System.out.println();
        }
        
    }
}
