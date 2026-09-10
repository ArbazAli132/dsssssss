import java.util.Scanner;
public class two_dimensionArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int r = sc.nextInt();
        System.out.println("Enter the column");
        int c = sc.nextInt();
        int [][] arr = new int [r][c];
        for(int i = 0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
            }
            

        }
        System.out.println("Two dimensional aaray");
        for(int i = 0; i<arr.length;i++){
            for(int j = 0;j< arr[i].length;j++){
                System.out.print("  "+arr[i][j]);
            }
            System.out.println();
        }
    }
}
