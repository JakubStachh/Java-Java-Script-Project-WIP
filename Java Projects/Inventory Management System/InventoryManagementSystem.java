import java.util.*;

class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void updateStock(int quantity) {
        this.quantity += quantity;
    }

    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }
}

public class InventoryManagementSystem {
    private static Map<String, Product> inventory = new HashMap<>();

    public static void addProduct(String name, int quantity, double price) {
        inventory.put(name, new Product(name, quantity, price));
    }

    public static Product getProduct(String name) {
        return inventory.get(name);
    }

    public static void main(String[] args) {
        addProduct("Laptop", 50, 700.00);
        addProduct("Smartphone", 100, 500.00);

        Product laptop = getProduct("Laptop");
        laptop.updateStock(30);
        laptop.displayInfo();

        Product smartphone = getProduct("Smartphone");
        smartphone.displayInfo();
    }
}
