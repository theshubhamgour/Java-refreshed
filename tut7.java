import java.util.Scanner;

public class tut7 {
    public static void main(String[] args) {
        System.out.print("Enter salary: ");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if (salary > 10000) {
            salary += 2000;
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 100;
        }
        System.out.println("Your Updated Salary is: " + salary);
    }
}
