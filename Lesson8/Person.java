package Lesson8;

public class Person {
    private String name;
    private int id;
    private int age;

    public Person(){

    }

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    }


