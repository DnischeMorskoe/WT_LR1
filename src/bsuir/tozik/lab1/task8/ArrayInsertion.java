package bsuir.tozik.lab1.task8;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class ArrayInsertion {
    private double[] array1;
    private double[] array2;
    private double[] resultArray;
    private List<Integer> positionsForInsertion;

    private void createArray() {
        java.util.Random random = new java.util.Random();

        int n = random.nextInt(10, 30);
        int m = random.nextInt(10, 30);

        array1 = new double[n];
        array2 = new double[m];
        resultArray = new double[n + m];
        positionsForInsertion = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = Math.random() * 20 - 15;
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = Math.random() * 20 - 15;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);
    }

    private void createNewArray() {
        int index2 = 0;
        int resultIndex = 0;
        int insertionIndex = 0;
        int index1 = 0;

        createArray();

        while (array2[index2] <= array1[index1]) {
            resultArray[resultIndex] = array2[index2];
            resultIndex++;
            positionsForInsertion.add(insertionIndex, resultIndex);
            insertionIndex++;
            if (index2 + 1 != array2.length) {
                index2++;
            }
        }

        for (index1 = 0; (index1 < array1.length - 1)
                && (index1 != array2.length); index1++) {
            resultArray[resultIndex] = array1[index1];
            resultIndex++;
            while ((array2[index2] >= array1[index1])
                    && (array2[index2] <= array1[index1 + 1])) {
                resultArray[resultIndex] = array2[index2];
                resultIndex++;
                positionsForInsertion.add(insertionIndex, resultIndex);
                insertionIndex++;
                index2++;
                if (index2 == array2.length) {
                    break;
                }
            }
        }
        resultArray[resultIndex] = array1[index1];
        resultIndex++;
        index1++;
        while (index2 != array2.length) {
            resultArray[resultIndex] = array2[index2];
            resultIndex++;
            positionsForInsertion.add(insertionIndex, resultIndex);
            insertionIndex++;
            index2++;
        }
        while (index1 != array1.length) {
            resultArray[resultIndex] = array1[index1];
            resultIndex++;
            index1++;
        }
    }
    public void printNewArray() {
        createNewArray();

        for (Integer position : positionsForInsertion) {
            System.out.print(position + " ");
        }
    }
}
