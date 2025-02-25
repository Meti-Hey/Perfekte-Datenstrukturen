

public class Knotenstack<LO> {
    private LO Inhalt;  //  Inhalt des Knotens
    private Knotenstack<LO> nextKnoten;  // zeigt aud den nächsten Knoten

    // Inhalt wird angegebe
    public Knotenstack(LO pInhalt) {
        this.Inhalt = pInhalt;
        this.nextKnoten = null;  // Nachfolgender Knoten ist Null
    }

    // Inhalt wirds zur+vckgegeben
    public LO getInhalt() {
        return Inhalt;
    }

    //setzt den Inhalt des knoten überhaupzt zusammen
    public void setInhalt(LO pInhalt) {
        this.Inhalt = pInhalt;
    }

    // Inhalt des nächsten Knoten qwird zurückgegeben
    public Knotenstack<LO> getNextKnoten() {
        return nextKnoten;
    }

    // setzt den Inhalt des nächsten knotejn zusammen
    public void setNextKnoten(Knotenstack<LO> nextKnoten) {
        this.nextKnoten = nextKnoten;
    }
}
