package bsuir.tozik.lab1.task2;

public class Belonging {
    double x = Math.random()*15-10;
    double y = Math.random()*15-10;

    public boolean IsBelong(){
        return ((x >= -4 && x <= 4 && y >= 0 && y <= 5)
                || (x >= -6 && x <= 6 && y >= -3 && y <= 0));
    }
}
