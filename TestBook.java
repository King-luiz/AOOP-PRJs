// Book class definition
class Book {
    // Instance fields
    String title;
    String author;
    double price;

    // Static field to count books
    static int bookCount = 0;

    // Constructor to initialize book details
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++; // Increases count whenever a new book is created
    }

    // Instance method to display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    // Static method to get total number of books created
    static int getBookCount() {
        return bookCount;
    }
}

// Main class
public class TestBook {
    public static void main(String[] args) {
        //  3 book objects
        Book b1 = new Book("Java Programming", "James Gosling", 45.50);
        Book b2 = new Book("Effective Java", "Joshua Bloch", 55.75);
        Book b3 = new Book("Clean Code", "Robert C. Martin", 60.00);
        Book b4 = new Book("Luiz Codes", "Lewins M. Lui10", 100.00);


        // Display details
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
        b4.displayBook();


        // Printing total book count
        System.out.println("Total number of books created: " + Book.getBookCount());
    }
}
