package Java.Chapter_1;

public class a_Driver {
    static int minAgeForDriving;    // static variable

    String name;

    int age;

    String dateOfLicense;

    static String diverName() {     // static methods
        String k;
        return k="sushant";
    }

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }
    public static void main(String[] args) {
//        a_Car myCar = new a_Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(6);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

            a_Car swift = new a_Car("red");
            swift.addFuel(6);
//          a_Car startedCar = swift.start();
//          startedCar.drive();
            swift.start().drive();
            System.out.println(swift.color);

            a_Driver myDriver = new a_Driver();
            myDriver.age=24;
            myDriver.dateOfLicense = "1/Jan?2024";
            System.out.println(minAgeForDriving);
            System.out.println(a_Driver.diverName());
    }
}
