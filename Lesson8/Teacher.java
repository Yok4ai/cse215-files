package Lesson8;

public class Teacher extends Person {
    private int office;
    private String name;

    public Teacher(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }
}
