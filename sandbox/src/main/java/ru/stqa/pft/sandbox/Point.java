package ru.stqa.pft.sandbox;

public class Point {
    public double firstDot;
    public double secondDot;

    public Point(){
        firstDot = 0;
        secondDot = 0;
    }
    public Point(double firstDot, double secondDot){
        this.firstDot = firstDot;
        this.secondDot = secondDot;
    }

    public double distance(){
        return this.secondDot - this.firstDot;
    }
}
