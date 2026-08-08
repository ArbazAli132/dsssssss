import java.util.Scanner;
public class twopointer {
 public static void main(String[] args) {
    int [] array = {1,0,0,1,0,1,1,0};
    for(int i:array){
        System.out.print(i+"");
    }
    System.out.println();
    two_pointer(array);
 }
 static void two_pointer(int [] arr){
    int size = arr.length-1;
    int left = 0;
    int right =size;
    while(left<right){
        if(arr[left]==1 && arr[right]==0){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;

        }
        if(arr[left]==0){
            left++;
        }
        else{
            right--;
        }
    }
    for(int i : arr){
        System.out.print(i+"");
    }
 }   
}
