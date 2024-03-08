package Palindrome;

public class NumberPalindrome {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=252;//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        //1
        // r= 252%10 = 2
        // sum= (0*10)+r = 2
        // n = 25

        //2
        //r = 25%10 = 5
        // sum = (2*10)+5 = 25
        // n = 2

        //3
        // r = 2%10 =2
        // sum = (25*10)+2 = 252
        //n=0

        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
