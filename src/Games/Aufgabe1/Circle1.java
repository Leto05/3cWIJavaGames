package Games.Aufgabe1;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle1 {
    private float x,y;
    private float speed;
    private float diameter;

    public Circle1()
    {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(30)+ 20;
        this.diameter = random.nextInt(30)+ 20;
    }

    public void render (Graphics graphics)
    {
        graphics.drawOval(this.x,this.y,this.diameter,this.diameter);
    }

    public void update (int i)
    {
        this.y -= (float)i/this.speed*5;
        this.diameter += 0.01;
        if (this.y<0)
        {
            this.y =600;
            this.diameter= diameter- diameter/2;
        }
        if (this.diameter>200)
        {
            Random random = new Random();
            this.diameter = random.nextInt(30)+ 20;
        }
    }
}
