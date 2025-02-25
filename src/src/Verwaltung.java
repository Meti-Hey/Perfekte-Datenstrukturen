

import java.util.Scanner;

public class Verwaltung {

    private Scanner scanner;

    public static void main(String[] args) {
        new Verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");
    }

    public Verwaltung() {
        scanner = new Scanner(System.in);

        // Instanzierung der Warteschlange, des Stacks und der Liste
        warteschlange<Kunde> warteschlange = new warteschlange<>();
        Stack<Kunde> stack = new Stack<>();
        Liste<Kunde> liste = new Liste<>();

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Einlassen zur Warteschlange");
            System.out.println("[2] Manuell Einlassen zur Warteschlange");
            System.out.println("[3] Abschieben aus der Warteschlange");
            System.out.println("[4] Inhalt der Warteschlange Anzeigen");
            System.out.println("[5] Einlassen zum Stack");
            System.out.println("[6] Abschieben aus dem Stack");
            System.out.println("[7] Zeige Inhalt des Stacks");
            System.out.println("[8] Einlassen zur Liste");
            System.out.println("[9] Abschieben aus der Liste");
            System.out.println("[10] Zeige Inhalt der Liste");
            System.out.println("[11] Beenden");
            int option = scanner.nextInt();
            scanner.nextLine(); // Scanner leeren

            switch (option) {
                case 1: // Mehrere Kunden zur Warteschlange hinzufügen
                    System.out.println("Wie viele sollen es Insgesamt an so einen wundervollen tag werden?");
                    int numCustomers = scanner.nextInt();
                    for (int i = 0; i < numCustomers; i++) {
                        Kunde kunde = new Kunde("Kunde" + i);
                        warteschlange.einfuegen(kunde);
                    }
                    break;
                case 2: // Manuell einen Kunden zur Warteschlange hinzufügen
                    System.out.println("Der Name Bitte:");
                    String name = scanner.nextLine();
                    Kunde kundeM = new Kunde(name);
                    warteschlange.einfuegen(kundeM);
                    break;
                case 3: // Kunden aus der Warteschlange entfernen
                    warteschlange.entfernen();
                    break;
                case 4: // Inhalt der Warteschlange anzeigen
                    Kunde hilfeWarteschlange = (Kunde) warteschlange.gibErsten();
                    if (hilfeWarteschlange != null) {
                        System.out.println("Erster wäre da: " + hilfeWarteschlange.getName());
                    } else {
                        System.out.println("Nichts ist drinne.");
                    }
                    break;
                case 5: // Einen Kunden zum Stack hinzufügen
                    System.out.println("Name fürs Objekt,welches sie Meister hinzufügen wollen:");
                    String stackName = scanner.nextLine();
                    Kunde stackKunde = new Kunde(stackName);
                    stack.add(stackKunde);
                    break;
                case 6: // Einen Kunden aus dem Stack entfernen
                    stack.remove();
                    break;
                case 7: // Inhalt des Stacks anzeigen
                    Kunde hilfeStack = stack.getInhalt();
                    if (hilfeStack != null) {
                        System.out.println("Top Supporter wäre: " + hilfeStack.getName());
                    } else {
                        System.out.println("Nichts ist drinne.");
                    }
                    break;
                case 8: // Einen Kunden zur Liste hinzufügen
                    System.out.println("Name fürs Objekt,welches sie Meister hinzufügen wollen:");
                    String listeName = scanner.nextLine();
                    Kunde listeKunde = new Kunde(listeName);
                    liste.append(listeKunde);
                    break;
                case 9: // Einen Kunden aus der Liste entfernen
                    liste.remove();
                    break;
                case 10: // Inhalt der Liste anzeigen
                    if (liste.isEmpty()) {
                        System.out.println("Nichts ist drinne.");
                    } else {
                        System.out.println("Erster wäre hier: " + liste.Erster.getInhalt());
                    }
                    break;
                case 11: // Programm beenden
                    System.out.println("Finito, dennoch können sie gerne auch mehr versuchen.");
                    return; // Programm beenden
                default:
                    System.out.println("Funktioniert nicht, Nochmal bitte.");
                    break;
            }
        }
    }
}
