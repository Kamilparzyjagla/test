package Ampel;

public class AchtungsVerhalten implements Ampelverhalten {
    @Override
    public void schalteAmpel(AmpelState statusAmpel) {

        {
            switch (statusAmpel.getAktuellerZustand()) {
                case aus:
                    statusAmpel.setAktuellerZustand(AmpelState.State.aus);
                    break;
                case Orange:
                    statusAmpel.setAktuellerZustand(AmpelState.State.Orange);
                    break;
            }

            repaint();
        }

    }

    private void repaint() {

    }


    

