package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nameFileTest {

    @Test
    void getAllNames() {
        //Check if list is sorted
        nameFile names = new nameFile();

        names.getAllNames();

        assertEquals(names.orderedNames.get(0),"Johnson, Jim" );
        assertEquals(names.orderedNames.get(names.orderedNames.size() - 1),"Zarnecki, Sabrina");

    }
}