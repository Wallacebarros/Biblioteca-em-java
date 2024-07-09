import br.com.biblioteca.classes.Library;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
    protected Library library;

    @Before
    public void before() {
        library = new Library();
    }

    @Test
    public void isVoidTest() {
        Assert.assertTrue(library.isVoid());
    }
}
