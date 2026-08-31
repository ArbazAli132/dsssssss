import java.util.Scanner;


public class sufixSum {
    static int arraySum(int [] arr){
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean partitionSum(int [] arr){
        int totalsum = arraySum(arr);
        int prefixSum = 0;
        for(int i = 0; i<arr.length;i++){
           prefixSum+=arr[i];
           int sufix = totalsum-prefixSum; 
           if(prefixSum==sufix){
            return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size"+" ");
        int size = sc.nextInt();
        int [] array = new int [size];
        System.out.println("Enter the Array Element :");
        for(int i=0; i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array :");
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("Partition possible: " + partitionSum(array));
       
    }
}
