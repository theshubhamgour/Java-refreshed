import java.util.*;
public class tut19 {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int a = sc.nextInt();
        System.out.print("Enter number two: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The addition is : " + sum);
    }
}
