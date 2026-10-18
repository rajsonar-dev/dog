interface Shape { double calculateArea(); }
class Circle implements Shape {
    double r;
    Circle(double r) { this.r = r; }
    public double calculateArea() { return 3.14 * r * r; }
}
class Rectangle implements Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    public double calculateArea() { return l * w; }
}
public class InterfaceShapeDemo {
    public static void main(String[] args) {
        Shape c = new Circle(3);
        Shape r = new Rectangle(4, 5);
        System.out.println("Circle area = " + c.calculateArea());
        System.out.println("Rectangle area = " + r.calculateArea());
    }
}
