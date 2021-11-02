package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Fan {


    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    public Fan(boolean on, int speed, double radius, String color) {
        this.on = on;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    private boolean on = false;
    private int speed = 1;
    private double radius = 5;
    private String color = "blue";


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Fan{" +
                    "on=" + on +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan{" +
                    " radius=" + radius +
                    ", color='" + color +
                    ", fan is off" + '\'' +
                    '}';
        }
    }
}
