package Ampel;

import java.awt.*;

import javax.swing.JLabel;

public class Draw extends JLabel {

    @Override
    protected void paintComponent (Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //draw

        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,0,400, 600);

        switch (Main.ampelstate){
            case 0:
                g.setColor(Color.RED);
                g.fillOval(125, 25,150,150);
                break;
            case 1:
                g.setColor(Color.RED);
                        g.fillOval(125, 25,150,150);
                g.setColor(Color.ORANGE);
                g.fillOval(125, 200,150,150);

                break;
            case 2:
                g.setColor(Color.GREEN);
                g.fillOval(125, 375,150,150);
                break;
            case 3:
                g.setColor(Color.ORANGE);
                g.fillOval(125, 200,150,150);

                break;
        }

        repaint();

    }

}
