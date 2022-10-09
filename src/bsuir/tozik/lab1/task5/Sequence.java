package bsuir.tozik.lab1.task5;

public class Sequence {
    private int[] array;
    private void createArray() {
        java.util.Random random = new java.util.Random();

        int n = random.nextInt(10, 30);
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    public void printK(){
        createArray();
        int K = 0;
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < temp) {
               K++;
            } else {
                temp = array[i];
            }
        }
        System.out.println(K);
    }
}
