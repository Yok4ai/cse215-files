package Lesson11;

import java.util.concurrent.Flow;

public class Flower extends Plant {
    private boolean hasThorn;
    private boolean hasSmell;

    public Flower(){
        super();

    }
    public Flower(String name, String color, boolean hasThorn, boolean hasSmell) {
        super(name, color);
        this.hasThorn = hasThorn;
        this.hasSmell = hasSmell;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "hasThorn=" + hasThorn +
                ", hasSmell=" + hasSmell +
                '}';
    }
}
