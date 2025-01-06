package Übung;

public class Studierende extends Personen {

    protected String kurs;

    public Studierende(String name, int id, String kurs) {
        super(name, id);
        this.kurs = kurs;
    }


    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public String toString() {
        return super.toString() + ", Typ: Studierender, Kurs:'" + kurs + "'";
    }

}
