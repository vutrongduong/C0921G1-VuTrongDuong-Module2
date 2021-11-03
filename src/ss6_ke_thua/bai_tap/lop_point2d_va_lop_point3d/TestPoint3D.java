package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D =new Point3D(2,3,1);
        System.out.println(point3D.toString());
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
