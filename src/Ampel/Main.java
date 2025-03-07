package Ampel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        AmpelState statusAmpel1 = new AmpelState();
        AmpelState statusAmpel2 = new AmpelState();

        Ampel ampel1 = new Ampel(statusAmpel1);
        Ampel ampel2 = new Ampel(statusAmpel2);

        new Ampelschaltung(statusAmpel1, new StandardVerhalten());
        new Ampelschaltung(statusAmpel2, new AchtungsVerhalten());

        ArrayList<Ampel> ampeln = new ArrayList<Ampel>();
        ampeln.add(ampel1);
        ampeln.add(ampel2);

        new AmpelAnlage(ampeln);

    }
}