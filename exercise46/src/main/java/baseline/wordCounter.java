package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class wordCounter {

    private File doc = new File("data/exercise46_input.txt");
    private ArrayList<word> list = new ArrayList<word>();

    public void countWords(){
        Scanner input = null;
        String temp;
        boolean newWord;
        try {
            input = new Scanner(doc);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(input.hasNext()){
            //check if the word is in the list
            temp = input.next();
            newWord = true;
            word tempStruct = new word();
            for(int i = 0; i < list.size(); i++)
            if(temp.equals(list.get(i).getText())){
                //if it is in the array
                tempStruct.setFrequency(list.get(i).getFrequency() + 1);
                tempStruct.setText(list.get(i).getText());
                list.set(i, tempStruct);

                newWord = false;
                break;
            }
            if(newWord){
                tempStruct.setText(temp);
                tempStruct.setFrequency(1);
                list.add(tempStruct);
            }

        }//no more words in file


    }

    public void display(){
        for (int i = 0; i < list.size(); i++){
            System.out.printf("%-8s: ", list.get(i).getText());
            for(int j = 0; j < list.get(i).getFrequency(); j++){
                System.out.printf("* ");
            }
            System.out.printf("%n");
        }
    }
}
