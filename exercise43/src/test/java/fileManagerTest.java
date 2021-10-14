import baseline.fileManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;

public class fileManagerTest {

    @Test
    void constructorTest(){
        fileManager test = new fileManager();
        test.fileManager();

        //test constructor
        assertEquals("cs23", test.getWebsiteName());
        assertEquals("Juan Guarnizo", test.getAuthor());
        assertEquals("maybe", test.getCssAnswer());
        assertEquals("maybe", test.getJsAnswer());


    }



}
