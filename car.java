public class Car {
    private Engine engine;

    // Constructor to initialize Car with an Engine
    public Car() {
        this.engine = new Engine();
    }

    // Method to start the car
    public void startCar() {
        System.out.println("Car is starting...");
        engine.startEngine();  // Calling the Engine's method
    }

    // Method to drive the car
    public void drive() {
        System.out.println("Car is driving...");
    }
}
