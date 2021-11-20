public class Circle extends Shape implements java.io.Serializable {
    String name = "Circle";
    double radius, area, perimeter;

    public Circle(double radius) {
        this.radius = radius;
        this.CalculateArea();
        this.CalculatePerimeter();
    }

    public double CalculateArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    public double CalculatePerimeter() {
        perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

}
