import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import javax.swing.JFrame;

public class Keyboard extends KeyAdapter {

    HashMap<Integer, Boolean> pressed;
    
    public Keyboard(JFrame target, int[] keyCodes) {
        target.addKeyListener(this);
        pressed = new HashMap<Integer, Boolean>();
        for (int i : keyCodes) {
            pressed.put(i, false);
        }
    }

    public boolean isKeyPressed(int keyCode) {
        return pressed.get(keyCode);
    }

    @Override
    public void keyPressed(KeyEvent event) {
        int keyCode = event.getKeyCode();
        if (pressed.containsKey(keyCode)) {
            pressed.replace(keyCode, true);
        }
    }

    @Override
    public void keyReleased(KeyEvent event) {
        int keyCode = event.getKeyCode();
        if (pressed.containsKey(keyCode)) {
            pressed.replace(keyCode, false);
        }
    }

}
