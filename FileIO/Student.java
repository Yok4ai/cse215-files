package FileIO;

public class Student {
    private double CGPA;
    private String name;

    public Student(String name, double CGPA) {
        this.name = name;
        this.CGPA = CGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "CGPA=" + CGPA +
                ", name='" + name + '\'' +
                '}';
    }
}
