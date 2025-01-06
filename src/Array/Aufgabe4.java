package Array;


public class Aufgabe4 {


    public static void main(String[] args) {
        int[] arr = {0, 2, 7, 8, 3, 9};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max: " + max);


    }
}
}
