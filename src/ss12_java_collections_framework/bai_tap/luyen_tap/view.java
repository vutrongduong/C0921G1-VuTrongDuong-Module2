package ss12_java_collections_framework.bai_tap.luyen_tap;

import java.util.Scanner;

public class view {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choice;
        do {
            System.out.println("1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần theo giá\n" +
                    "7.Sắp xếp sản phẩm giảm dần theo giá\n" +
                    "8.Thoát chương trình");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    System.out.println("Nhập id sản phẩm cần sửa");
                    int id = Integer.parseInt(scanner.nextLine());
                    productManager.suaTheoId(id);
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm cần xóa");
                    int idXoa = Integer.parseInt(scanner.nextLine());
                    productManager.xoaSanPhamTheoId(idXoa);
                    break;
                case 4:
                    productManager.disPlay();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm cần tìm: ");
                    String tenSanPham = scanner.nextLine();
                    productManager.timSanPhamTheoTen(tenSanPham);
                    System.out.println(tenSanPham);
                    break;
                case 6:
                    productManager.sapXepTangDan();
                    break;
                case 7:
                    productManager.sapXepGiamDan();
                    break;
                case 8:
                    System.exit(0);
            }
        } while (true);
    }

}
