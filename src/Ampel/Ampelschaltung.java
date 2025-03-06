package Ampel;

import java.util.Timer;
import java.util.TimerTask;

public class Ampelschaltung {
    Timer schaltung;

    public Ampelschaltung(AmpelState statusAmpel, Ampelverhalten ampelverhalten) {

        schaltung = new Timer();
        schaltung.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                ampelverhalten.schalteAmpel(statusAmpel);

            }
        }, 500, ampelverhalten.getWartezeit());
    }

}