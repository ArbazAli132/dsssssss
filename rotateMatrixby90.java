import java.util.Scanner;
public class rotateMatrixby90 {
    static void printMatrix( int [] [] matrix){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0 ; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static int[][] transposeMatrix(int[][] matrix, int r, int c) {
    int[][] Arr = new int[c][r];

    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[i].length; j++) {
            Arr[j][i] = matrix[i][j];
        }
    }

    return Arr;
}
        static int[][] reverseMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length / 2; j++) {

            int temp = matrix[i][j];

            matrix[i][j] = matrix[i][matrix[i].length - 1 - j];

            matrix[i][matrix[i].length - 1 - j] = temp;
        }
    }

    return matrix;
}
          
        
        
    
    public static void main(String[] args) {
        //matrix input code
        System.out.println("Input for matrix");
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
        
        System.out.println("Original matrix");
        printMatrix(arr);
        int [][] Matrix_Trans = transposeMatrix(arr, r, c);
        int [][] reverse_matrix = reverseMatrix(Matrix_Trans);
        System.out.println("Transpose Matrix");
        printMatrix(reverse_matrix);

    }
}

