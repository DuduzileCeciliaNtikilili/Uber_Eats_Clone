import java.util.*;
public class Customer extends Person {
    
    public static void main(String args[]){
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Signituredish1");
        alist.add("Signaturedish2");
        alist.add("Signaturedish3");
        
        // diplaying elements
        System.out.println(alist);

        //removing "dish"
        alist.remove("Dish");

        //this will add "order/basket" at the end of list
        alist.add("oder/basket");

        //display elements
        System.out.println(alist);

    }
    //instance variables
    String address;

    //constructor
    Customer(String address, String name, String surname,String phone_number, double cash){
        super(name,surname,phone_number, cash) {
        this.address = address;
    }

    //methods

    public void setAddress(String address){
        this.address  = address;
    }

    public String getaddress() {
        return this.address;
    }

    public void setOrder(String oder){
        this.order = order;

    }
    
    public String getDish() {
        return this.dish;

    }

    public String toString(){
        return super.toString() + " and I am a customer";

    }

