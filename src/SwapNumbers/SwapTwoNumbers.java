package SwapNumbers;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        // Bitwise XOR
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a +" " +b);



    }




}
