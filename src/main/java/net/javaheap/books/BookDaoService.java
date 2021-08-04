package net.javaheap.books;

import java.util.ArrayList;
import java.util.List;

public class BookDaoService {

    private int bookCount = 3;
    public static List<Book> books = new ArrayList<Book>();

    static {
        books.add(new Book(1, "learning Spring", "Spring for beginners"));
        books.add(new Book(2, "learning Java", "Java for beginners"));
        books.add(new Book(3, "learning Hibernate", "Hibernate for beginners"));
    }

    //findOne
    public Book findOne(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    //findAll

    public List<Book> findAll() {
        return books;
    }
    //saveBook

    public Book save(Book book) {
        if(book.getId()==null) {
            book.setId(++bookCount);
        }
        books.add(book);
        return book;
    }
}
