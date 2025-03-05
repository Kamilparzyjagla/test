package Ampel;

import java.time.chrono.JapaneseChronology;

        import javax.swing.JFrame;

public class Main {

    JFrame jf1;
            Draw draw;

    static int ampelstate = 0;

    public Main() {

        jf1 = new JFrame();
        jf1.setSize(400, 600);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setLocationRelativeTo(null);
        jf1.setResizable(false);
        jf1.setTitle("Ampel");

        draw = new Draw();
//        draw.setBounds(0, 0, 200, 300);
        jf1.add(draw);

        jf1.setVisible(true);

    }

    public static void main(String[] args) {

        new Main();
        new Ampelschaltung();

    }

}
