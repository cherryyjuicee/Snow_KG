import java.awt.*;
import javax.swing.*;

class Draw extends JComponent{

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;

        Snow snow = new Snow();
        snow.snow(g2d);

        super.repaint();
    }
}