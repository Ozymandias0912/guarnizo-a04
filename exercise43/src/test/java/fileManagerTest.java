import baseline.fileManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;
import java.io.IOException;

public class fileManagerTest {

    fileManager test = new fileManager();

    @Test//testing constructor
    void constructorTest(){

        test.fileManager();


        assertEquals("cs23", test.getWebsiteName());
        assertEquals("Juan Guarnizo", test.getAuthor());
        assertEquals("maybe", test.getCssAnswer());
        assertEquals("maybe", test.getJsAnswer());


    }

    void createFoldersTest(){

        try {
            test.createFolders();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //assertEquals(); how to do it?

    }



}
