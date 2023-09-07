package ru.stqa.pft.sandbox;

public class Rectangle {
    public double firstSideOfRec;
    public double secondSideOfRec;

    public  Rectangle(double firstSideOfRec, double secondSideOfRec){
        this.firstSideOfRec = firstSideOfRec;
        this.secondSideOfRec = secondSideOfRec;
    }

    public double rect(){
        return this.firstSideOfRec * this.secondSideOfRec;
    }
}
