package ss12_java_collections_framework.bai_tap.luyen_tap;

import java.util.Scanner;

public class view {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập id của sản phẩm: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập tên của sản phẩm: ");
//        String name = scanner.nextLine();
//        System.out.println("Nhập giá của sản phẩm: ");
//        int price = Integer.parseInt(scanner.nextLine());
//        productManager.addProduct(new Product(id, name, price));
        Product product = new Product(1, "Cafe", 10000);
        Product product1 = new Product(2, "Cam vắt", 20000);
        Product product2 = new Product(3, "Nước cà rốt", 21000);
        Product product3=new Product(4,"Nước lọc",8000);
        productManager.addProduct(product);
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.suaTheoId(new Product(1, "Nước dừa", 23000));
        productManager.xoaSanPhamTheoId(2);
        for (Product ele : productManager.getProductList()) {
            System.out.println(ele);
        }
        System.out.println("Sắp xếp giảm dần theo giá: ");
        productManager.sapXepGiamDan();
        System.out.println("===============");
        System.out.println("Sắp xếp tăng dần theo giá: ");
        productManager.sapXepTangDan();
    }
}
