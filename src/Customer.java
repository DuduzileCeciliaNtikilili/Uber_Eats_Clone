public class Customer extends Person {

    private String address;
    ArrayList<Dish> dish = new ArrayList<Dish>();

    Customer(String name, String surname, String phone_number, double cash,String address) {
        super(name,surname,phone_number, cash); 
        this.address = address;

    }

    public void removeItem(Dish d){
        cart.remove(d);
    }

    public void addItem(Dish d){
        cart.add(d);
    }

    public String displayOrder(){
        return getOrder();
    }
    public Dish getOrder(){return dish;}



    //Setters
    
    public void setAddress(String address) {
        this.address = address;

    }

    public String getAddress(){
        return address;

    }

    public String toString(){
        return super.toString() + " and I am a Customer";
    }   

}