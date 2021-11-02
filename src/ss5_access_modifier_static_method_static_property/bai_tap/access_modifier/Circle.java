package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getArea() {
        return this.color;
    }
}
