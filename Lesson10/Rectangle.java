package Lesson10;

public class Rectangle extends Shape {
    private float side1;
    private float side2;

    public Rectangle(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    @Override
    public float getArea() {
        return side1*side2;
    }
}
