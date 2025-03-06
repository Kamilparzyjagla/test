package Ampel;

public interface Ampelverhalten {
    void schalteAmpel(AmpelState Ampel);
    int getWartezeit();
}
