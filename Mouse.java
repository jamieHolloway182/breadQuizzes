package breadQuizzes;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;


public class Mouse implements MouseListener , MouseMotionListener,MouseWheelListener{

    private int mouseX = -1;
    private int mouseY = -1;
    private int mouseB = -1;
    private int scroll = 0;

    public int getX() {
        return this.mouseX;
    }
    public int getY() {
        return this.mouseY;
    }
    public int getButton() {
        return this.mouseB;
    }
    public void resetButton() {
        this.mouseB = -1;
    }
    public void mouseDragged(MouseEvent event) {
        this.mouseX = event.getX();
        this.mouseY = event.getY();
    }
    public void mouseMoved(MouseEvent event) {
        this.mouseX = event.getX();
        this.mouseY = event.getY();
    }
    public void mousePressed(MouseEvent event) {
        this.mouseB = event.getButton();
    }
    public void mouseReleased(MouseEvent arg0) {
        this.mouseB = -1;
    }

    public void mouseClicked(MouseEvent arg0) {
    }
    public void mouseEntered(MouseEvent arg0) {
    }
    public void mouseExited(MouseEvent arg0) {
    }

    //scroll commands

    public int getScroll() {
        return this.scroll;
    }
    public void mouseWheelMoved(MouseWheelEvent event) {
        scroll = event.getWheelRotation();
    }
    public boolean isScrollingUp() {
        return this.scroll == -1;
    }
    public boolean isScrollingDown() {
        return this.scroll == 1;
    }
    public void resetScroll() {
        this.scroll = 0;
    }
}
