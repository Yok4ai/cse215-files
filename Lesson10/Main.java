package Lesson10;

public class Main {

    /*public static float findArea(Object o){
        if(o instanceof Rectangle){
            return ((Rectangle) o).getSide1()*((Rectangle) o).getSide2();
        }
        else if(o instanceof Square){
            return ((Square) o).getSide()*((Square) o).getSide();
        }
        else if(o instanceof Circle){
            return (float) (Math.PI*Math.pow(((Circle) o).getRadius(),2));
        }
        else {
            return 0.0f;
        }
    } */

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.1f,4.2f);
        Circle c1 = new Circle(3.7f);
        Square s1 = new Square(6f);

        System.out.println(r1.getArea());



        }
    public static void isPermissible(Shape s){

    }
}
