package baseline;

import com.google.gson.Gson;

import java.io.File;

public class GsonManager {

    private Gson gson = new Gson();
    private File f = new File("data/exercise44_input.json");
    private String jsonArray;
    private product[] productArray;

    public void GsonManager(){
        //gson object ?
        //file object?
        this.jsonArray = "null";
        this.productArray = new product[100];

        for(int i = 0; i < 100; i++){
            this.productArray[i] = new product();
        }

    }

    public void productSearch(String productName){

        //do these in a while loop:
            //save on a string the info on the json file for one product

            //take that string as input for the fromJson() and save the info into the array
        //break while loop


        //create a product temporary object

        //do this in a for loop until the name of the product is Item
            //compare name of product with input string
                //if it is the input then copy its info to the temporary product object
        //end for loop

        //print the temporary object's price and quantity

        
    }



}
