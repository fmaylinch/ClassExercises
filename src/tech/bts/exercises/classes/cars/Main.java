package tech.bts.exercises.classes.cars;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Car("Ferrari GTO");
        Car audi = new Car("Audi A8");

        ferrari.accelerate(100);
        ferrari.decelerate(40);
        ferrari.decelerate(80);

        ferrari.printStatus();
        audi.printStatus();
    }
}
