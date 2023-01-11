package cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {

        return radius;
    }
    public double getArea(){
        double area = (radius * radius * Math.PI);
        return area;
    }
}
