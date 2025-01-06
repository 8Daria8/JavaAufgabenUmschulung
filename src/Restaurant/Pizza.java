package Restaurant;

public class Pizza {
    String name;

    public void zubereiten() {
        System.out.println(name + " wird zubereitet.");
    }

    public void backen() {
        System.out.println(name + " wird im Ofen gebacken.");
    }

    public void schneiden() {
        System.out.println(name + " wird geschnitten.");
    }

    public void einpacken() {
        System.out.println(name + " wird verpackt.");
    }

    public String getName() {
        return name;
    }
}
