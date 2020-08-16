<<<<<<< HEAD

/**
 * Ontefetse Ditsele
 * 13 August 2020
 * 
 * A Customer class: To add orders and return the
 */
import java.util.ArrayList;

public class Customer extends Person{
    private ArrayList<Dish> Order;
    private String address;

    public Customer(String name, String surname, String phone_num,String location, double cash) {
        super(name, surname, phone_num, cash);
        Order = new ArrayList<Dish>();
        this.address = location;
    }

    //################################################################
    public void addDish(Dish d){
        Order.add(d);
    }
    public void displayOrder(){
        int n = 1;
        for (Dish d: Order){
            System.out.println(n+". -  "+ d);
            n++;
        }
    }
    public ArrayList<Dish> getOrder(){
        return Order;
    }
    public void removeDish(int index){
        Order.remove(index);
    }
    //###########################################################
    public String getAddress(){
        return this.address;
    }
    @Override
    public String toString(){
        return super.toString() + " I am a Customer.";
    }    
}
=======
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

>>>>>>> origin/master
