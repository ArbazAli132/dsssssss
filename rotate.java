import java.util.Scanner;
public class rotate {
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
        System.out.println("Enter at which step k ");
        int k = sc.nextInt();
        rotate_Arr(array, k);
    }
    static void rotate_Arr(int [] arr,int k){
        int n = arr.length;
        k=k%n;
        int []new_arr = new int[arr.length];
        int j = 0;
        for(int i = n-k; i<n;i++ ){
            new_arr[j++]=arr[i];
        } 
        for(int i = 0; i<n-k;i++){
            new_arr[j++]=arr[i];
        }
        for(int i : new_arr){
            System.out.println(i);
        }

    }
}
