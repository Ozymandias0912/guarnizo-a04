package baseline;

public class product {

    private String name;
    private double price;
    private int quantity;

    public void product(){
        this.name = "Item";
        this.price = 0.00;
        this.quantity = 0;

    }

    public void product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }


}
