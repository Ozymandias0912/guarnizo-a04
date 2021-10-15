import baseline.GsonManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GsonManagerTest {
    @Test
    public void parseTest(){
        GsonManager test = new GsonManager();

        test.GsonManager();

        test.parse();

        assertEquals("Widget", test.getProductArrayItem(0));
        assertEquals("Thing", test.getProductArrayItem(1));
        assertEquals("Doodad", test.getProductArrayItem(2));

    }

}
