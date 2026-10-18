abstract class Shape {
    abstract double calculateArea();
}
class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    double calculateArea() { return 3.14 * radius * radius; }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }
    double calculateArea() { return 0.5 * base * height; }
}
public class AbstractShapeDemo {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape t = new Triangle(4, 6);
        System.out.println("Circle area = " + c.calculateArea());
        System.out.println("Triangle area = " + t.calculateArea());
    }
}
