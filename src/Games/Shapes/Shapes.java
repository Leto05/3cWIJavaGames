package Games.Shapes;

import org.newdawn.slick.*;

public class Shapes extends BasicGame{

    private float x;
    private float y;
    private float speed;

    public Shapes(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x=100;
        this.y=100;
        this.speed=10.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.x +=(float) i/this.speed;
        System.out.println(i);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
    }
}
