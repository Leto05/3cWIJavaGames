package Games.Shapes;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class Oval implements ObjectActor{
    private float x;
    private float y;
    private float speed;
    private float width;
    private float length;
    private boolean rightDirection;
    public Oval(float x,float y,float speed, float width, float length)
    {
        this.x=x;
        this.y=y;
        this.speed=speed;
        this.width=width;
        this.length=length;
    }

    public void init(GameContainer gameContainer) throws SlickException {
    }

    public void update(int i) {
        if (this.x >600)
        {
            rightDirection=false;}
        if (this.x <100) {
            rightDirection=true;
        }

        if(rightDirection==true)
        {
            this.x += (float) i / this.speed * 10;
        }
        else if(rightDirection==false)
        {
            this.x -= (float) i / this.speed * 10;
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
