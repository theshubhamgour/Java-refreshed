import javax.xml.transform.Source;

public class tut28 {
    public static void main(String[] args) {
        overload("Harry");
        overload(0);
    }

    static void overload(int num) {
        System.out.println(num);
    }

    static void overload(String name) {
        System.out.println(name);
    }
}
