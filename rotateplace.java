import java.util.Scanner;

public class rotateplace {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array the size");
        int size = sc.nextInt();
        System.out.println("Enter the array element");
        int [] array = new int[size];
        for(int i = 0; i<array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Array");
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Enter at which step k ");
        int k = sc.nextInt();
        rotate_place(array, k);
        
        
    } 
    static void rotate_place(int []arr, int k){
        int n = arr.length;
        k=k%n;
        reverse(arr, 0, n-k-1);
        
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void reverse(int []array ,int i, int j){
    
    while(i<j){
        int temp = array[i];
        array[i] = array[j];
        array[j]=temp;
        i++;
        j--;
    }
    
 }   
}
