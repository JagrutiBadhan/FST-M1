package Package_Activities;

public class Car {
    //Variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    //Constructor
    Car(){
        tyres=4;
        doors=4;
    }

    /* methods */
    public void displayCharacteristics(){
        System.out.println("Color of the car is: "+color);
        System.out.println("Transmission of the car is: "+transmission);
        System.out.println("Make of the car is: "+make);
        System.out.println("No of Tyres in the car: "+tyres);
        System.out.println("No of Doors in the car: "+doors);
    }

    public void accelerate(){
        System.out.println("Car is moving forward.");
    }
    public void brake(){
        System.out.println("Car has stopped.");
    }

}
