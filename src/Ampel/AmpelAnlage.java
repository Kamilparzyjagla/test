package Ampel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AmpelAnlage {

    public AmpelAnlage(List<Ampel> ampeln) {

        JFrame jf1 = new JFrame();
        jf1.setSize(600, 800);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setLocationRelativeTo(null);
        jf1.setTitle("Ampel");

        jf1.setLayout(new GridLayout(1, ampeln.size()));

        for (Ampel ampel : ampeln) {
            jf1.add(ampel);
        }

        jf1.setVisible(true);
    }
}
