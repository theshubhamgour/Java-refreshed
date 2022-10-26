import java.util.Arrays;

public class tut27 {
    public static void main(String[] args) {
        int[] arr = {1,2,34,56,89,8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        num[5] = 99;
    }
}
