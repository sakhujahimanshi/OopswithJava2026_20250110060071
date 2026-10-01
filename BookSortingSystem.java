// Case Study 3. Book Sorting System
// A library maintains book details containing book ID, title, and number of pages.
// Requirements:
// •	Sort books by number of pages in ascending order. 
// •	If two books have the same number of pages, sort them by book title alphabetically. 
// •	Use Comparator to perform the sorting. 
// Example:
// 101 Java Basics       150
// 104 Data Structures   150
// 103 Computer Networks 250
// 102 Operating Systems 400

import java.util.*;

class Book {
    private int id;
    private String title;
    private int pages;

    public Book(int id, String title, int pages) {
        this.id = id;
        this.title = title;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', pages=" + pages + "}";
    }
}    

class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getPages() != b2.getPages()) {
            return b1.getPages() - b2.getPages(); // Sorts in ascending order of pages
        }
        return b1.getTitle().compareTo(b2.getTitle()); // If pages are equal, sort by title alphabetically
    }
}


public class BookSortingSystem {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Basics", 150);
        Book b2 = new Book(102, "Operating Systems", 400);
        Book b3 = new Book(103, "Computer Networks", 250);
        Book b4 = new Book(104, "Data Structures", 150);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        Collections.sort(bookList, new BookComparator());
        System.out.println("Sorted book list:");
        for (Book book : bookList) {
            System.out.println(book);
        }                               
    }

}