package face;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Face {

    private int xPos, yPos, diameter;
    private int newx, newy, newsize;
    private Color color;
    private Graphics g;

    public Face(Graphics g, int x, int y) {
        xPos = x;
        yPos = y;
        //let the g property = the g parameter
        this.g = g;
        diameter = 200;
        color = Color.red;
    }

    private void drawEyes() {
        g.setColor(Color.yellow);
        g.fillOval(xPos + (int) (.2 * diameter), yPos + (int) (.2 * diameter), (int) (diameter * 0.25), (int) (diameter * 0.25));
        g.fillOval(xPos + (int) (.55 * diameter), yPos + (int) (.2 * diameter), (int) (diameter * 0.25), (int) (diameter * 0.25));
    }

    private void drawHead() {
        g.setColor(Color.red);
        g.fillOval(xPos, yPos, diameter, diameter);

    }

    private void drawMouth() {
        int mx, my;
        mx = xPos + (int) (.2 * diameter);
        my = yPos + (int) (.6 * diameter);
        g.setColor(Color.black);
        g.drawLine(mx, my, mx + (int) (.4 * diameter), my);
    }

    public void erase() {
        g.setColor(Color.white);
        g.fillRect(xPos-5, yPos-5, diameter+20, diameter+20);
    }

    public void move(int newx, int newy){
        xPos = newx;
        yPos = newy;
    }
    
    public void draw() {
        drawHead();
        drawEyes();
        drawMouth();

    }
    public void resize(int newsize){
        diameter = newsize;
    }

}
