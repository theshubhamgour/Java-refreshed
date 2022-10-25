public class tut14 {
    public static void main(String[] args) {

        // reverse
        int num=23456;
        int ans=0;
        while(num>0){
            int rem=num%10;  //  23456/10 = 6
            num =num/10;    //23456/10 = 2345

            ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}
