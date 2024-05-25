package StreamAnymatch;

public class Order {
    private int orderId;
    private double amount;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }
}
