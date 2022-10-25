import java.util.Scanner;

public class tut6 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter you salary: ");
        int salary = sc.nextInt();
        if(salary>10000){
            salary = salary+2000;
        }
        else{
            salary = salary+1000;
        }
        System.out.println("Your Updated Salary is: "+salary);
    }
}
