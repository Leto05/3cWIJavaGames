package Games.Shapes;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class Rectangle {
    private float x;
    private float y;
    private float speed;
    private float width;
    private float length;
    private boolean rightDirection;
    private boolean downDirection;
    private boolean uppDirection;

    public Rectangle(float x,float y,float speed, float width, float length)
    {
        this.x=x;
        this.y=y;
        this.speed=speed;
        this.width=width;
        this.length=length;
    }
    public void init(GameContainer gameContainer) throws SlickException {
    }

    public void Rectupdate(int i) {

        if (this.x >=550)
        {
            rightDirection=false;
        }

        if (this.x <=150) {
            rightDirection=true;
        }

        if (this.x >=550)
        {
            downDirection=true;
        }
        if (this.y >=450) {
            downDirection=false;
            rightDirection=false;
        }

        if(rightDirection==true)
        {
            this.x += (float) i / this.speed * 10;
        }
        if(rightDirection==false)
        {
            this.x -= (float) i / this.speed * 10;
        }
        System.out.println(x);

        if(downDirection==true)
        {
            this.y += (float) i / this.speed * 10;
        }
        if(uppDirection==true)
        {
            this.y -= (float) i / this.speed * 10;
        }
    }
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSpeed() {
        return speed;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }
}
