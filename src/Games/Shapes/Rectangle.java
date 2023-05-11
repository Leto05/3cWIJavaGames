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
    private boolean leftDirection;
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

        if (this.x <=550&& this.y<=150)
        {
          rightDirection=true;
        }
        else{rightDirection=false;}

        if (this.y<=400&& this.x>=550)
        {
            downDirection=true;
        }
        else{downDirection=false;}

        if (this.x>=150&& this.y>=400)
        {
            leftDirection=true;
        }
        else{leftDirection=false;}

        if(this.x<=150&& this.y>=150)
        {
            uppDirection=true;
        }
        else{uppDirection=false;}


        if(rightDirection==true)
        {
            this.x += (float) i / this.speed * 10;
        }
        if(leftDirection==true)
        {
            this.x -= (float) i / this.speed * 10;
        }

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
