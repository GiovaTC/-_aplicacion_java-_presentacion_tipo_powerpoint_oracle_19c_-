package ui;

import javax.swing.*;
import java.awt.*;

public class ChartPanel extends JPanel {

    private int[] values = {40, 70, 55, 90};

    @Override
    protected void   paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 80;

        for (int value : values) {
            g.setColor(Color.BLUE);
            g.fillRect(x, 250 - value, 40, value);
            x += 70;
        }
        g.setColor(Color.BLACK);
        g.drawString("grafico tipo powerpoint", 100, 40);
    }
}
