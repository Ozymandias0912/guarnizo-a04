import baseline.fileManager;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


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

    @Test
    void createFoldersTest() {

        File html = null;

        //imitating ask() method
        test.setWebsiteName("Google");
        test.setAuthor("Vader");
        test.setCssAnswer("yes");
        test.setJsAnswer("yes");


        try {
            html = test.createFolders();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //checking if the html file was created as expected
        assertFalse( !html.exists());
    }



}
