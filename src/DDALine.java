import java.awt.*;
import java.lang.*;

public class DDALine  {

   public void DDA (int x0, int y0, int x1, int y1, Graphics g) {

        int dx, dy;
        float Xinc, Yinc, x, y, steps;

        dy = y1 - y0;
        dx = x1 - x0;


        if (dy > dx) {
            steps = Math.abs(dy);
        } else {
            steps = Math.abs(dx);
        }

        x = x0;
        y = y0;

        Yinc = dy / steps;
        Xinc = dx / steps;

        while (steps != 0) {

            steps--;
            x = x + Xinc;
            y = y + Yinc;

            g.drawLine (Math.round(x0), Math.round(y0), x1, y1);
        }
    }
}