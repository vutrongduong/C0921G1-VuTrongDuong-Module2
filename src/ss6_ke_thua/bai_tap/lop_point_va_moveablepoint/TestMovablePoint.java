package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(1,2,3,4);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
