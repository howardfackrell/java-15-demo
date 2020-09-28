package com.hlf;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

record GPoint(double x,  double y) {}

// todo had to disable the format plugin for maven, sealed interfaces not handled yet
sealed interface Areable permits Circle, Square {
    double area();
}

record Circle(GPoint center, double radius) implements Areable {
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

record Square(GPoint topLeft, double side) implements Areable {
    @Override
    public double area() {
        return side * side;
    }
}

// Not Permitted
//record Rectangle(GPoint topLeft, GPoint bottomRight) implements Areable {
//    @Override
//    public double area() {
//        double width = Math.abs(topLeft.x() - bottomRight.x());
//        double height = Math.abs(topLeft.y() - bottomRight.y());
//
//        return width * height;
//    }
//}




public class SealedClassTest {

    Areable enbiggen(Areable areable) {

        // https://openjdk.java.net/jeps/360 this switch should be allowed in the future, but not yet
//        return switch (areable) {
//          case Circle circle -> new Circle(circle.center(),  circle.radius() * 2);
//          case Square square -> new Square(square.topLeft(), square.side() * 2);
//        };

        Areable bigger = null;
        if (areable instanceof Circle circle) {
            bigger = new Circle(circle.center(), circle.radius() * 2);
        }
        else if (areable instanceof Square square) {
            bigger = new Square(square.topLeft(), square.side() * 2);
        }
        return bigger;
    }

    @Test
    void getArea() {
        Areable thing = new Square(new GPoint(3, 4), 10);
        Areable biggerThing = enbiggen(thing);

        Assertions.assertTrue(thing.area() < biggerThing.area());
    }
}
