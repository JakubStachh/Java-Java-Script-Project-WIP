# 📦 Inventory Management System

## 📜 Overview

The Inventory Management System is a simple Java application designed to track products in an inventory. It allows the user to add products, update their stock levels, and display information about each product. The products are stored in an in-memory map, where each product's details can be accessed and updated.

---

## ✨ Features

- **➕ Add Product**: Add new products to the inventory with details such as name, quantity, and price.
- **🔄 Update Stock**: Modify the quantity of existing products.
- **📊 Display Product Info**: View the details of any product in the inventory.

---

## 🛠 Components

### **Product.java**:
The `Product` class represents an individual product with a name, quantity, and price. It provides methods to update stock and display product information.

```java
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
```
### **InventoryManagementSystem.java:**
Contains the logic for adding products to the inventory, updating stock, and displaying product information.

  - `addProduct(String name, int quantity, double price)`: Adds a new product to the inventory.

  - `getProduct(String name)`: Retrieves a product by name from the inventory.

```java
import java.util.*;

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
        laptop.updateStock(30);  // Update the quantity of the laptop
        laptop.displayInfo();  // Display the updated laptop info

        Product smartphone = getProduct("Smartphone");
        smartphone.displayInfo();  // Display the smartphone info
    }
}
```

---
## ⚙️ How It Works
### ➕ Add Product: You can add new products to the inventory using the addProduct method. Each product has a name, quantity, and price.

```java
addProduct("Laptop", 50, 700.00);
addProduct("Smartphone", 100, 500.00);
```
##
### 🔄 Update Stock: The updateStock method is used to modify the quantity of a specific product. You can either increase or decrease the quantity depending on the argument passed.

```java
laptop.updateStock(30);  // Increase stock by 30 units
```
##
### 📊 Display Product Info: To see the details of a product, simply call the displayInfo method. This will show the product's name, quantity, and price.

```java
laptop.displayInfo();
```
##
### 📝 Example Usage
#### 1. Adding Products:
  - Laptop with quantity `50` and price `$700.00`.

  - Smartphone with quantity `100` and price `$500.00`.
##
#### 2. Update Stock:
  - After adding products, you can update the stock of the laptop by adding `30` more units:

```java
laptop.updateStock(30);
```
##
#### 3. Display Product Info:
  - The updated information for the Laptop and Smartphone will be printed:

```yaml
Product: Laptop
Quantity: 80
Price: 700.0

Product: Smartphone
Quantity: 100
Price: 500.0
```
