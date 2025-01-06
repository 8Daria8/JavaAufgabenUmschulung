package Konto;

public class Konto {

    protected String kontoNummer;
    protected double kontoStand;

    public Konto(String kontoNummer, double kontoStand) {
        this.kontoNummer = kontoNummer;
        this.kontoStand = kontoStand;
    }

    public String getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(String kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public void setKontoStand(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public void einzahlen(double betrag) {
        if(betrag > 0) {
            this.kontoStand += betrag;
        } else {
            System.out.println("Der Betrrag muss positiv sein. ");
        }
    }

    public void auszahl(double betrag) {
        if(betrag > 0 && betrag <= kontoStand) {
            kontoStand -= betrag;
        } else if (betrag > kontoStand) {
            System.out.println("Nicht genügen Guthaben ");
        } else {
            System.out.println("Der Betrag muss positiv sein. ");
        }
    }
}
}
