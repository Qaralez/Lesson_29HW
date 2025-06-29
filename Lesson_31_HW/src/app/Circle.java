package app;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    double calcArea() {
        return super.calcArea()+ Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle(" +
                "radius=" + radius +
                ")";
    }
}
