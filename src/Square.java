public class Square extends Rectangle {
    String name = "Square";
    public Square(double side) {
        super(side, side); // set values of length and breadth in Rectangle class
        this.CalculateArea();
        this.CalculatePerimeter();
    }

    public double CalculatePerimeter() {
        this.perimeter = this.length * 4;
        return this.perimeter; //override parent method with new formula
    }
}
