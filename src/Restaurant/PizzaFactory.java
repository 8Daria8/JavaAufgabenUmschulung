package Restaurant;

public class PizzaFactory {
    public Pizza erstellePizza(String typ) {
        switch (typ.toLowerCase()) {
            case "salami":
                return new SalamiPizza();
            case " veggie":
                return new VeggiePizza();
            case "margherita":
                return new MargheritaPizza();
            default:
                throw new IllegalArgumentException("Ungültiger Pizzatyp: " + typ);
        }
    }
}
