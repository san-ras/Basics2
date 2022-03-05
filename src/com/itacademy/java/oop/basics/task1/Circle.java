package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape {
    private double radius;
    private double area;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        this.area = Math.round(radius * radius * Math.PI);
    }

    @Override
    void calculatePerimeter() {
        this.perimeter = Math.round(Math.PI * 2 * radius);
    }

    @Override
    public String toString() {
        return "When circle's " +
                "radius is " + radius +
                ", its area is " + area +
                " and perimeter is " + perimeter +
                ".";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
