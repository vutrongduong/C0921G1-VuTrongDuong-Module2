package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.Colorable;
import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Resizeable;

public class Square extends Shape implements Resizeable, Colorable {
    double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() * Math.sqrt((100 + percent) / 100));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public int getArea() {
        return (int) (this.side * this.side);
    }
}

