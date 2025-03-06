package Ampel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    JFrame jf1;

    public Main(List<Ampel> ampeln) {
        jf1 = new JFrame();
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

    public static void main(String[] args) {

        AmpelState statusAmpel1 = new AmpelState();
        AmpelState statusAmpel2 = new AmpelState();

        Ampel ampel1 = new Ampel(statusAmpel1);
        Ampel ampel2 = new Ampel(statusAmpel2);

        new Ampelschaltung(statusAmpel1, new StandardVerhalten());
        new Ampelschaltung(statusAmpel2, new AchtungsVerhalten());

        ArrayList<Ampel> ampeln = new ArrayList<Ampel>();
        ampeln.add(ampel1);
        ampeln.add(ampel2);

        new Main(ampeln);

    }
}