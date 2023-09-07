package ru.stqa.pft.sandbox;

public class Main {
    public static void main(String[] args) {
        Square sideInSquare = new Square(5);
        Rectangle sideInRectangle = new Rectangle(100, 100);

        System.out.println("The side of area: " + sideInSquare.side);
        System.out.println("The total sum of area = " + sideInSquare.area());
        System.out.println();

        System.out.println("The first side of rectangle: " + sideInRectangle.firstSideOfRec);
        System.out.println("The second side of rectangle: " + sideInRectangle.secondSideOfRec);
        System.out.println("The total sum of area = " + sideInRectangle.rect());
    }
}
