import java.util.Scanner;
public class simpleprefix {
    public static void main(String[] args) {
        int [] array = {2,1,3,4,5};
       int  [] result = prefixSum(array);
       for(int i=0; i<result.length;i++){
        System.out.print(result[i] +" ");
       }

    }
    static int [] prefixSum(int [] arr){
        int size = arr.length;
        int [] pre = new int [size];
        pre[0]=arr[0];
        for(int i = 1;i<size;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        return pre;
    }
        
    }
    