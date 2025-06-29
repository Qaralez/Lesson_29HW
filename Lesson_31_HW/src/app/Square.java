package app;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calcArea() {
        return super.calcArea()+side*side;
    }

    @Override
    public String toString() {
        return "Square(" +
                "side=" + side +
                ")";
    }
}
