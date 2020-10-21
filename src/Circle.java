import javax.swing.*;
import java.awt.*;


public class Circle {

    public void CircleDraw(int x, int y, int radius, Graphics g) {

        int _x = 0, _y = radius, sigma = 0, delta = 2 - 2 * radius;

        while (_y >= 0){

            Color Circlef = new Color(0, 86, 235);
            g.setColor(Circlef);

            g.drawLine(x + _x, y - _y, x + _x, y - _y);     // 1 ч
            g.drawLine(x - _x, y - _y, x - _x, y - _y);     // 2 ч
            g.drawLine(x - _x, y + _y, x - _x, y + _y);     // 3 ч
            g.drawLine(x + _x, y + _y, x + _x, y + _y);     // 4 ч

            sigma = 2 * (delta + _y) - 1;

            if (delta < 0 && sigma <= 0) {          //пер. по горизонтали
                _x++;
                delta += _x + 1;
            } else if (delta > 0 && sigma > 0) {    //пер. по вертикали
                _y--;
                delta -= _y + 1;
            } else {                                //пер. по диагонали
                _x++;
                delta += _x - _y;
                _y--;
            }
        }
    }
}