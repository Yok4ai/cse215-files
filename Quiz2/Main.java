package Quiz2;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Chicken("Chicken1",2, 'M', "Deshi");
        Animal a2 = new Chicken("Chicken2",3, 'M', "Broiler");

        Apple ap1 = new Apple("Green");
        Apple ap2 = new Apple("Red");


       Edible [] list = new Edible[4];
       list[0] = (Edible) a1;
        list[1] = (Edible) a2;
        list[2] = ap1;
        list[3] = ap2;

        for(int i=0; i<4; i++){
            System.out.println(list[i].howToEat());
        }





    }
}
