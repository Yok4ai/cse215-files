package Assignment3;

public class Line{
    private Point start;
    private Point end;

    //Line constructor 1
    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }
    //Line Constructor 2
    public Line(int x1, int y1, int x2, int y2){
        this.start = new Point(x1,y1);
        this.end = new Point(x2,y2);
    }
    //getters and setters
    public Point getStart(){
        return  start;
    }
    public void setStart(Point start){
        this.start = start;
    }
    public Point getEnd(){
        return  end;
    }
    public void setEnd(Point end){
        this.end = end;
    }

    public double length(Point start, Point end){
        double result = start.distance(end);
        return result;
    }

}
