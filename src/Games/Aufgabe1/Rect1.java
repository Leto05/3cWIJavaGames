package Games.Aufgabe1;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Rect1 {
    private float x,y;
    private float speed;
    private float diameter;
    private boolean rightDirection;
    private boolean leftDirection;
    private int randomNum;

    public Rect1()
    {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(30)+ 20;
        this.diameter = random.nextInt(20)+ 20;
        this.randomNum =random.nextInt(1)+ 1;
    }

    public void render(Graphics graphics)
    {
        graphics.drawRect(this.x,this.y,this.diameter,this.diameter);
    }

    public void update (int i)
    {
        if(this.x> 810)
        {
            this.x=0;
        }
        if(this.x<-10)
        {
            this.x=800;
        }

        if(this.randomNum==1)
        {
            rightDirection=true;
        }

        if(this.randomNum==2)
        {
            leftDirection=true;
        }

        if(rightDirection==true)
        {
            this.x += (float) i / this.speed*5;
        }
        if(leftDirection==true)
        {
            this.x -= (float) i / this.speed*5;
        }
    }
}
