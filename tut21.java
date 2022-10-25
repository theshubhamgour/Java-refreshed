import java.util.*;

public class tut21 {
public static void main(String[] args) {
    System.out.print("The sum printing from the main is: "+sum());
}


static int sum(){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int a = sc.nextInt();
        System.out.print("Enter number two: ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
}

}