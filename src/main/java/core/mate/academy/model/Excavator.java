package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String color;
    private String name;

    public Excavator(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String toString() {
        return "Excavator{" + "color='" + color + '\'' + ", name='" + name + '\'' + '}';
    }
}
