
// !Stack!  die einen Stack implementiert
public class Stack<Ye> {

    //  !top! verweist auf das oberste Objekt im Stack, somit der erster Kontwn
    private KnotenStack<Ye> top;

    //  !KnotenStack! die Knoten im Stack darstellt
    private static class KnotenStack<Ye> {
        // Der Inhalt des Knotens kann egal was sein
        Ye Inhalt;

        // Der näcshte Knoten ist dran
        KnotenStack<Ye> next;

        // Knoten, der den Inhalt setzt und den nächsten Knoten auf !null! setzt
        public KnotenStack(Ye Inhalt) {
            this.Inhalt = Inhalt;
            this.next = null;
        }
    }

    //  Gibt an, dass der Stack leer ist also eher gesagt das oberste objkekrt
    public Stack() {
        top = null;
    }

    // Gibt den Inhalt des obersten Objektes zurück
    // Falls Stack = null, dann wird eine Nachricht ausgegeben und !null! zurückgegeben
    public Ye getInhalt() {
        if (top == null) {
            System.out.println("Nichts ist drinen, Versuchs später wieder (._.)!");
            return null;
        }
        return top.Inhalt;
    }

    // Fügt ein neues Objekt auf den Stack hinzu
    public void add(Ye Inhalt) {
        // Erstellt einen neuen Knoten mit dem (Random) Inhalt
        KnotenStack<Ye> neuerKnoten = new KnotenStack<Ye>(Inhalt);

        // neuer Knotens zeigt auf das aktuelle oberste Objekt
        neuerKnoten.next = top;

        // Das neue Objekt wird jetzt das oberste Objekt
        top = neuerKnoten;
    }

    // Entfernt das oberste Objekt des Stacks
    public void remove() {
        if (top == null) {
            System.out.println("Nichts ist drinen, Versuchs später wieder (._.)!");
        } else {
            // Das oberste Objekt wird entfernt, indem auf das nächste Objekt gezeigt wird
            top = top.next;
        }
    }

    // Beweist ob der Stack leer
    public boolean isEmpty() {
        return top == null;
    }
}// !Stack!  die einen Stack implementiert
