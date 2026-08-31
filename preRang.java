import java.util.Scanner;
public class preRang {
    static int [] prefix(int [] arr){
       
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
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
        for(int i = 1; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int [] preSum = prefix(array);
        System.out.println("Enter the number of querry");
        int q = sc.nextInt();
        while (q-- >0) {
            System.out.println("Enter the Range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = preSum[r]-preSum[l-1];
            System.out.println("Ans"+ans);
        }
    }
}
