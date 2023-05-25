package Games.Shapes;

import org.newdawn.slick.*;

public class Shapes extends BasicGame{

    private Rectangle r1 = new Rectangle(150,150,25,100,100);
    private Oval o1 = new Oval(100,0,25,125,50);
    private Circle c1 = new Circle(0,0,15,50,50);

    public Shapes(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        r1.update(i);
        o1.update(i);
        c1.update(i);
        System.out.println(i);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(r1.getX(),r1.getY(),r1.getWidth(),r1.getLength());
        graphics.drawOval(o1.getX(),o1.getY(),o1.getWidth(),o1.getLength());
        graphics.drawOval(c1.getX(),c1.getY(),c1.getWidth(),c1.getLength());
    }
}
