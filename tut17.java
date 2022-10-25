import java.util.Scanner;

public class tut17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input num: ");
        int num = sc.nextInt();

        switch (num) {

            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
            default -> System.out.println("OUT OF SCOPE");

            /*
             * case 1:
             * case 2:
             * case 3:
             * case 4:
             * case 5:
             * System.out.println("Weekdays");
             * break;
             * case 6:
             * case 7:
             * System.out.println("Weekends");
             * break;
             * default:
             * System.out.println("Out of scope");
             * break;
             * 
             */
        }
    }
}
