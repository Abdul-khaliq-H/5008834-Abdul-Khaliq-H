package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> books;

    public LibraryManagementSystem() {
        books = new ArrayList<>();
    }

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
    }

    // Linear search to find books by title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search to find books by title (assuming the list is sorted)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books.get(mid).getTitle().compareToIgnoreCase(title);

            if (cmp == 0) {
                return books.get(mid);
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        Book book1 = new Book(1, "The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book(3, "1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Sorting the books by title for binary search
        library.books.sort(Comparator.comparing(Book::getTitle));

        System.out.println("Linear search for '1984':");
        System.out.println(library.linearSearchByTitle("1984"));

        System.out.println("Binary search for '1984':");
        System.out.println(library.binarySearchByTitle("1984"));
    }
}

// Output:
// Linear search for '1984':
// Book{bookId=3, title='1984', author='George Orwell'}
// Binary search for '1984':
// Book{bookId=3, title='1984', author='George Orwell'}