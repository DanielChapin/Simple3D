import java.awt.Graphics;
import java.awt.Canvas;
import javax.swing.JFrame;

public class Game {

    JFrame frame;
    Canvas canvas;

    RayCaster player;

    public Game(JFrame frame, Canvas canvas) {
        player = new RayCaster(new Vector(0), 90, 10);
    }

    public void update(float deltaTime) {

    }

    public void render(float deltaTime, Graphics g) {

    }
    
}