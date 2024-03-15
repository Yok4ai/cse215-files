package Final;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Mage extends Creature implements Saveable{
    private int intelligence;
    private int mana;

    public Mage(String name, int health, int power, int intelligence, int mana) {
        super(name, health, power);
        this.intelligence = intelligence;
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void attack(Creature creature) {
        Random ran = new Random();
        int random = ran.nextInt(4)+1;
        if(mana>=50){
        setHealth(getHealth()-(random*(7*this.intelligence)));
    }
        else if(mana<50){
            setHealth(getHealth()-(random*(10*this.intelligence)));
        }
    }


    @Override
    public void saveToFile(String filePath) {
        try {
            FileWriter fw = new FileWriter(filePath,false);
            PrintWriter printWriter = new PrintWriter(fw);
            String name = this.getName();
            int health = this.getHealth();
            int intelligence = this.intelligence;
            int power = this.getPower();
            int mana = this.mana;

            printWriter.println(name + " " + health + " " + intelligence + " " + power + " " + mana);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("IO error!");
        }

    }

    @Override
    public String toString() {
        return "Mage{" +
                "intelligence=" + intelligence +
                ", mana=" + mana +
                '}';
    }
}
