
package game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseTest implements MouseListener {
    public MouseTest() {
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exited");
    }
}
