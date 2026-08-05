import java.util.Scanner;
public class secondLargest {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
    //first maximum
    public static int maxArr(int [] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<array.length; i++){
            if(array[i]>max){
                array[i]=max;
            }
        }
        return max;
    }
    public static int SecondMax(int [] arr){
        int max = maxArr(arr);
        for(int i = 0; i < arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        } 
        int secondmax = maxArr(arr);
        return secondmax;                                                                                                                                                                           
    }
}

