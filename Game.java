import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Game {

    JFrame frame;
    Canvas canvas;
    Keyboard keyboard;

    RayCaster player;

    boolean topDown = true;

    ArrayList<Boundary> boundaries;

    public Game(JFrame frame, Canvas canvas) {
        player = new RayCaster(new Vector(canvas.getWidth() * 0.5f, canvas.getHeight() * 0.5f), 90, 10);
        keyboard = new Keyboard(frame, new int[] { KeyEvent.VK_SPACE, KeyEvent.VK_W, KeyEvent.VK_A, KeyEvent.VK_S, KeyEvent.VK_D });
        boundaries = new ArrayList<Boundary>(5);
        for (int i = 0; i < boundaries.size(); i++) {
            boundaries.set(i, Boundary.random(0, canvas.getWidth(), 0, canvas.getHeight()));
        }
    }

    public void update(float deltaTime) {
        if (keyboard.isKeyPressed(KeyEvent.VK_SPACE)) {
            topDown = !topDown;
        }
        if (keyboard.isKeyPressed(KeyEvent.VK_W)) {

        }
        if (keyboard.isKeyPressed(KeyEvent.VK_S)) {

        }
        if (keyboard.isKeyPressed(KeyEvent.VK_A)) {

        }
        if (keyboard.isKeyPressed(KeyEvent.VK_D)) {

        }
    }

    public void render(Graphics g) {
        if (topDown) {
            render2D(g);
        } else {
            render3D(g);
        }
    }

    private void render2D(Graphics g) {
        for (Boundary wall : boundaries) {
            g.setColor(wall.getColor());
        }
    }

    private void render3D(Graphics g) {

    }
    
}