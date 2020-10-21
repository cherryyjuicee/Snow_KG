import java.awt.*;
import javax.swing.*;

public class BY {
    public void BYLine (int x1, int y1, int x2, int y2, Graphics g) {
        if (x2 < x1) {
            x1 += x2;
            x2 = x1 - x2;
            x1 -= x2;
            y1 += y2;
            y2 = y1 - y2;
            y1 -= y2;
        }
        int dx = x2 - x1;
        int dy = y2 - y1;
        //Горизонтальные и вертикальные линии не нуждаются в сглаживании
        if (dx == 0 || dy == 0) {
            g.setColor(Color.BLACK);
            g.drawLine(x1, y1, x2, y2);
            return;
        }
        float gradient = 0;
        if (dx > dy) {
            gradient = (float) dy / dx;
            float intery = y1 + gradient;
            g.setColor(Color.BLACK);
            g.drawLine(x1, y1, x1, y1);
            for (int x = x1; x < x2; ++x) {
                g.setColor(new Color(0, 0, 0, (int) (255 - fractionalPart(intery) * 255))); //Меняем прозрачность
                g.drawLine(x, (int)intery, x, (int)intery);
                g.setColor(new Color(0, 0, 0, (int) (fractionalPart(intery) * 255)));
                g.drawLine(x, (int)intery + 1, x, (int)intery + 1);
                intery += gradient;
            }
            g.setColor(Color.BLACK);
            g.drawLine(x2, y2, x2, y2);
        }
        else {
            gradient = (float) dx / dy;
            float interx = x1 + gradient;
            g.setColor(Color.BLACK);
            g.drawLine(x1, y1, x1, y1);
            for (int y = y1; y < y2; ++y) {
                g.setColor(new Color(0, 0, 0, (int) (255 - fractionalPart(interx) * 255)));
                g.drawLine((int)interx, y, (int)interx, y);
                g.setColor(new Color(0, 0, 0, (int) (fractionalPart(interx) * 255)));
                g.drawLine((int)interx + 1, y, (int)interx + 1, y);
                interx += gradient;
            }
            g.setColor(Color.BLACK);
            g.drawLine(x2, y2, x2, y2);
        }
    }

    private float fractionalPart(float x) {
        int tmp = (int) x;
        return x - tmp; //вернёт дробную часть числа
    }
}
