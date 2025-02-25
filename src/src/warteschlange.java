
//  !Warteschlange!  (Queue)
public class warteschlange <J> {

    // !erster! zeigt auf erstes Objekt in der Warteschlange
    private Knoten erster;

    // !letzter! zeigt auf das letzte Objekt in der Warteschlange
    private Knoten letzter;

    // Falls nichsts im ersten oder letzern drin ist, dann setze = Null
    public warteschlange() {
        erster = null;
        letzter = null;
    }

    // Gibt den Inhalt des ersten Objekt in der Warteschlange zurück
    public J gibErsten() {

        return (J) erster.getInhalt();
    }

    // Entfernt das erste Objekt aus der Warteschlange
    public void entfernen() {
        Knoten aktuellerKunde = erster;

        // Falls die Warteschlange nicht leer ist
        if (erster != null) {
            // Der erste Knoten wird entfernt, indem !erster! auf das nächste Objekt gesetzt wird
            erster = aktuellerKunde.getNachfolger();
        }
    }

    // Fügt ein neues Objekt am Ende der Warteschlange hinzu
    public void einfuegen(J pInhalt) {
        // Wir beginnen bei dem ersten Knoten
        Knoten InhaltType = erster;

        // Wenn die Warteschlange leer ist
        if (erster == null) {
            // Der erste Knoten wird mit dem neuen Inhalt erstellt und gleichzeitig auch der letzte Knoten
            erster = new Knoten(pInhalt);
            letzter = erster;
        }
        else {
            // Wenn die Warteschlange nicht leer ist, gehen wir zum letzten Knoten
            while (InhaltType.getNachfolger() != null) {
                InhaltType = InhaltType.getNachfolger();
            }
            // Der Nachfolger des letzten Knotens wird auf den neuen Knoten gesetzt
            InhaltType.setNachfolger(new Knoten<J>(pInhalt));
            // Der neue Knoten wird zum letzten Knoten
            letzter = InhaltType.getNachfolger();
        }
    }
}
