package lr5;

public class Coordinates {

    private int x;
    private int y;

    public Coordinates(){
        this.x = 0;
        this.y = 0;
    }
    public Coordinates(int x){
        this.x = x;
        this.y = 0;
    }

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void print(){
        System.out.println(x + ", " + y);
    }
}
