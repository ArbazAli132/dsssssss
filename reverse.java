import java.util.Scanner;
public class reverse {
 public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array");
    int size = sc.nextInt();
    System.out.println("Enter the Array Element");
    int [] arr = new int[size];
    for(int i = 0 ; i<arr.length;i++){
        arr[i] = sc.nextInt();

    }
    System.out.println("Array");
    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    reverse(arr);
 }
 static void reverse(int []array){
    int n = array.length;
    int [] new_arr = new int[n];
    int j = 0;
    for(int i = n-1;i>=0;i--){
        new_arr[j++] = array[i];
    }
    for( j=0; j<array.length;j++){
        System.out.print(new_arr[j]+" ");
    }
 }   
}
