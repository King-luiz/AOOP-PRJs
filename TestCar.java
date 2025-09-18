// Car class definition
class Car {
    String brand; // Instance field
    int speed;    // Instance field

    // Instance initializer block
    {
        speed = 50;
    }

    // Constructor
    Car(String b) {
        brand = b;
    }

    // Method to display car details
    void display() {
        System.out.println(brand + " starts at speed " + speed);
    }
}

// Main class
public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota");
        Car c2 = new Car("Honda");

        c1.display();
        c2.display();
    }
}
