package Java.Chapter_1;

public class b_Book {

    static int totalNoofBooks;

    String author;

    String title;

    String isbn;

    boolean isBorrowed;

    static {
        totalNoofBooks = 0;
    }

    {   // Object Init
        totalNoofBooks++;
    }

    b_Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    b_Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoofBooks;
    }

    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the Book");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed, please leave a review");
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        b_Book designOfThings = new b_Book("1", "Design", "Author");
        b_Book myBook = new b_Book("2");
        System.out.println(b_Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.returnBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}
