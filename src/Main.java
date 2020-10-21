import java.awt.*;
import javax.swing.*;

public class Main{
    public static void main(String[] args) {

        JFrame w=new JFrame("Снежинка");

        w.setSize(600, 600);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLayout(new BorderLayout(1,1));
        Draw canv = new Draw();
        w.add(canv);
        w.setVisible(true);
        w.setResizable(false);
        w.setLocationRelativeTo(null);
    }
}
