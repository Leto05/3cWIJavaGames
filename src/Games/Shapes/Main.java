package Games.Shapes;

import Games.firstgame.Rectangle;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Shapes("Shapes"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
