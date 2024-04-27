package PrePostfix;

public class PrePostFixDemo {
    public static void main(String[] args) {
        int x = 5;
        // Prefix Increment (++x):                                               The value of the variable is incremented by one before it is used in an expression.
        //int y = ++x;

        //Prefix Decrement (--x):
        //int y = --x;

        //Postfix Increment (x++)                                           The current value of the variable is used in the expression, and then it is incremented by one.
        //int y = x++;

        //Postfix Decrement (x--):
        int y = x--;

        System.out.println("x : "+ x );
        System.out.println("y : "+ y );

    }
}
