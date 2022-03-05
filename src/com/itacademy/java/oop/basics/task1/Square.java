package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {

    private double side;
    private double area;
    private double perimeter;

    // Klausimas: ar reikia area ir perimeter kurti cia, ar geriau kurti Shape klasej?

    public Square(double side) {
        this.side = side;
    }

    @Override
    void calculateArea() {
        this.area = Math.round(side * side);

    }

    @Override
    void calculatePerimeter() {
        this.perimeter = Math.round(side * 4);
    }

    @Override
    public String toString() {
        return "When square's " +
                "side is " + side +
                ", its area is " + area +
                " and perimeter is " + perimeter +
                ".";
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
