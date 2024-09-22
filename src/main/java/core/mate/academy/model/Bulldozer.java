package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String color;
    private String model;

    public Bulldozer(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return "Bulldozer{" + "color='" + color + '\'' + ", model='" + model + '\'' + '}';
    }
}
