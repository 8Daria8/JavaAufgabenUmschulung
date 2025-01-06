package Konto;

public class Main {
    public static void main(String[] args) {

        Konto meinKonto = new Konto("832758", 1000.0);
        Konto giroKonto = new Konto("342759", 4000.0);

        System.out.println("Kontonummer: " + meinKonto.getKontoNummer());
        System.out.println("Kontostand: " + meinKonto.getKontoStand());

        meinKonto.einzahlen(346.6);
        System.out.println("Nach Einzahlung von 346.6 €: ");
        System.out.println("Kontostand: " + meinKonto.getKontoStand());


        meinKonto.auszahl(289.0);
        System.out.println("Nach Auszahl von 289.0 €: ");
        System.out.println("Kontostand: " + meinKonto.getKontoStand());




    }
}
