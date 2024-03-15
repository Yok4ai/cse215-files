package Final;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior("Gundyr", 100, 50, 70, 90);
        Mage m = new Mage("Vendrick", 100, 120, 200, 70);

        w.attack(m);
        m.attack(w);

        w.saveToFile("warrior.txt");
        m.saveToFile("mage.txt");
    }
}
