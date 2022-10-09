package bsuir.tozik.lab1.task1;

public class Calculations {

    double x = Math.random()*150-100;
    double y = Math.random()*150-100;

    public double calculate(){
        return (((1+Math.sin(x+y)*Math.sin(x+y))/(2+Math.abs(x-2*x/(1+x*x*y*y))))+x);
    }
}
