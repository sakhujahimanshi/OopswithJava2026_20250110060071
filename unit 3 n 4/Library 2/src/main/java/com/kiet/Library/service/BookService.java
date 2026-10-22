package com.kiet.Library.service;

import com.kiet.Library.model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private final List<Book> bookList = new ArrayList<>();

    public BookService() {
        bookList.add(new Book(201, "Effective Java", "Joshua Bloch", "Programming", 2018, true));
        bookList.add(new Book(202, "Clean Code", "Robert C. Martin", "Programming", 2008, true));
        bookList.add(new Book(203, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937, false));
        bookList.add(new Book(204, "Head First Java", "Kathy Sierra", "Programming", 2003, true));
        bookList.add(new Book(205, "Introduction to Algorithms", "Thomas H. Cormen", "Computer Science", 2009, true));
    }

    public List<Book> getAllBooks() { return bookList; }

    public Book getBookById(int bookId) {
        for (Book book : bookList) {
            if (book.getBookId() == bookId) return book;
        }
        return null;
    }

    public Book addBook(Book book) {
        bookList.add(book);
        return book;
    }

    public Book updateBook(int bookId, Book updatedBook) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookId() == bookId) {
                updatedBook.setBookId(bookId);
                bookList.set(i, updatedBook);
                return updatedBook;
            }
        }
        return null;
    }

    public boolean deleteBook(int bookId) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookId() == bookId) {
                bookList.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Book> searchByCategory(String category) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getCategory().equalsIgnoreCase(category)) result.add(book);
        }
        return result;
    }

    public List<Book> findPublishedFromYear(int fromYear) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getPublicationYear() >= fromYear) result.add(book);
        }
        return result;
    }
}