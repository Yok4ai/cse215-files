package Lesson15;

class InvalidTriangleException extends Exception {
    public InvalidTriangleException(String errorMessage) {
        super(errorMessage);
    }
}
public class Triangle{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) throws InvalidTriangleException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if((this.side1+this.side2) <= side3 || (side2+side3) <= side1 || (side3+side1) <= side2){
            throw new InvalidTriangleException("The sides cannot be allowed");
        }
    }

   /* public double getSide1() {
        return side1;
    }

    public void setSide1(int side1) throws InvalidTriangleException {
        if((this.side1+this.side2) <= side3 || (side2+side3) <= side1 || (side3+side1) <= side2){
            throw new InvalidTriangleException("The sides cannot be allowed");
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(int side2) throws InvalidTriangleException {
        if((this.side1+this.side2) <= side3 || (side2+side3) <= side1 || (side3+side1) <= side2){
            throw new InvalidTriangleException("The sides cannot be allowed");
        }
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(int side3) throws InvalidTriangleException {
        if((this.side1+this.side2) <= side3 || (side2+side3) <= side1 || (side3+side1) <= side2){
            throw new InvalidTriangleException("The sides cannot be allowed");
        }
        this.side3 = side3;
    } */

}
