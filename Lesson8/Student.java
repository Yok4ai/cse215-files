package Lesson8;

public class Student extends Person {
    private double cgpa;

    public Student(int id, String name, int age, double cgpa){
        super(id, name, age);
        this.cgpa = cgpa;

    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }



}
