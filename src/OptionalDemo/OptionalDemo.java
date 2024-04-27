package OptionalDemo;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String str = "follow";
        Optional<String> optionalString = Optional.ofNullable(str);

        if (optionalString.isPresent()) {
            System.out.println("Value is present: " + optionalString.get());
        } else {
            System.out.println("Value is absent");
        }
    }
}
