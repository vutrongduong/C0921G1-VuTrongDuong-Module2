package ss12_java_collections_framework.bai_tap.luyen_tap;

import java.util.*;

public class ProductManager {

    private List<Product>productList;

    public ProductManager() {
    }

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    {
        productList.add(new Product(1, "Cafe", 10000));
        productList.add(new Product(2, "Cam vắt", 20000));
        productList.add(new Product(3, "Nước cà rốt", 21000));
        productList.add(new Product(4, "Nước ép cà chua", 22000));
        productList.add(new Product(5, "Nước lọc", 8000));
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id của sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên của sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá của sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        productList.add(new Product(id, name, price));
    }

    public void suaTheoId(int id) {
        Scanner scanner = new Scanner(System.in);
        for (Product ele : productList) {
            if (ele.getId() == id) {
                System.out.println(ele);
            }
        }
        System.out.println("Nhập tên mới của sản phẩm: ");
        String newName = scanner.nextLine();
        System.out.println("Nhập giá mới của sản phẩm: ");
        int newPrice = Integer.parseInt(scanner.nextLine());
        for (Product add : productList) {
            if (add.getId() == id) {
                add.setName(newName);
                add.setPrice(newPrice);
            }
        }
    }

    public void xoaSanPhamTheoId(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if ((id == productList.get(i).getId())) {
                productList.remove(i);
            }
        }
    }

    public void disPlay() {
        for (Product ele : productList) {
            System.out.println(ele);
        }
    }

    public void timSanPhamTheoTen(String tenSanPham) {
        for (Product tim : productList) {
            if (tenSanPham.equals(tim.getName())) {
                System.out.println(tim);
            }
        }
    }

    public void sapXepTangDan() {
        SapXepTangDanTheoGia sapXepTangDanTheoGia = new SapXepTangDanTheoGia();
        Collections.sort(productList, sapXepTangDanTheoGia);
        for (Product tangDan : productList) {
            System.out.println(tangDan);
        }
    }

    public void sapXepGiamDan() {
        SapXepGiamDanTheoGia sapXepGiamDanTheoGia = new SapXepGiamDanTheoGia();
        Collections.sort(productList, sapXepGiamDanTheoGia);
        for (Product giamDan : productList) {
            System.out.println(giamDan);
        }
    }


}
