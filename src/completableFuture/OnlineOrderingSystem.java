package completableFuture;

import java.util.concurrent.CompletableFuture;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
        // Task 1: Notify Kitchen Staff
        CompletableFuture<Void> notifyKitchenTask = CompletableFuture.runAsync(() -> {
            // Simulate notifying kitchen staff
            System.out.println("Order notification sent to kitchen staff");
        });

        // Task 2: Send Confirmation Email
        CompletableFuture<Void> sendEmailTask = CompletableFuture.runAsync(() -> {
            // Simulate sending confirmation email
            System.out.println("Confirmation email sent to customer");
        });

        // Wait for all tasks to complete
        CompletableFuture<Void> allTasks = CompletableFuture.allOf(notifyKitchenTask, sendEmailTask);
        allTasks.join();

        System.out.println("Order processing completed");
    }
}
