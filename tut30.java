import java.util.Scanner;

public class tut30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrong(n));

        // All armstrong numbers in the range of 1000
        for(int i=100;i<1000;i++){
            if(armstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean armstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}
