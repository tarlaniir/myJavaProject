package school.lesson9;

import java.util.ArrayList;

public class Payment {
    private ArrayList<PurchaseItem> items;

    public Payment() {
        items = new ArrayList<>();
    }


    public class PurchaseItem {
        private String productName;
        private double price;
        private int quantity;

        public PurchaseItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double getTotalPrice() {
            return price * quantity;
        }

        @Override
        public String toString() {
            return productName + " x" + quantity + " = " + getTotalPrice();
        }
    }


    public void addItem(String productName, double price, int quantity) {
        items.add(new PurchaseItem(productName, price, quantity));
    }


    public double getTotalCost() {
        double total = 0;
        for (PurchaseItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("Чек:");
        for (PurchaseItem item : items) {
            System.out.println(item);
        }
        System.out.println("Общая сумма: " + getTotalCost());
    }
}
