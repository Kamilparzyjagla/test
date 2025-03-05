package Ampel;

import javax.swing.JFrame;

public class Main {

    JFrame jf1;


    public Main(Ampel ampel) {

        jf1 = new JFrame();
        jf1.setSize(400, 600);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setLocationRelativeTo(null);
        jf1.setResizable(false);
        jf1.setTitle("Ampel");

        jf1.add(ampel);

        jf1.setVisible(true);

    }

    public static void main(String[] args) {

        AmpelState statusAmpel1 = new AmpelState();
        Ampel ampel1 = new Ampel(statusAmpel1);

        new Main(ampel1);
        new Ampelschaltung(statusAmpel1);

    }

}
