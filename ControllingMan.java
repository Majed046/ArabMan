package game;

import city.cs.engine.Walker;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import org.jbox2d.common.Vec2;

public class ControllingMan extends KeyAdapter {
    private static final float JUMPING_SPEED = 15.0F;
    private static final float WALKING_SPEED = 4.0F;
    private Walker body;

    public ControllingMan(Walker body) {
        this.body = body;
    }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 81) {
            System.exit(0);
        } else if (code == 32) {
            this.body.applyImpulse(new Vec2(0.0F, 40.0F));
        } else if (code == 37) {
            this.body.startWalking(-4.0F);
        } else if (code == 39) {
            this.body.startWalking(4.0F);
        }

    }

    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 49) {
            this.body.stopWalking();
        } else if (code == 50) {
            this.body.stopWalking();
        }

    }
}