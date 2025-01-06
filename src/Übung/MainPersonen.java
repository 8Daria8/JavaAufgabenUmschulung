package Übung;

public class MainPersonen {
    public static void main(String[] args) {


        Lehrkraft lehrkraft1 = new Lehrkraft("Herr Müller", 1234, "Mathematik");
        Lehrkraft lehrkraft2 = new Lehrkraft("Herr Kocher", 16634, "Physik");
        Lehrkraft lehrkraft3 = new Lehrkraft("Frau Mayer", 34534, "Chemie");


        Studierende studierende1 = new Studierende("Alex Schmidt", 24535, "Informatik");
        Studierende studierende2 = new Studierende("Maria Schneider", 24536, "Maschinenbau");
        Studierende studierende3 = new Studierende("Anna Fischer", 24537, "BWL");


        System.out.println("Alle Personen:");
        System.out.println(lehrkraft1);
        System.out.println(lehrkraft2);
        System.out.println(lehrkraft3);
        System.out.println(studierende1);
        System.out.println(studierende2);
        System.out.println(studierende3);

    }
}

}
