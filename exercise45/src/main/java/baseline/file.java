package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class file {

    private File f;
    private Scanner input = new Scanner(System.in);




    public void askInput(){

        System.out.println("What is the name of the file?");
        String nameFile = "data/" + input.next();
        f = new File(nameFile);
        try {
            input = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public String replace(){
        String newContent;
        input.useDelimiter("utilize");

        newContent = input.next();
        while(input.hasNext()){
            newContent = newContent + "use" + input.next();
        }

        return newContent;
    }

    public void output(String newContent){
        //create path object with the directory desired
        Path path = Path.of("data/output.txt");
        //create file using that path
        try {
            path = Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //write to the file using the path and the string you want to write
        try {
            Files.writeString(path, newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //methods used for testing
    public void askInput(String path){
        f = new File(path);
    }

    public void setInput(){
        try {
            input = new Scanner(this.f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}

