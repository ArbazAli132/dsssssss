import java.util.Scanner;
public class pascal {
    static int [][] pasacaltri(int n){
        int [][] arr = new int[n][];
       for(int i = 0; i<n ; i++){
        arr[i]= new int[i+1];
        arr[i][0]=arr[i][i]=1;
        for(int j = 1 ; j<i;j++){
            arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
        }
       }
       return arr;
    }
    static void printMatrix( int [] [] matrix){
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0 ; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Input for matrix");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row ");
        int r = sc.nextInt();
       int [][] ans= pasacaltri(r);
       printMatrix(ans);
        
        
    }
}
