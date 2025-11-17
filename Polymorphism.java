class Vehicle {


 (Compile-Time Polymorphism)

    void info() {

        System.out.println("This is a vehicle");

    }


    void info(String brand) {

        System.out.println("Brand: " + brand);

    }


    void info(String brand, int year, String color, String transmission, String gas) {

        System.out.println("Brand: " + brand + ", Year: " + year + ", Color: " + color + ", Transmission: " + transmission + ", Gas: " + gas);

    }



    void speed() {

        System.out.println("Vehicle has an average speed.");

    }

}


 

class Car extends Vehicle {

    @Override

    void speed() {

        System.out.println("Car runs at 160 km/h.");

    }

}



class Motorcycle extends Vehicle {

    @Override

    void speed() {

        System.out.println("Motorcycle runs at 110 km/h.");

    }

}


public class Main {

    public static void main(String[] args) {


        Vehicle v;



        v = new Car();

        v.info();

        v.info("Toyota");

        v.info("Toyota", 2024, "Blue", "Manual", "Unleaded");

        v.speed();


        System.out.println();


        v = new Motorcycle();

        v.info();

        v.info("Honda");

        v.info("Honda", 2020, "Pink", "Automatic", "Unleaded");

        v.speed();

    }

}
