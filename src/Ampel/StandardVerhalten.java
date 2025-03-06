package Ampel;

public class StandardVerhalten implements Ampelverhalten{
    @Override
    public void schalteAmpel(AmpelState statusAmpel)

    {
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
                break;}
    }
}
