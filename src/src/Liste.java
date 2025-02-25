

// !Liste! für die Implementierung einer Liste
public class Liste <PP> {

    // !Erster! zeigt auf das erste Objekt der Liste
    public KnotenListe <PP> Erster;

    // !Letzter! zeigt auf das letzte Objekt der Liste
    public KnotenListe <PP> Letzter;

    // !Aktueller! zeigt auf das aktuell ausgewählte Objerkt der Listze
    public KnotenListe <PP> Aktueller;

    // !next! ist ein extra feld. Wird später genutzt
    public KnotenListe next;

    //  Ist = Null automatisch
    public Liste() {
        //
    }

    // Entfernt das erste Objekt der Liste
    public void remove() {
        KnotenListe aktuellerKunde = Erster;

        // Falls Liste = nicht Null
        if (Erster != null) {
            // Das erste Objekt wird entfernt, indem auf den Nachfolger gesetzt wird
            Erster = aktuellerKunde.getNachfolger();
        }
    }

    // Fügt ein neues Objekt am Ende der Liste hinzu(Also sozusagen dranghängen)
    public void append(PP pInhalt) {
        KnotenListe InhaltType = Erster;

        // Falls Liste =  Null
        if (Erster == null) {
            // Erstellt das erste Objekt und setzt 'Letzter' und 'Aktueller' darauf (Alle Zeiger zeigen auf ein Objkekt)
            Erster = new KnotenListe<PP>(pInhalt);
            Letzter = Erster;
            Aktueller = Letzter;
        } else {
            // Geht zum letzten Objekt der Liste
            while (InhaltType.getNachfolger() != null) {
                InhaltType =InhaltType.getNachfolger();
            }
            // Fügt das neue Objhekt am Ende der Liste hinzu
            InhaltType.setNachfolger(new KnotenListe<PP>(pInhalt));
            // zeigt !Letzten! auf den neusten Knoten
            Letzter = InhaltType.getNachfolger();
        }
    }

    // Fügt ein neues Objekt an der aktuellen gezeigten Position in der Liste ein
    public void insert(PP pInhalt) {
        // Haben wir überhaupt Zugriff? Falls Ja dann ...
        if (hasAccess()) {
            // Erstellen ein neuen Knoten mit (Random) Inhalt
            KnotenListe<PP> neuerKnoten = new KnotenListe<PP>(pInhalt);

            // Wenn der aktuelle Knoten der erste Knoten in der Liste ist (Aktueller ist 'Erster')
            if (Aktueller == Erster) {
                // Der neu drangehangene Knoten wird der neue erste Knoten
                neuerKnoten.setNachfolger(Erster);  // Der Nachfolger des neuen Knotens wird der alte erste Knoten
                Erster = neuerKnoten;               // Der neue Knoten wird nun der erste Knoten
            } else {
                // Der aktuelle Knoten ist nicht der erste, also müssen wir den vorherigen Knoten finden
                KnotenListe<PP> vorherigerKnoten = Erster;

                // Durch die Liste gehen wir rum, bis wir den Knoten vor dem aktuellen Knoten gewfunden haben
                while (vorherigerKnoten.getNachfolger() != Aktueller) {
                    vorherigerKnoten = vorherigerKnoten.getNachfolger();
                }

                // Der neue Knoten wird zwischen dem vorherigen Knoten und dem aktuellen Knoten eingefügt
                vorherigerKnoten.setNachfolger(neuerKnoten); // Der vorherige Knoten zeigt jetzt auf den neuen Knoten
                neuerKnoten.setNachfolger(Aktueller);       // Der neue Knoten zeigt auf den aktuellen Knoten
            }

            // Der aktuelle Knoten wird nun der neue Knoten
            Aktueller = neuerKnoten;
        }
    }


    // Checkt ab, ob die Liste = Null ist (alos leer ist)
    public boolean isEmpty() {
        return Erster == null;
    }

    // Checkt ob man Zugreifen kann auf die Liste
    public boolean hasAccess() {
        return Aktueller != null;
    }

    // Setzt den !Aktuellen! Knoten auf den nächsten Knoten der Liste
    public void next() {
        Aktueller = Aktueller.getNachfolger();
    }

    // Gibt den Inhalt des nächsten Knotens zurück (
    public PP getNext() {
        return (PP) next;
    }

    // Setzt den !Aktuellen! Knoten auf den ersten Knoten der Liste
    public void toFirst() {
        Aktueller = Erster;
    }

    // Setzt den !Aktuellen! Knoten auf den letzten Knoten der Liste
    public void toLast() {
        Aktueller = Letzter;
    }
}
