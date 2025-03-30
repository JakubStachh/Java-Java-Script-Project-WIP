import java.util.List; // Import List
import java.util.ArrayList; // Import ArrayList

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

        Book book = searchBook("Java Programming");
        if (book != null && !book.isCheckedOut()) {
            book.checkout();
            book.displayInfo();
        } else {
            System.out.println("Book is not available.");
        }

        book.returnBook();
        book.displayInfo();
    }
}
