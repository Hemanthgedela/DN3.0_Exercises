import java.util.Arrays;

public class LibraryManagementSystem {
    private Book[] books;

    public LibraryManagementSystem(Book[] books) {
        this.books = books;
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Rich", "Poor"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "2004", "George Orwell"),
            new Book(4, "Moby Dick", "Herman Melville"),
            new Book(5, "Harry", "Potter")
        };

        Arrays.sort(books, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));

        LibraryManagementSystem system = new LibraryManagementSystem(books);

        String titleToSearch = "2004";

        System.out.println("Searching using Linear Search:");
        Book foundBook = system.linearSearchByTitle(titleToSearch);
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nSearching using Binary Search:");
        foundBook = system.binarySearchByTitle(titleToSearch);
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
