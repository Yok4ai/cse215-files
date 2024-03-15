package Assignment3;

public class Main {
    public static void main(String[] args) {
        //create fractions
        Fraction f1 = new Fraction(12,18);
        Fraction f2 = new Fraction(20,25);

        Fraction addition = f1.add(f2);
        Fraction subtract = f1.sub(f2);
        Fraction multiply = f1.multiplication(f2);
        Fraction divide = f1.division(f2);

        //print fraction operations
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + divide);

        //create points
        Point p1 = new Point(3,4);
        Point p2 = new Point(7,8);
        Point p3 = new Point(3,6);
        Point p4 = new Point(5,9);

        //create line 1
        Line l1 = new Line(p1,p2);
        //create line 2 using line constructor 2
        Line l2 = new Line(3,6,5,9);

        double length1 = l1.length(p1,p2);
        double length2 = l2.length(p3,p4);
        System.out.println("Length 1: " + length1 + " Units");
        System.out.println("Length 1: " + length2 + " Units");
    }
}
