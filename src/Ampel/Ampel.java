package Ampel;

import java.awt.*;

import javax.swing.JLabel;

public class Ampel extends JLabel {

    private final AmpelState statusAmpel;

    public Ampel(AmpelState statusAmpel) {
        this.statusAmpel = statusAmpel;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //draw

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 400, 600);

        switch (statusAmpel.getAktuellerZustand()) {
            case Rot:
                g.setColor(Color.RED);
                g.fillOval(125, 25, 150, 150);
                break;
            case Rot_Orange:
                g.setColor(Color.RED);
                g.fillOval(125, 25, 150, 150);
                g.setColor(Color.ORANGE);
                g.fillOval(125, 200, 150, 150);

                break;
            case Grün:
                g.setColor(Color.GREEN);
                g.fillOval(125, 375, 150, 150);
                break;
            case Orange:
                g.setColor(Color.ORANGE);
                g.fillOval(125, 200, 150, 150);

                break;
        }

        repaint();

    }

}