
import processing.core.PApplet;

public class Main extends PApplet{
    int width=1000,height=1000,diameter=100;
    float x1=0,x2=0,x3=0,x4=0;
    @Override
    public void settings(){
        size(width,height);
    }

    @Override
    public void setup(){}

    @Override
    public void draw(){
       x1=drawCircle(x1,height/5,0.25);
       x2=drawCircle(x2,2*height/5,0.50);
       x3=drawCircle(x3,3*height/5,0.75);
       x4=drawCircle(x4,4*height/5,1.00);
    }

    public float drawCircle(float x,int y,double speed){
        ellipse(x,y,diameter,diameter);
        return x+(float)speed;
    }
    public static void main(String[] args) {
        PApplet.main("Main");
    }
}