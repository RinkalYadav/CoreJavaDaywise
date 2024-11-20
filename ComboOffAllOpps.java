package Abstraction.oops.nov12;
//Abstract class for Shape
abstract class Shape {
double area;

abstract void collectData();

abstract void calculate();

abstract void display();
}

//Circle class extends to Shape
class Circle extends Shape {
private double radius;
final private double pi = 3.14678;

@Override
void collectData() {
radius = 5;
}

void calculate() {
area = pi * radius * radius;
}

void display() {
System.out.println("Area of Circle is " + area);
}

}

//Square class extends to Shape

class Square extends Shape {
private double side;

@Override
void collectData() {
side = 5;
}

void calculate() {
area = side * side;
}

void display() {
System.out.println("Area of Square is " + side);
}

}
//Rectangle class extends to Shape

class Rectangle extends Shape {
private double l, b;

@Override
void collectData() {
l = 5;
b = 5;
}

void calculate() {
area = l * b;
}

void display() {
System.out.println("Area of Rectangle is " + area);
}

}
//Geometry class to use shape
class Geometry {
void useShape(Shape s) {
s.collectData();
s.calculate();
s.display();
}
}
//Main class
public class ComboOffAllOpps {
public static void main(String[] args) {
Geometry g = new Geometry();
Shape circle = new Circle();
Shape square = new Square();
Shape rectangle = new Rectangle();

g.useShape(circle);
g.useShape(square);
g.useShape(rectangle);

}

}

