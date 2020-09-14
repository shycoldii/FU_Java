package abs_figures;
import abs_figures.Shape;

abstract class SolidOfRevolution extends Shape {
    protected double radius;

    public SolidOfRevolution(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}
