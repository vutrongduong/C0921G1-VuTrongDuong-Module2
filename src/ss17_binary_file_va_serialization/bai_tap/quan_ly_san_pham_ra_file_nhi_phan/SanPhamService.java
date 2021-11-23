package ss17_binary_file_va_serialization.bai_tap.quan_ly_san_pham_ra_file_nhi_phan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamService {
    Scanner scanner = new Scanner(System.in);

    List<SanPham> sanPhamList = new ArrayList<>();

    {
        sanPhamList=Write.readFile();
    }

    public void add() {
        System.out.println("Nhập mã sản phẩm ");
        int ma = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm ");
        String ten = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất ");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm ");
        double gia = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm ");
        String moTa = scanner.nextLine();
        sanPhamList.add(new SanPham(ma, ten, hangSanXuat, gia, moTa));
        Write.writeFile(sanPhamList);

    }
    public void display(){
        sanPhamList=Write.readFile();
        for (SanPham sanPham:sanPhamList) {
            System.out.println(sanPham);
        }

    }
    public void search(){
        sanPhamList=Write.readFile();
        System.out.println("Nhập mã sản phẩm muốn tìm ");
        int id=Integer.parseInt(scanner.nextLine());
        for (SanPham ele:sanPhamList) {
            if (ele.getMa()==id){
                System.out.println(ele);
            }
        }

    }
}
