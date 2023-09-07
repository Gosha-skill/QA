package ru.stqa.pft.sandbox;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.firstDot = 100;
        point.secondDot = 10;

        System.out.println("The coordinate of dots = " + point.firstDot + " and " + point.secondDot);
        System.out.println("Check method into the class of Point: Distance between two dots = " + distance(point, point));
    }
    public static double distance(Point a, Point b){
        return a.secondDot - b.firstDot;
    }
}
