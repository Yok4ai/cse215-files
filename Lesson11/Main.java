package Lesson11;

public class Main {
    public static void main(String[] args) {
    Plant [] plants = new Plant[5];
    plants[0] = new Flower("Rose","Red",true,true);
    String a = plants[0].toString();
        System.out.println(plants[0].getName());

    }
}
