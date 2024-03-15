package Lesson15;

public class Main {
    public static void main(String[] args) {
        try {
            Triangle t1 = new Triangle(1, 2, 3);

        } catch (InvalidTriangleException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
