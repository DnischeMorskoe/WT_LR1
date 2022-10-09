package bsuir.tozik.lab1.task9;

import bsuir.tozik.lab1.task9.Ball;
import bsuir.tozik.lab1.task9.Basket;
public class Task9 {

    public static void main(String[] args) {
        Basket basket = new Basket();
        AddBallsToBasket(basket);
        System.out.printf("%.2f\n", basket.getBallWeight());
        System.out.println(basket.getBallCountByColor("Blue"));
    }
    public static void AddBallsToBasket(Basket basket) {
        basket.addBall(new Ball(Math.random() * 15, "Red"));
        basket.addBall(new Ball(Math.random() * 15, "Orange"));
        basket.addBall(new Ball(Math.random() * 15, "Blue"));
        basket.addBall(new Ball(Math.random() * 15, "Blue"));
        basket.addBall(new Ball(Math.random() * 15, "Green"));
        basket.addBall(new Ball(Math.random() * 15, "Blue"));
    }
}
