class Book {
    String title, author;
    double price;
    Book() { title = "Unknown"; author = "Unknown"; price = 0; }
    Book(String title) { this(title, "Unknown", 0); }
    Book(String title, String author) { this(title, author, 0); }
    Book(String title, String author, double price) {
        this.title = title; this.author = author; this.price = price;
    }
    void display() {
        System.out.println(title + " | " + author + " | Rs. " + price);
    }
}
public class BookConstructorOverloading {
    public static void main(String[] args) {
        new Book().display();
        new Book("Java Basics").display();
        new Book("Java Basics", "James").display();
        new Book("Java Basics", "James", 450).display();
    }
}
