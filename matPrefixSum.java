import java.util.Scanner;

public class matPrefixSum {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
        
    }
    static int mat_sum(int [][] matrix, int r1,int c1, int r2, int c2){
            int sum = 0;
            for(int i = r1; i<=r2; i++){
                for(int j = c1; j<=c2;j++){
                    sum+= matrix[i][j];
                }
            }
            return  sum;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the row");
     int r =sc.nextInt();
     System.out.println("Enter the column");
     int c=sc.nextInt();
     int [][] a = new int[r][c];
     for(int i = 0; i<a.length;i++){
        for(int j = 0;j<a[i].length;j++){
            a[i][j]=sc.nextInt();
        }
        System.out.println();
     }
     printMatrix(a);
     System.out.println("Enter first cordinate");
     int r1 = sc.nextInt();
     int c1 = sc.nextInt();
     System.out.println("Enter the second cordinate");
     int r2 = sc.nextInt();
     int c2 = sc.nextInt();
     int preSun = mat_sum(a, r1, c1, r2, c2);
     System.out.println(preSun);
    }
}
