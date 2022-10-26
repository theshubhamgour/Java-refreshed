public class tut25 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Values before swap is::  A: " + a + " and B is: " + b);
        swap(a, b);
    }

    static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("Values before swap is::  A: " + a + " and B is: " + b);

    }
}
