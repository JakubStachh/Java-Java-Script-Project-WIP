# 📚 Library Management System

## 📜 Overview

The Library Management System allows you to manage a collection of books. It provides basic functionalities like:
- **Adding Books** to the catalog.
- **Searching Books** by title.
- **Checking Out** and **Returning** books.
- Displaying book information including whether it is checked out.

---

## ✨ Features

- **➕ Add Book**: Allows the user to add new books to the library catalog.
- **🔍 Search Book**: Search for a book by title.
- **🔑 Checkout/Return Book**: Check out a book if it's available, or return a book after it's been borrowed.
- **📖 Display Book Info**: View information about the book such as its title, author, and checked-out status.

---

## 🛠 Components

### **Book.java**:
The `Book` class represents an individual book with a title, author, and a boolean indicating whether it's checked out. It provides methods for checking out, returning, and displaying information about the book.

```java
class Book {
    private String title;
    private String author;
    private boolean isCheckedOut;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public void checkout() {
        isCheckedOut = true;
    }

    public void returnBook() {
        isCheckedOut = false;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Checked Out: " + (isCheckedOut ? "Yes" : "No"));
    }
}
```
##
### LibraryManagementSystem.java:
- The `LibraryManagementSystem` class manages a collection of books using an `ArrayList`. It provides methods to add books, search for books, and handle checkout and return operations.

```java
import java.util.List; // Import List
import java.util.ArrayList; // Import ArrayList

public class LibraryManagementSystem {
    private static List<Book> catalog = new ArrayList<>(); // Use List & ArrayList correctly

    public static void addBook(String title, String author) {
        catalog.add(new Book(title, author));
    }

    public static Book searchBook(String title) {
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        addBook("Java Programming", "James Gosling");
        addBook("Effective Java", "Joshua Bloch");

        // Checkout Book
        Book book = searchBook("Java Programming");
        if (book != null && !book.isCheckedOut()) {
            book.checkout();
            book.displayInfo();
        } else {
            System.out.println("Book is not available.");
        }

        // Return Book
        book.returnBook();
        book.displayInfo();
    }
}
```

---
## ⚙️ How It Works
### ➕ Add Book: 
Books can be added using the addBook method, where you specify the title and the author of the book.

```java
addBook("Java Programming", "James Gosling");
addBook("Effective Java", "Joshua Bloch");
```
##
### 🔍 Search Book: 
You can search for a book by its title using the searchBook method. The method returns the Book object if the title matches.

```java
Book book = searchBook("Java Programming");
```
##
### 🔑 Checkout Book: 
If the book is available (not checked out), you can use the checkout method to mark it as checked out. This will display the updated book status.

```java
book.checkout();
book.displayInfo();  // Check the status
```
##
### 📖 Return Book: 
When done, the book can be returned using the returnBook method, and its status will be updated.

```java
book.returnBook();
book.displayInfo();  // Display the returned status
```

---
## 📝 Example Usage
### 1. Adding Books:
   - Java Programming by James Gosling

   - Effective Java by Joshua Bloch

### 2. Checking Out a Book:
   - When you search for "Java Programming", the book is checked out and the status is displayed as Checked Out: Yes.

### 3. Returning a Book:
   - After returning the book, the status will be displayed as Checked Out: No
