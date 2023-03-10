package game;
import city.cs.engine.*;

import java.awt.*;
import javax.swing.*;



public class GameView extends UserView {
    private Image background;

    public GameView(World world, int width, int height) {
        super(world, width, height);
        background = new ImageIcon("data/desertbackground.gif").getImage();


    }

    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 0, this);
    }
}