package Lesson41122;

public class Triangle extends Polygon {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(int numSide, double sideA, double sideB, double sideC) {
        super(numSide);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double s = (this.sideA+this.sideB+this.sideC)/2;
        double A = Math.sqrt(s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC));
        return A;
    }

    @Override
    public double perimeter() {
        double p = this.sideA + this.sideB + this.sideC;
        return p;
    }
}
