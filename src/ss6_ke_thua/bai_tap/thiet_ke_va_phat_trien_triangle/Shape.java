package ss6_ke_thua.bai_tap.thiet_ke_va_phat_trien_triangle;

public class Shape {
    protected String color = "green";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        return "A Shape with color of "
                + getColor();
    }
}
