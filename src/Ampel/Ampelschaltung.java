package Ampel;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Ampelschaltung {
    Timer schaltung;

    public Ampelschaltung() {
        schaltung = new Timer();
        schaltung.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                switch (Main.ampelstate) {
                    case 0:
                        Main.ampelstate++;
                        break;
                    case 1:
                        Main.ampelstate++;
                        break;
                    case 2:
                        Main.ampelstate++;
                        break;
                    case 3:
                        Main.ampelstate = 0;
                        break;
                }

            }
        }, 1000, 2000);
    }

}

