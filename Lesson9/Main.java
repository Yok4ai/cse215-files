package Lesson9;

import Lesson9.Faculty;

public class Main {
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        f1.setId("6");
        f1.setName("John");
        Faculty f2 = new Faculty("David","Male",25,"21055442","Engineering",150000,"DvB","Senior Developer");
        Person p1 = new Person();

        System.out.println(f1.getName());
        System.out.println(f2);

    }
}
