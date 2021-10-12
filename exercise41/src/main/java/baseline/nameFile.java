package baseline;


import java.io.*;
import java.util.*;


public class nameFile {

    private File file = new File("data/exercise41_input.txt");
    private List<String> orderedNames = new ArrayList<>();
    private Scanner input;

    void initScanner(){
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getAllNames(){

        while (input.hasNextLine()) {
            orderedNames.add(input.nextLine());
        }
        Collections.sort(orderedNames);
        //print a table with the sorted names
        System.out.printf("Total of %d names %n-----------------%n",orderedNames.size());
        for( int i = 0; i < orderedNames.size() ; i++){
            System.out.printf("%s%n",orderedNames.get(i));
        }



    }


}
