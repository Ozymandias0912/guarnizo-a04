import baseline.reader;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class readerTest {

    reader test = new reader();

    //testing readFile method
    @Test
    void readFileTest(){
        test.readFile();

        String[] expectedNames = new String[]{
                "Mai",
                "Jim",
                "Aaron",
                "Chris",
                "Geoffrey",
                "Fong",
                "Sabrina"
        };

        for(int i = 0; i < test.getSizeArray(); i++){

            assertEquals(expectedNames[i],test.getFirstName(i) );
        }

        String[] expectedLastNames = new String[]{
                "Ling",
                "Johnson",
                "Jones",
                "Jones",
                "Swift",
                "Xiong",
                "Zarnecki"
        };

        for(int i = 0; i < test.getSizeArray(); i++){

            assertEquals(expectedLastNames[i],test.getLastName(i) );
        }

        int[] expectedSalaries = new int[]{
                55900,
                56500,
                46000,
                34500,
                14200,
                65000,
                51500
        };

        for(int i = 0; i < test.getSizeArray(); i++){

            assertEquals(expectedSalaries[i],test.getSalary(i) );
        }

    }


}
