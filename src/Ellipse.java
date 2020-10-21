import java.awt.*;

public class Ellipse {

    public void DrawEllipse (int x, int y, int a, int b, Graphics g) {

        int _x, _y, d;
        _x = 0; _y = b;
        d = 4 * b * b * ((_x + 1) * (_x + 1)) + a * a * ((2 * _y - 1) * (2 * _y - 1)) - 4 * a * a * b * b;

        while (a*a * (2 *_y - 1) > 2 * b*b * (_x + 1)) {

            g.drawLine(x + _x, y + _y, x + _x, y + _y);
            g.drawLine(x + _x, y - _y, x + _x, y - _y);
            g.drawLine(x - _x, y - _y, x - _x, y - _y);
            g.drawLine(x - _x, y + _y, x - _x, y + _y);

            if (d < 0) {
                _x++;
                d += 4 * b * b * (2 * _x + 3);
            } else {
                _x++;
                d = d - 8 * a * a * (_y - 1) + 4 * b * b * (2 * _x + 3);
                _y--;
            }
        }
        d = b * b * ((2 * _x + 1) * (2 * _x + 1)) + 4 * a * a * ((_y + 1) * (_y + 1)) - 4 * a * a * b * b;
        while (_y + 1 != 0) {
            g.drawLine(x + _x, y + _y, x + _x, y + _y);     // 1 ч
            g.drawLine(x + _x, y - _y, x + _x, y - _y);
            g.drawLine(x - _x, y - _y, x - _x, y - _y);
            g.drawLine(x - _x, y + _y, x - _x, y + _y);

            if (d < 0) {
                _y--;
                d += 4 * a * a * (2 * _y + 3);
            }
            else {
                _y--;
                d = d - 8 * b * b * (_x + 1) + 4 * a * a * (2 * _y + 3);
                _x++;
            }
        }
    }
}