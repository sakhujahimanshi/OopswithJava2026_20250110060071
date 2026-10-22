//Q2. Shape Area Calculator (Abstraction, Inheritance & Polymorphism)
/*
Scenario: An engineering firm builds a CAD tool that must calculate the area of different shapes — Circle and Rectangle — through a common interface, without the calling code knowing the exact shape type in advance. The firm wants every shape to guarantee an area() method, but the actual formula depends on the specific shape.
(a) Create an abstract class Shape with an abstract method double area(), and a method displayArea() that prints "Area = " followed by the computed area.  [3]
(b) Create two subclasses, Circle (with radius) and Rectangle (with length and width), each overriding area() with the correct formula. Use suitable constructors.  [4]
(c) Using the driver code below, store Circle and Rectangle objects in a single Shape[] array and call displayArea() on each, demonstrating runtime polymorphism.  [3]

*/
/*
Driver Code (given):
public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
 
        for (Shape s : shapes) {
            s.displayArea();   // must print correct area for each shape
        }
    }
}

*/

/* 
Write the Shape, Circle and Rectangle classes here:
class shape{

}
Class Circle{

}
Class rectangle {

}
*/
public class UseCase2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
 
        for (Shape s : shapes) {
            s.displayArea();   // must print correct area for each shape
        }
    }
}

abstract class Shape{
    abstract double area();
    void displayArea(){
        System.out.println("Area = "+area());
    }
}
class Circle extends Shape{
    double radius;
    Circle(double r){
        this.radius = r ;
    }
    double area(){
        return 22/7.0 * radius * radius ;
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double l , double w){
        this.length = l;
        this.width = w;
    }
    double area(){
        return length * width ;
    }
}