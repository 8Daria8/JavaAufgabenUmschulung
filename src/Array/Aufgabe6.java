package Array;

public class Aufgabe6 {
    public static void main(String[] args) {

        int[] zahlen = {6, 5, 7, 8, 3,9};

        int[] result = new int[zahlen.length];


        for (int i = 0; i < zahlen.length; i++) {
            int count = 0;
            for (int j = i + 1; j < zahlen.length; j++) {
                if (zahlen[j] > zahlen[i]) {
                    count++;
                }
            }
            result[i] = count;
        }

        // Выводим результат
        System.out.print("Результат: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

}
