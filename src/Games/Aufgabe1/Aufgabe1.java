package Games.Aufgabe1;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe1 extends BasicGame{

    private List<Circle1> circles;
    private List<Rect1> rectangles;


    public Aufgabe1(String title) {
        super(title);
    }

    public void init(GameContainer gameContainer) throws SlickException
    {
        this.circles = new ArrayList<>();
        this.rectangles = new ArrayList<>();
        for (int i =0; i<15; i++)
        {
            Circle1 circle = new Circle1();
            circles.add(circle);
            Rect1 rect = new Rect1();
            rectangles.add(rect);
        }
    }
    public void update(GameContainer gameContainer, int i) throws SlickException
    {
        for (Rect1 rectangle:this.rectangles)
        {
            rectangle.update(i);
        }
        for (Circle1 circle:this.circles)
        {
            circle.update(i);
        }
    }

    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException
    {
        for (Rect1 rectangle:this.rectangles)
        {
            rectangle.render(graphics);
        }
        for (Circle1 circle:this.circles)
        {
            circle.render(graphics);
        }
    }


        public static void main(String[] argv) {
            try {
                AppGameContainer container = new AppGameContainer(new Aufgabe1("Shapes"));
                container.setDisplayMode(800,600,false);
                container.start();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
    }
