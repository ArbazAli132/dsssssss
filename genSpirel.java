import java.util.Scanner;

public class genSpirel{

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static int[][] Gen_spirel_mat(int n) {

        int first_row = 0;
        int last_row = n - 1;
        int first_col = 0;
        int last_col = n- 1;

        int current = 1;
        int [][] mat = new int [n][n];

        while (current <= n * n) {

            // First row → Left to Right
            for (int j = first_col; j <= last_col && current <= n * n; j++) {
            mat[first_row][j]=current;
                current++;
            }
            first_row++;

            // Last column → Top to Bottom
            for (int i = first_row; i <= last_row && current <= n * n; i++) {
                mat[i][last_col]=current;
                current++;
            }
            last_col--;

            // Last row → Right to Left
            for (int j = last_col; j >= first_col &&  current <= n * n; j--) {
                mat[last_row][j]=current;
                current++;
            }
            last_row--;

            // First column → Bottom to Top
            for (int i = last_row; i >= first_row && current <= n * n; i--) {
                mat[i][first_col]=current;
               current++;
            }
            first_col++;
        }
        return mat;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n:");
        int n = sc.nextInt();
        int [][] matrix = Gen_spirel_mat(n);


        

        // Print normal matrix
        printMatrix(matrix);
       
        sc.close();
    }
}
