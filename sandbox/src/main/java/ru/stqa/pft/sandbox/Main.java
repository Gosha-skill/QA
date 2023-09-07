package ru.stqa.pft.sandbox;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(-5, 10);

        System.out.println("The coordinate of dots = " + point.firstDot + " and " + point.secondDot);
        System.out.println("Check method into the class of Point: Distance between two dots = " + point.distance());
    }
}
