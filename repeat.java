import java.util.Scanner;
public class repeat {
 public static void main(String [] args){
    Scanner sc = new Scanner( System.in);
    System.out.println("Enter Array size");
    int size = sc.nextInt();
    int [] arr = new int[size];
    System.out.println("Enter the element of array");
    for(int i = 0; i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Array element");
    for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i]+"  ");
    }
    int repeating_element = repeatingElement(arr);
    if(repeating_element==-1){
        System.out.println(-1);
    }
    else{
        System.out.println(repeating_element);
    }
    
 }   
 static int repeatingElement(int [] array){
    for(int i = 0 ; i < array.length;i++){
        for(int j = i + 1;j<array.length;j++){
            if(array[i]==array[j]){
                return array [i];
            }
        }
    }
    return -1;
 }
}
