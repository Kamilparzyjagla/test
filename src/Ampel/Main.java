package Ampel;

import javax.swing.JFrame;

public class Main {

    JFrame jf1;
            Ampel ampel;

    static int ampelstate = 0;

    public Main() {

        jf1 = new JFrame();
        jf1.setSize(400, 600);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setLocationRelativeTo(null);
        jf1.setResizable(false);
        jf1.setTitle("Ampel");

        ampel = new Ampel();
//        draw.setBounds(0, 0, 200, 300);
        jf1.add(ampel);

        jf1.setVisible(true);

    }

    public static void main(String[] args) {

        new Main();
        new Ampelschaltung();

    }

}
