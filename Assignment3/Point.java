package Assignment3;

public class Point {
    private int x;
    private  int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    public double distance(Point second){
        double term1= Math.pow(this.x-second.x,2);
        double term2= Math.pow(this.y-second.y,2);

        double  distance = Math.sqrt(term1 + term2);
        return distance;
    }

    public String toString(){
        return (this.x + "," + this.y);
    }

    }

