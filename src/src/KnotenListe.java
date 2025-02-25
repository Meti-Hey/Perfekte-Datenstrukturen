

// !KnotenListe! stellt den knoten dar
public class KnotenListe<HI> {

    // Inhalt des Knotens
    private HI Inhalt;

    // näcshter JKnoten wird beschireben
    private KnotenListe nachfolger;

    // wird später genutzt, für die nöcshten Knoten
    private HI next;

    // gibt den neuen Knoten Inhalt + gibt keinen Nachfolger an
    public KnotenListe(HI pInhalt){
        Inhalt = pInhalt;
        nachfolger = null;  // Beginn = keine nachfoplgewr
    }

    // Nachfolger wird auf den aktuellen Konten gesetzt
    public void setNachfolger(KnotenListe pKnoten) {
        this.nachfolger = pKnoten;
    }

    // Gibt den Nachfolger des aktuellen Knotens zurück
    public KnotenListe getNachfolger() {
        return nachfolger;
    }

    // Gibt den Inhalt des Knotens zurück
    public HI getInhalt() {
        return Inhalt;
    }

    // Setzt den Inhalt des Knotens auf (Random) Inhalt
    public void setInhalt(HI inhalt) {
        Inhalt = inhalt;
    }

    // für die nöächsten Knomten
    public void setNext(HI next) {
        this.next = next;
    }

    //gibt den nächsten wert des Knotens zurück
    public HI getNext() {
        return next;
    }
}
