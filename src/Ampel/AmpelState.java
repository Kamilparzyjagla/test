package Ampel;

public class AmpelState {
    private State aktuellerZustand = State.aus;
    // Definieren der Zustände
    public enum State {
        Grün,
        Orange,
        Rot,
        Rot_Orange,
        aus
    }

    public State getAktuellerZustand() {
        return aktuellerZustand;
    }

    public void setAktuellerZustand(State aktuellerZustand) {
        this.aktuellerZustand = aktuellerZustand;
    }
}
