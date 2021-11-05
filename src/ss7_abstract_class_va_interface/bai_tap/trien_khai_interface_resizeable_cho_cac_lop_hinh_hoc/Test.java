package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Square;

import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle();
        arr[1] = new Rectangle();
        arr[2] = new Square();
        for (Shape a : arr
        ) {
            if (a instanceof Circle) {
                Circle circle = (Circle) a;
                System.out.println("Diện tích trước khi tăng "+circle.getArea());
                circle.resize(Math.random()*99+1);
                System.out.println("Diện tích sau khi tăng "+circle.getArea());
                System.out.println("-------------------------------------");
            } else if (a instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) a;
                System.out.println("Diện tích trước khi tăng "+rectangle.getArea());
                rectangle.resize(Math.random()*99+1);
                System.out.println("Diện tích sau khi tăng "+rectangle.getArea());
                System.out.println("-------------------------------------");
            } else{
                Square square =(Square) a;
                System.out.println("Diện tích trước khi tăng "+square.getArea());
                square.resize(Math.random()*99+1);
                System.out.println("Diện tích sau khi tăng "+square.getArea());
                System.out.println("-------------------------------------");
            }
        }
    }
}
