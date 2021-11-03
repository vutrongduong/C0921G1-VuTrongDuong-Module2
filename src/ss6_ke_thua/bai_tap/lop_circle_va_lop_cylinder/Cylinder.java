package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return this.radius * this.radius * Math.PI * this.height;
    }

    public String toString() {
        return super.toString() +
                ", height: " + this.height +
                ", volume: " + getVolume();
    }
}



