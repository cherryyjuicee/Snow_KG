import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

class Snow extends JComponent {
    void snow (Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;

        BresenhamLine d1 = new BresenhamLine();
        d1.drawBresenhamLine(150,300,450,300, g2d);
        d1.drawBresenhamLine(300,150,300,450, g2d);

        DDALine d2 = new DDALine();
        d2.DDA(200, 200, 400, 400, g2d);
        d2.DDA(200, 400, 400, 200, g2d);

        BY d3 = new BY();
        d3.BYLine(150, 300, 125, 275, g2d);
        d3.BYLine(150, 300, 125, 325, g2d);

        d3.BYLine(300, 150, 325, 125, g2d);
        d3.BYLine(300, 150, 275, 125, g2d);

        d3.BYLine(450, 300, 475, 325, g2d);
        d3.BYLine(450, 300, 475, 275, g2d);

        d3.BYLine(300, 450, 325, 475, g2d);
        d3.BYLine(300, 450, 275, 475, g2d);


       Circle c = new Circle();
        c.CircleDraw(300, 300,75, g2d);

       Ellipse e = new Ellipse();
       e.DrawEllipse(300, 300, 100, 150, g2d);
       e.DrawEllipse(300, 300, 150, 100, g2d);

       g2d.setColor(Color.black);
        String str = "Воронцова";
        g2d.drawString(str,0,550);

    }
}