public class Rectangle extends Shape implements java.io.Serializable {
    String name = "Rctangle";
    double length, width, area, perimeter;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.CalculateArea();
        this.CalculatePerimeter();
    }

    public double CalculateArea() {
        area = length * width;
        return area;
    }

    public double CalculatePerimeter() {
        perimeter = 2 * (length + width);
        return perimeter;
    }
}
