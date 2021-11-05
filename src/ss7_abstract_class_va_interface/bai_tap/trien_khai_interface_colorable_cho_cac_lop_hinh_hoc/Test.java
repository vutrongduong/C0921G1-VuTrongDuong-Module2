package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle();
        arr[1] = new Square();
        arr[2] = new Rectangle();
        for (Shape sh : arr
        ) {
            if (sh instanceof Square) {
                Square square = (Square) sh;
                System.out.println("Diện tích: " + square.getArea());
                square.howToColor();
                System.out.println("-------------------------------");
            } else if (sh instanceof Circle) {
                Circle circle = (Circle) sh;
                System.out.println("Diện tích: " + circle.getArea());
                System.out.println("-------------------------------");
            } else {
                Rectangle rectangle = (Rectangle) sh;
                System.out.println("Diện tích: " + rectangle.getArea());
                System.out.println("-------------------------------");
            }
        }
    }
}
