package bsuir.tozik.lab1.task4;

public class PrimeNumbers {
    private int[] array;
    private void createArray() {
        java.util.Random random = new java.util.Random();

        int n = random.nextInt(10, 30);
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    public void printPrime() {
        createArray();
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.println(i);
            }
        }
    }

    public boolean isPrime(int a){
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
