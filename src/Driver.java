public class Driver extends Person {
    Bike bike; 
    String licenseID;
    
    Driver(Bike bike, String licenseID, String name, String surname,String phone_number, int cash){
        super(name,surname,phone_number,cash);
        this.bike = bike;
        this.licenseID = licenseID;    
    }

    //getters and setters
    public void setBike(Bike newBike){this.car = newCar;}

    public void setlicenseID(String newLicenseID){this.licenseID = newLicenseID;}

    public Car getBike(){return this.bike;}

    public String getlicenseID(){return  this.licenseID;}
    public String toString(){return super.toString() + " and I am your food delivery driver";}
}