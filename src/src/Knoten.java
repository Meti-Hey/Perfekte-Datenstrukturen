

//  !Knoten <A>! als Gerische Klasse
public class Knoten <A> {

    // Das private Feld !Inhalt! speichert den Inhalt des Knotens
    private A Inhalt;

    //  !Nachfolger! zeigt auf den nächsten Knoten in der Liste
    private Knoten nachfolger;

    //  einen neuen Knoten mit einem (Random) Inhalt zu erstellen
    public Knoten(A pInhalt){
        // Setzt Inhalt des Knotens auf den (Random) Wert
        Inhalt = pInhalt;

        // Knoten besitz erstmal keinen Nachfolger = Null
        nachfolger = null;
    }

    // Setzt Nachfolger des aktuellen Knotens auf den nächsten Knoten
    public void setNachfolger(Knoten pInhalt) {
        this.nachfolger = pInhalt;
    }

    // Gibt den Nachfolger des aktuellen Knotens zurück
    public Knoten getNachfolger() {
        return nachfolger;
    }

    // Gibt an was im Knoten drinne ist
    public A getInhalt(){
        return Inhalt;
    }
}
