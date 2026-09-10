import java.util.Scanner;
public class matrixmultiplication {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the row");
     int r1 =sc.nextInt();
     System.out.println("Enter the column");
     int c1 =sc.nextInt();
     int [][] a = new int[r1][c1];
     for(int i = 0; i<a.length;i++){
        for(int j = 0;j<a[i].length;j++){
            a[i][j]=sc.nextInt();
        }
     }

     for(int i = 0; i<a.length;i++){
        for(int j = 0;j<a[i].length;j++){
            System.out.print(" "+a[i][j]);
        }
        System.out.println();
     }


     System.out.println("Enter the row");
     int r2 =sc.nextInt();
     System.out.println("Enter the column");
     int c2 =sc.nextInt();
     int [][] b = new int[r2][c2];
     for(int i = 0; i<b.length;i++){
        for(int j = 0;j<b[i].length;j++){
            b[i][j]=sc.nextInt();
        }
     }

     for(int i = 0; i<a.length;i++){
        for(int j = 0;j<a[i].length;j++){
            System.out.print(" "+a[i][j]);
        }
        System.out.println();
     }
     int [][]c = new int[r1][c2];
     for(int i = 0;i<c.length;i++){
        for(int j =0; j<c[i].length;j++){
        for(int k = 0;k<c1;k++){
            c[i][j]=a[i][k]+b[k][j];
        }
     }
    }
    
  for(int i = 0; i<b.length;i++){
        for(int j = 0;j<b[i].length;j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
     }   
 

 }
}
