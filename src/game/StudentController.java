package game;

import city.cs.engine.Body;
import city.cs.engine.BodyImage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class StudentController implements KeyListener {

    private static final float WALKING_SPEED = 3;

    private man man;

    private HashMap<Body, BodyImage> hiddenImages = null;

    public StudentController(man m){man = m;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_LEFT) {
            man.startWalking(-WALKING_SPEED);
        } else if (code == KeyEvent.VK_RIGHT) {
            man.startWalking(WALKING_SPEED*2);
        }
        else if (code == KeyEvent.VK_UP){
            man.jump(12);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            man.stopWalking();
        } else if (code == KeyEvent.VK_RIGHT) {
            man.stopWalking();
        }
    }
}
