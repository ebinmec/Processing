import processing.core.PApplet;

public class OOP extends PApplet{
    int width=1000,height=1000,diameter=100;

    public class Ball{
        int x;
        int y;
        int dia;
        int speed;

        public Ball(int x,int y,int d,int s){
            this.x=x;
            this.y=y;
            this.dia=d;
            this.speed=s;
        }

        void displayBall(){
            ellipse(x,y,dia,dia);
            x+=speed;
        }
    }

    Ball[] Balls= new Ball[4];
    @Override
    public void settings(){
        size(width,height);
    }

    @Override
    public void setup(){
        for(int i=0;i<4;i++)
            Balls[i]=new Ball(0,(i+1)*height/5,diameter,i+1);
    }

    @Override
    public void draw(){
        for(int i=0;i<4;i++)
            Balls[i].displayBall();
    }


    public static void main(String[] args) {
        PApplet.main("OOP");
    }
}
