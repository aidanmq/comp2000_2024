import javax.swing.*;
import java.awt.*;

public class Cell {
    int x, y;
    int w, h;

    public Cell(int x, int y, int w, int h){
        this.x = x; this.y = y; this.w = w; this.h = h;
    }

    public void paint(Graphics g){
        g.drawRect(x,y,w,h);
    }
    
}
