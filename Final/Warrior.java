package Final;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Warrior extends Creature implements Saveable{
    private int dexterity;
    private int agility;

    public Warrior(String name, int health, int power, int dexterity, int agility) {
        super(name, health, power);
        this.dexterity = dexterity;
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Override
    public void attack(Creature creature) {
        Random ran = new Random();
        int random = ran.nextInt(4)+1;
       setHealth((getHealth())-((random*agility)+((3*dexterity)+getPower())));
    }




    @Override
    public void saveToFile(String filePath) {
        try {
            FileWriter fw = new FileWriter(filePath,false);
            PrintWriter printWriter = new PrintWriter(fw);
            String name = this.getName();
            int health = this.getHealth();
            int agility = this.agility;
            int power = this.getPower();
            int dexterity = this.dexterity;

            printWriter.println(name + " " + health + " " + " " + agility + " " + " " + power + " " + dexterity);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("IO error!");
        }

    }

    @Override
    public String toString() {
        return "Warrior{" +
                "dexterity=" + dexterity +
                ", agility=" + agility +
                '}';
    }
}
