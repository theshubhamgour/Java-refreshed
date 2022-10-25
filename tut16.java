import java.util.Scanner;

public class tut16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num) {
            /*
             * case 1:
             * System.out.println("The day is : Monday");
             * break;
             * 
             * case 2:
             * System.out.println("The day is : Tuesday");
             * break;
             * 
             * case 3:
             * System.out.println("The day is : Wednesday");
             * break;
             * 
             * case 4:
             * System.out.println("The day is : Thursday");
             * break;
             * 
             * case 5:
             * System.out.println("The day is : Friday");
             * break;
             * 
             * case 6:
             * System.out.println("The day is : Saturday");
             * break;
             * 
             * case 7:
             * System.out.println("The day is : Sunday");
             * break;
             * 
             * default:
             * System.out.println("Out of scope");
             * break;
             * 
             */

            case 1 -> System.out.println("The day is : Monday");
            case 2 -> System.out.println("The day is : Tuesday");
            case 3 -> System.out.println("The day is : Wednesday");
            case 4 -> System.out.println("The day is : Thrusday");
            case 5 -> System.out.println("The day is : Friday");
            case 6 -> System.out.println("The day is : Saturday");
            case 7 -> System.out.println("The day is : Sunday");
            default -> System.out.println("Out of Scope");
        }

    }
}
