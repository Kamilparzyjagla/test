package Ampel;

import java.util.Timer;
import java.util.TimerTask;

public class Ampelschaltung {
    Timer schaltung;

    public Ampelschaltung(AmpelState statusAmpel) {

        schaltung = new Timer();
        schaltung.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                switch (statusAmpel.getAktuellerZustand()) {
                    case aus:
                        statusAmpel.setAktuellerZustand(AmpelState.State.Rot);
                        break;
                    case Rot:
                        statusAmpel.setAktuellerZustand(AmpelState.State.Rot_Orange);
                        break;
                    case Rot_Orange:
                        statusAmpel.setAktuellerZustand(AmpelState.State.Grün);
                        break;
                    case Grün:
                        statusAmpel.setAktuellerZustand(AmpelState.State.Orange);
                        break;
                    case Orange:
                        statusAmpel.setAktuellerZustand(AmpelState.State.Rot);
                        break;
                }

            }
        }, 500, 1111);
    }

}