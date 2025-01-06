package Konto;

public class GiroKonto extends Konto {
    private double limit;


    public GiroKonto(String kontoNummer, double kontoStand, double limit) {
        super(kontoNummer, kontoStand);
        this.limit = limit;
    }


    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

}
