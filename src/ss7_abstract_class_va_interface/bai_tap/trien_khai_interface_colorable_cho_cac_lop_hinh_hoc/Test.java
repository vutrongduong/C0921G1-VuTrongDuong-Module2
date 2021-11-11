package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;


import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[10];
        arr[0] = new Circle();
        arr[2] = new Rectangle();
        arr[1] = new Square();
        for (Shape shape : arr) {
            if (shape != null) {
                System.out.println("Diện tích: "+shape.getArea());
                if (shape instanceof Square) {
                    ((Square) shape).howToColor();
                }
            }
        }
    }
}
