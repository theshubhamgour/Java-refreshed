import java.util.Scanner;

public class tut5 {
    public static void main(String[] args) {
        System.out.print("Enter the Temperature in celcius: ");
        Scanner sc = new Scanner(System.in);
        float celcius = sc.nextFloat();
        float temp = (celcius*9/5) + 32;
        System.out.println("The temp in farhenite is : "+temp);

    }
}
