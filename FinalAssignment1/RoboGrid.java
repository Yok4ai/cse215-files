package FinalAssignment1;

public class RoboGrid {
    public static final int MX = 100;
    public static final int MY= 100;
    private int cur_x;
    private int cur_y;
    private String name;

    public RoboGrid(){
        this.name = "Nimo";
        cur_x = 0;
        cur_y = 0;
    }
    public RoboGrid(String name, int x, int y){
        this.name = name;
        cur_x = x;
        cur_y = y;
    }

    public boolean moveUp(int z){
        if ((cur_y==0) && z<0){
            return false;
        }
        if(cur_y+z<0) {
            cur_y = 0;
            return true;
        }
        if((cur_y+z)<=MY && z!=0){
            cur_y = cur_y + z;
            return true;
        }
        if(cur_y==MY && z>0){
            return false;
        }
        if((cur_y+z)>MY){
            cur_y = MY;
            return true;
        }
        else if(z==0){
            return false;
        }
            return false;
    }

    public boolean moveRight(int z){
        if ((cur_x==0) && z<0){
            return false;
        }
        if(cur_x+z<0) {
            cur_x = 0;
            return true;
        }
        if((cur_x+z)<=MX && z!=0){
            cur_x = cur_x + z;
            return true;
        }
        if(cur_x==MX && z>0){
            return false;
        }
        if((cur_x+z)>MX){
            cur_x = MX;
            return true;
        }
        else if(z==0){
            return false;
        }
        return false;
    }
    public boolean moveRight() {
        if (cur_x + 1 <= 100) {
            cur_x = cur_x + 1;
            return true;
        } else if(cur_x==100){
            return false;
        }
            return false;
    }


    public boolean setPos(int x, int y){
        if(x<=100 && y<=100){
            cur_x = x;
            cur_y = y;
            return true;
        }
        else{
            return false;
        }
    }

    public int getPosX(){
        return cur_x;
    }

    public int getPosY(){

        return cur_y;
    }

    public String toString(){

        return "The robot is at ("+cur_x+","+cur_y+")";
    }

    public static void main(String[] args) {
        RoboGrid r1 = new RoboGrid("Melissa",2,40);
        RoboGrid r2 = new RoboGrid("Bob",44,20);

        System.out.println(r1.moveRight(-5));
        System.out.println(r2.moveUp(11));

        //r2.moveUp(11);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }

}
