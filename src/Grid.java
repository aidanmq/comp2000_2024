import javax.swing.*;
import java.awt.*;

public class Grid {
    private Cell[][] cells;
    private int cellW, cellH;
    private int rows, cols;

    public Grid(int rows, int cols, int cellW, int cellH){
        this.rows = rows;
        this.cols = cols;
        this.cellW = cellW;
        this.cellH = cellH;
        this.cells = new Cell[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int x = j*cellW + 10;
                int y = i*cellH + 10;
                cells[i][j] = new Cell(x, y, cellW, cellH);
            }
        }
    }

    public void paint(Graphics g){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                cells[i][j].paint(g);
            }
        }
    }   
}
