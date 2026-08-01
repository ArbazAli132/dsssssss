//fins the total number of pair in array whoaw sum is eqaule to X
import java.util.Scanner;
public class targetSum {
    public static void main (String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elemnets");
            for(int i = 0; i<size; i++){
                arr[i] = sc.nextInt();
            
        }
        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(arr[i]+arr[j] == target){
                    count++;
                }
            }
        }
    }
    
}
