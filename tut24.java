import java.util.Scanner;

public class tut24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Values before swap is::  A: " +a+" and B is: "+b);
        int c = a;
        a = b;
        b = c;
        
        System.out.println("Values after swapping is:: A:"+a+" and B is: "+b);

    }

}
