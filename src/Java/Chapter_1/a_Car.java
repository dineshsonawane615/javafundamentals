package Java.Chapter_1;

public class a_Car {

    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    // Default constructor
//    a_Car() {
//        noOfWheels = 5;
//        color = "red";
//        maxSpeed = 160;
//        currentFuelInLiters = 2;
//        noOfSeats = 5;
//    }

    // Parametrize Constructor
    a_Car(String color) {
        noOfWheels = 5;
        this.color = color;
        maxSpeed = 160;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    static {
        System.out.println("Static initialization");        // static Block
    }

    public a_Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel, can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved Mode, please refuel");
        } else {
            System.out.println("Car is started... bruhhh......");
        }
        return this;
    }
    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");
            currentFuelInLiters--;
    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
}
