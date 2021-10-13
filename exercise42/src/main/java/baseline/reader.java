package baseline;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class reader {

    private ArrayList<String> firstNames = new ArrayList<>();
    private ArrayList<String> lastNames = new ArrayList<>();
    private ArrayList<String> salaries = new ArrayList<>();
    private ArrayList<Integer> parsedSalaries = new ArrayList<>();
    private File file = new File("data/exercise42_input.txt");
    private Scanner input;

    //write constructor good practice
    public void reader(){
        //set the variables to something
        firstNames.clear();
        lastNames.clear();
        salaries.clear();
        parsedSalaries.clear();

        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    //write get methods
    public String getFirstName(int index){
        return firstNames.get(index);
    }

    public String getLastName(int index){
        return lastNames.get(index);
    }

    public int getSalary(int index){
        return parsedSalaries.get(index);
    }

    public int getSizeArray(){
        return salaries.size();
    }



    public void readFile() {
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        while(input.hasNext()){
                input.useDelimiter(",");
                lastNames.add(input.next());
                firstNames.add(input.next());
                input.skip(",");
                salaries.add(input.nextLine());//reading the salaries into a String Array


        }



        for(int i = 0; i < salaries.size(); i++){
            parsedSalaries.add(Integer.parseInt(salaries.get(i)));
        }//parsing the salaries into integers





    }







    public void printArrays(){
        System.out.printf("%-10s %-10s %-10s %n", "Last", "First", "Salary");
        System.out.printf("------------------------------------%n");

        for(int i = 0; i < firstNames.size(); i++){
            System.out.printf("%-10s %-10s %d%n", lastNames.get(i), firstNames.get(i), parsedSalaries.get(i));
        }
    }

}
