package Restaurant;

import javax.swing.*;

public class PizzaRestaurantProgramms {
    private PizzaFactory factory;

    public PizzaRestaurantProgramms(PizzaFactory factory) {
        this.factory = factory;
    }

    public void bestellePizza(String typ) {
        try {

            Pizza pizza = factory.erstellePizza(typ);


            System.out.println("Bestellung: " + pizza.getName());
            pizza.zubereiten();
            pizza.backen();
            pizza.schneiden();
            pizza.einpacken();
        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaRestaurantProgramms restaurant = new PizzaRestaurantProgramms(factory);


        String typ = JOptionPane.showInputDialog("Bitte gib den Typ der Pizza ein (Salami, Veggie, Margherita):");


        restaurant.bestellePizza(typ);
    }
}
