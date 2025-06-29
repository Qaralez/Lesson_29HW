package app;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return super.calcArea()+width*height;
    }

    @Override
    public String toString() {
        return "Rectangle(" +
                "width=" + width +
                ", height=" + height +
                ")";
    }
}
