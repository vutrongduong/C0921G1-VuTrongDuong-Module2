package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yelow", true, 5.8);
        System.out.println(square);
//        square.resize(10);
//        System.out.println(square.getSide());
        System.out.println(square.getArea());
    }
}
