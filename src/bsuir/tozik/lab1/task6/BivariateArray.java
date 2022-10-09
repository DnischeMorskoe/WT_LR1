package bsuir.tozik.lab1.task6;

public class BivariateArray {
    private double[] array;
    private  double[][] resultArray;

    private void createArray() {
        java.util.Random random = new java.util.Random();

        int n = random.nextInt(10, 30);
        array = new double[n];
        resultArray = new double[n][n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100 - 50;
        }
    }

    public  void  makeMatrix(){
        createArray();
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0, sequenceIndex = i; j < resultArray[i].length; j++) {
                resultArray[i][j] = array[sequenceIndex];
                sequenceIndex++;
                if (sequenceIndex >= array.length) {
                    sequenceIndex = 0;
                }
                System.out.printf("%10.2f", resultArray[i][j]);
            }
            System.out.println();
        }
    }
}
