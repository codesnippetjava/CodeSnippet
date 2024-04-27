package Multicatch;

public class MultiCatch {
    public static void main(String[] args) {
        try{
            int a[] = new int [5];
            a[5]= 30;
        }catch (ArithmeticException
                | ArrayIndexOutOfBoundsException e){
            System.out.println("ArithmeticException");
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
