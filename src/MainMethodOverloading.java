

public class MainMethodOverloading {

    public static void main(String... args) {
        System.out.println
                ("Main method with String[] args");
    }

    public static void main() {
        System.out.println
                ("Main method without arguments");
    }

    public static void main(int x) {
        System.out.println
                ("Main method with int argument: " + x);
    }
}
