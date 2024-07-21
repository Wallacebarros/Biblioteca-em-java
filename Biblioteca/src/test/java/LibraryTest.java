import br.com.biblioteca.classes.Book;
import br.com.biblioteca.classes.Library;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class LibraryTest {
    private Library library;
    private Book book1, book2;

    @Before
    public void before() {
        library = new Library();
        book1 = new Book("Book 1", "Author 1", 150);
        book2 = new Book("Book 2", "Author 2", 200);
    }

    @Test
    public void isVoidTest() {
        Assert.assertTrue(library.isVoid());
    }

    @Test
    public void addBook() {
        library.addBook(book1);
        Assert.assertFalse(library.isVoid());
    }

    @Test
    public void deletBook() {
        library.addBook(book1);
        library.deletBook(book1);
        Assert.assertTrue(library.isVoid());
    }

    @Test
    public void totalBooks() {
        library.addBook(book1);
        library.addBook(book2);
        Assert.assertEquals(2, library.totalBooks());
    }

    @Test
    public void findAllBooks() {
        library.addBook(book1);
        library.addBook(book2);
        ArrayList<Book> a = new ArrayList<>(20);
        a.add(book1);
        a.add(book2);
        Assert.assertEquals(a, library.findAllBooks());
    }
}
