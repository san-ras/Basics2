package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {
    public static void main(String[] args) {

        Shape circle = new Circle(4.2);
        Shape square = new Square(6.6);

        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println(circle.toString());

        square.calculateArea();
        square.calculatePerimeter();
        System.out.println(square.toString());

    }

}
