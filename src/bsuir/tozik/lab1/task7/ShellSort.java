package bsuir.tozik.lab1.task7;

public class ShellSort {
    private double[] array;

    public void sortArray() {
        double temp;

        createArray();

        for (int i = 0; i < array.length - 1; ) {
            if (array[i+1] > array[i]) {
                i++;
            } else {
                temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                if (i != 0) {
                    i--;
                }
            }
        }
    }

    private void createArray() {
        java.util.Random random = new java.util.Random();

        int n = random.nextInt(10, 30);
        array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 20 - 15;
        }
    }
}
