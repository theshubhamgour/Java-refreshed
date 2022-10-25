import java.util.Scanner;

public class tut15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {

            case "Mango":
                System.out.println("King of frutis");
                break;

            case "Orange":
                System.out.println("King of nagpur");
                break;

            case "Grapes":
                System.out.println("King of mirzapur");
                break;

            // case "Apple" -> System.out.println("Enhance Switch");
            // This will not work since Mixing of different kinds of case statements '->'
            // and ':' is not allowed within a switch

            default:
                System.out.println("King of discovery");
                break;
        }
    }
}
