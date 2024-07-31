import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private Canvas canvas;

    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }   

    class Canvas extends JPanel {
        public Canvas(){
            setPreferredSize(new Dimension(720, 720));
        }

        Grid grid = new Grid(20,20,35,35);

        @Override
        public void paint(Graphics g){
            grid.paint(g);
        }
 
    }

    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);

        //infinite loop to check mouse position
        while(true){
            update();
        }
    }

    //mouse tracking
    public void update(){
        try {
            int mouseX = (canvas.getMousePosition().x + 25) / 35;
            int mouseY = (canvas.getMousePosition().y + 25) / 35;
            
            if(mouseX>=1 && mouseY>=1 && mouseX<=20 && mouseY<=20){
                System.out.println(mouseX);
                System.out.println(mouseY);
            }

        } catch (NullPointerException e) {
            // TODO: handle exception
        }
    }
}