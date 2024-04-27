package FinalFinallyFinalize;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException | ArithmeticException ex) {
            System.out.println(ex.getClass().getSimpleName());
        }
    }
}
