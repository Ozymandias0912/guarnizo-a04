package baseline;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class nameFile {

    private String name = null;
    private int numberOfNames = 0;
    File file = new File("data/exercise41_input.txt");
    Scanner input = new Scanner(file);




    public nameFile() throws FileNotFoundException {

        name = "Juan";
        //numberOfNames++;

    }

    //nameFile object = new nameFile();

    //public void getName(){
    //    System.out.printf("%s%n", name);
    //}

    public void getAllNames(){
        //create an array that can fit 100 names
        String[] lines = new String[100];
        int i = 0;
        //read every name in the file and save it into the array
        //also, count the number of names
        while (input.hasNextLine()) {
            lines[i] = (input.nextLine());
            numberOfNames++;
            i++;
        }
        //create another array with the appropriate size
        String[] orderedNames = new String[numberOfNames];
        //copy the names into the new, probably smaller, array
        for(i = 0; i < numberOfNames; i++){
            orderedNames[i] = lines[i];
        }
        //sort the array
        Arrays.sort(orderedNames);
        //print a table with the sorted names
        System.out.printf("Total of %d names %n-----------------%n", numberOfNames);
        for( i = 0; i < numberOfNames ; i++)
        System.out.printf("%s%n",orderedNames[i]);


    }


}
