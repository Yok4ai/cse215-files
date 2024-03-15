package Quiz2;

public class Chicken extends Animal implements Edible{
    private String breed;

    public Chicken(String name, float weight, char gender, String breed) {
        super(name, weight, gender);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String sound() {
        return "Kock-a-doodle-do";
    }

    public String howToEat(){
        return "Fry/Boil. Eat";
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
