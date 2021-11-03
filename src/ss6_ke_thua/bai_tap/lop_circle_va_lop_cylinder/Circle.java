package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    public double radius;
    public String color;

    public Circle(double radius,String color) {
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    public String toString() {
        return "radius: "+this.radius+
                ", color: "+this.color+
                ", area: "+getArea();
    }
}
