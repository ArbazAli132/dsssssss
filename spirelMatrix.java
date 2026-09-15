import java.util.Scanner;

public class spirelMatrix {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void spirel(int[][] mat, int r, int c) {

        int first_row = 0;
        int last_row = r - 1;
        int first_col = 0;
        int last_col = c - 1;

        int totalEle = 0;

        while (totalEle < r * c) {

            // First row → Left to Right
            for (int j = first_col; j <= last_col && totalEle < r * c; j++) {
                System.out.print(mat[first_row][j] + " ");
                totalEle++;
            }
            first_row++;

            // Last column → Top to Bottom
            for (int i = first_row; i <= last_row && totalEle < r * c; i++) {
                System.out.print(mat[i][last_col] + " ");
                totalEle++;
            }
            last_col--;

            // Last row → Right to Left
            for (int j = last_col; j >= first_col && totalEle < r * c; j--) {
                System.out.print(mat[last_row][j] + " ");
                totalEle++;
            }
            last_row--;

            // First column → Bottom to Top
            for (int i = last_row; i >= first_row && totalEle < r * c; i--) {
                System.out.print(mat[i][first_col] + " ");
                totalEle++;
            }
            first_col++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row:");
        int r = sc.nextInt();

        System.out.println("Enter the column:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        // Input matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print normal matrix
        System.out.println("Original Matrix:");
        printMatrix(arr);

        // Print spiral matrix
        System.out.println("Spiral Matrix:");
        spirel(arr, r, c);

        sc.close();
    }
}