public class Triangle extends Shape implements java.io.Serializable {
    String name = "Triangle";
    double base, height, side1, side2, area, perimeter; // base acts as third side

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.CalculateArea();
        this.CalculatePerimeter();
    }

    public double CalculateArea() {
        area = base * height * 0.5;
        return area;
    }

    public double CalculatePerimeter() {
        perimeter = side1 + side2 + base;
        return perimeter;
    }
}
