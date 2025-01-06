package Array;

public class Aufgabe1 {

    public static void main(String[] args) {

        int[] temperaturen = {12, 15, 14, 17, 22, 19, 16};
        int summe = 0;

        System.out.println("Temperaturen der Woche:");
        for (int temp : temperaturen) {
            summe += temp;
            System.out.print(temp + "°C  ");
        }
        int durchschnitt = summe / temperaturen.length;

        System.out.println("Die durchschnittliche Temperatur der Woche ist: " + durchschnitt + "°C");


    }
}
