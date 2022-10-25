import java.util.Scanner;

public class tut12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fibonacci number
        int n = sc.nextInt();
        int a= 0;
        int b=1;
        int count = 2;

        while(count<=n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
