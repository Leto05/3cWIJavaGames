package Games.Shapes;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

public class Rectangle {
    private float x;
    private float y;
    private float speed;
    private float width;
    private float length;

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
        this.x+=(float) i/this.speed*10;
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
