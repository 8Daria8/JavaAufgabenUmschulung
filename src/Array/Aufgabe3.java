package Array;

import javax.swing.*;

public class Aufgabe3 {
    public static void main(String[] args) {

        int[] zahlen = {5, 52, 10, 9, 12, 3 };
        int max = zahlen[0];
        int min = zahlen[0];

        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] > max) {
                max = zahlen[i];
            }
            if (zahlen[i] < min) {
                min = zahlen[i];
            }
        }
        String massage = "max: " + max + ", min: " + min;


        JOptionPane.showMessageDialog(null, massage);


    }
}


