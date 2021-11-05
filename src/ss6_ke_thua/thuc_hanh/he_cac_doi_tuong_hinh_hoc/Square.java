package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.Colorable;
import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Resizeable;

public class Square extends Rectangle implements Resizeable ,Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
    }
    public double getArea(){
        return getSide()*getSide();
    }
//    @Override
//    public void setWidth(double width) {
//        setSide(width);
//    }
//
//    @Override
//    public void setLength(double length) {
//        setSide(length);
//    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize (double percent){
        setSide(getSide()*Math.sqrt((100+percent)/100));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

