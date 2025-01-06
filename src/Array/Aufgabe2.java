package Array;

public class Aufgabe2 {
    public static void main(String[] args) {

        int[] meinArray = {22, 2, 21, 18, 7};

        System.out.println("Alle Elmente von Array: ");
        for (int array : meinArray) {
            System.out.print(array + " ");
        }

        meinArray[2] = meinArray[2] * meinArray[1];

        meinArray[0] = meinArray[0] / meinArray[3];

        if(meinArray[2] % meinArray[4] == 0) {
            System.out.println("5. Element ist Teiler vom 3. Element");
        } else {
            System.out.println("5. Element ist kein Teiler vom 3. Element");
        }

        System.out.println("Alle Elmente von Array: ");
        for (int array : meinArray) {
            System.out.print(array + " ");
        }
    }
}