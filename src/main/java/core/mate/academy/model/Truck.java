package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String color;
    private String name;

    public Truck(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{" + "color='" + color + '\'' + ", name='" + name + '\'' + '}';
    }
}
