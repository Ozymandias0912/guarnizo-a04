package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nameFileTest {

    @Test
    void getAllNames() {
        //Check if list is sorted
        nameFile names = new nameFile();
        names.initScanner();
        names.getAllNames();

        assertEquals("Johnson, Jim", names.orderedNames.get(0) );
        assertEquals("Jones, Aaron", names.orderedNames.get(1));
        assertEquals("Jones, Chris", names.orderedNames.get(2));
        assertEquals("Ling, Mai", names.orderedNames.get(3));
        assertEquals("Zarnecki, Sabrina", names.orderedNames.get(names.orderedNames.size() - 1));

    }
}