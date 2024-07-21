import br.com.biblioteca.classes.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("Book 1", "author 1", 20);
    }

    @Test
    public void pagesReadVoid() {
        Assert.assertEquals(0, book.showReadProgres());
    }

    @Test
    public void increment() {
        book.increment(4);
        Assert.assertEquals(4, book.showReadProgres());
    }
}
