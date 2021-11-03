package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(2,3);
        System.out.println(point2D.toString());
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
