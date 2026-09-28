import java.util.*;
public class car {
    private String model;
    private int speed;
    public car(String model) {
        this.model = model;
        this.speed = 0;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getSpeed() {
        return speed;
    }
    public void accelerate(int acceleration) {
        if (acceleration > 0) {
            speed += acceleration;
            System.out.println(model + " is accelerating. Current speed: " + speed + " km/h");
        } else {
            System.out.println("Acceleration should be a positive value.");
        }
    }
}
public class main {
    public static void main(String[] args) {
        car myCar = new car("Toyota");
        System.out.println("Initial speed: " + myCar.getSpeed() + " km/h");
        myCar.accelerate(20);
        System.out.println("Updated speed: " + myCar.getSpeed() + " km/h");
    }
}