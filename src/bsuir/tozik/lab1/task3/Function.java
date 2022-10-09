package bsuir.tozik.lab1.task3;

public class Function {
    double a = Math.random() * 20- 15;
    double b = Math.random() * 20 - 15;
    double h = Math.random() * 10 - 5;

    public void printResult(){
        double c;
        if (a>b) {
          c=a;
          a=b;
          b=c;
        }
        h=Math.abs(h);
        for (double i = a; i < b; i += h) {
            System.out.printf("%3f  %3f\n", i, Math.tan(i));
        }
    }
}
