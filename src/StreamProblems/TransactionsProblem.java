package StreamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionsProblem {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("P1", "Electronics", 1000),
                new Transaction("P2", "Books", 500),
                new Transaction("P3", "Electronics", 800),
                new Transaction("P4", "Clothing", 1200),
                new Transaction("P5", "Books", 600)
        );

        Map<String, Integer> totalSalesByCategory = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCategory,
                        Collectors.summingInt(Transaction::getAmount)));

        System.out.println("Total sales by category: " + totalSalesByCategory);
    }

    static class Transaction {
        private String productId;
        private String category;
        private int amount;

        public Transaction(String productId, String category, int amount) {
            this.productId = productId;
            this.category = category;
            this.amount = amount;
        }

        public String getCategory() {
            return category;
        }

        public int getAmount() {
            return amount;
        }
    }
}
