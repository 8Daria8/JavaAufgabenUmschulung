package Übung;

public class Personen {
    protected String name;
    protected int id;


    public Personen(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Name: " + name + " ID: " + id;
    }
}

}
