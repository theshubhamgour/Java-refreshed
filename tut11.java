import java.util.Scanner;

public class tut11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > a) {
            max = c;
        }
        System.out.print(max);

    }
}
