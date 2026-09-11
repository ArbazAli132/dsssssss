import java.util.Scanner;
public class inplacetr {
    static void print2dArr(int [][] arr){
         System.out.println("Matrix");
        for(int i = 0; i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
        static void inplaceTransport(int [] [] arr , int r , int c){
            for(int i = 0; i < r; i++) {
        for(int j = i + 1; j < c; j++) {

            // swap
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }
          
        }
        
    
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
        inplaceTransport(arr,r,c);
        print2dArr(arr);
    }
}
