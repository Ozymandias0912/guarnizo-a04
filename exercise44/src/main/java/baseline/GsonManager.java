package baseline;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GsonManager {

    private Gson gson = new Gson();
    private File f = new File("data/exercise44_input.json");
    private String jsonArray;
    private product[] productArray;

    public void GsonManager(){

        this.jsonArray = " ";

    }

    public String ask(){
        String productName;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the product name?");
        productName = input.next();

        return productName;

    }

    public void productSearch(String productName){
        int i = 0;
        Scanner input = new Scanner(System.in);

        //read file and save info into string json array
        try {
            input = new Scanner(f);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        input.nextLine();//reading the first bracket
        input.useDelimiter(":");
        input.next();
        input.useDelimiter("");
        input.next();//reading up until ":"
        input.useDelimiter("]");
        jsonArray = input.next();//reading the json array
        jsonArray = jsonArray + "]";
        productArray = gson.fromJson(jsonArray, product[].class);
        //successful parsing!



        //do this in a for loop key times
        for( i = 0; i < productArray.length; i++){
            //compare name of product with input string
            if(productName.equals(productArray[i].getName())){

                //print the temporary object's price and quantity
                System.out.printf("Name: %s%n", productArray[i].getName());
                System.out.printf("Price: %.2f%n", productArray[i].getPrice());
                System.out.printf("Quantity: %d%n", productArray[i].getQuantity());
                System.exit(0);
            }


        }//end for loop
        System.out.println("Sorry, that product was not found in our inventory.");
        this.productSearch(this.ask());


    }//end productSearch() method



}
