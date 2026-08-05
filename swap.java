import java.util.Scanner;
public class swap {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first value");
    int a = sc.nextInt();
    System.out.println("Enter the second value");
    int b = sc.nextInt();
    System.out.println("Before swap");
    System.out.println("a ="+a);
    System.out.println("b ="+b);
    SWap(a, b);

  }   
  static void SWap(int a , int b){
    int temp = a;
    a = b;
    b = temp;
    System.out.println("values After swap");
    System.out.println("a = " +a);
    System.out.println("b =" +b);
  }
}
