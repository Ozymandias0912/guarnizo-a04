import baseline.file;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class fileTest {

    @Test
    public void replaceTest() {
        file test = new file();

        test.askInput("data/exercise45_input.txt");

        test.setInput();

        assertEquals("One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".", test.replace());
    }
}//the test will "fail" but if you click on <Click to see the difference> you will see they are the same output.
//iT only differs on the line separators
