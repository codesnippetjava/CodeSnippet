package StreamAnymatch;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(1, 250.0),
                new Order(2, 450.0),
                new Order(3, 150.0),
                new Order(4, 350.0),
                new Order(5, 50.0)
        );

        double highValueThreshold = 400.0;

        boolean hasHighValueOrder = orders.stream()
                .anyMatch(order -> order.getAmount() > highValueThreshold);

        if (hasHighValueOrder) {
            System.out.println
                    ("There is at least one high-value order.");
        } else {
            System.out.println
                    ("There are no high-value orders.");
        }
    }
}
