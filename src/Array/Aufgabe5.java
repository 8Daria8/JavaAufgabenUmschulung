package Array;
import java.util.Arrays;

public class Aufgabe5 {
    public static void main(String[] args) {

        int[] array = {8, 2, 7, 9, 3, 0};


        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        int a = array[0];
        array[0] = array[minIndex];
        array[minIndex] = a;
        if (maxIndex == array.length - 1) {
            System.out.println(Arrays.toString(array));
        }


        System.out.println("array: " + Arrays.toString(array));
    }
}

}
