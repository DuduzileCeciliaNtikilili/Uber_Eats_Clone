
public class Customer extends Person {

    String email;
    String address;

    Customer(String email, String name, String surname,String phone_number, double cash,String address){
        super(name,surname,phone_number, cash); 
        this.email = email;
        this.address = address;
    }

    public void Pay(double cash){
        if(order == "placed"){ //once order placed from the app , don't know how the order is placed from persob working on the main app
            cash -= getCost; //we subtract customer cash that way they payed
        }
    } 

    public void setEmail(String newEmail){this.email  = newEmail;}

    public void setAddress(String newAddress){this.address = newAddress;}

    public String getEmail() {return this.email;}

    public String getAddress(){return this.address}

    public String toString(){
        return super.toString() + " and I am a customer";
    }   

}