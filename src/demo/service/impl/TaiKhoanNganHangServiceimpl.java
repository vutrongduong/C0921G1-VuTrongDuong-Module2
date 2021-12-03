package demo.service.impl;

import case_study.models.Customer;
import case_study.utils.FileCSV;
import demo.models.TaiKhoanNganHang;
import demo.models.TaiKhoanThanhToan;
import demo.models.TaiKhoanTietKiem;
import demo.service.TaiKhoanThanhToanService;

import java.util.*;

public class TaiKhoanNganHangServiceimpl implements TaiKhoanThanhToanService {
    static final String pathTaiKhoanNganHang = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\demo\\data\\bank_accounts.csv";

    Scanner scanner = new Scanner(System.in);
    List<TaiKhoanNganHang> taiKhoanNganHangSet = new ArrayList<>();

    //    Set<TaiKhoanNganHang> taiKhoanThanhToanSet = new TreeSet<>();
//    Set<TaiKhoanNganHang> taiKhoanTietKiemSet = new TreeSet<>();
    {
        taiKhoanNganHangSet = convertRead();
    }

    @Override
    public void add() {
        System.out.println("Nhập id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã tài khoản :");
        long maTaiKhoan = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập tên chủ tài khoản :");
        String ten = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản :");
        String ngayTao = scanner.nextLine();
        System.out.println("Chọn tài loại khoản muốn thêm :\n" +
                "1. Tài khoản thanh toán\n" +
                "2. Tài khoản tiết kiệm ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Nhập số thẻ :");
                long soThe = Long.parseLong(scanner.nextLine());
                System.out.println("Nhập số tiền trong tài khoản");
                long soTienTrongTaiKhoan = Long.parseLong(scanner.nextLine());
                taiKhoanNganHangSet.add(new TaiKhoanThanhToan(id, maTaiKhoan, ten, ngayTao, soThe, soTienTrongTaiKhoan));
                FileCSV.writeFileCSV(convertWrite(), pathTaiKhoanNganHang);
                break;
            case 2:
                System.out.println("Nhập số tiền gửi tiết kiệm :");
                long tienGui = Long.parseLong(scanner.nextLine());
                System.out.println("Nhập ngày gửi tiết kiệm :");
                String ngayGui = scanner.nextLine();
                System.out.println("Nhập lãi xuất :");
                int laiXuat = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập kì hạn (tháng) :");
                int kiHan = Integer.parseInt(scanner.nextLine());
                taiKhoanNganHangSet.add(new TaiKhoanTietKiem(id, maTaiKhoan, ten, ngayTao, tienGui, ngayGui, laiXuat, kiHan));
                FileCSV.writeFileCSV(convertWrite(), pathTaiKhoanNganHang);
                break;
            default:
                System.out.println("Không có loại tài khoản này , Nhập từ 1 đến 2 ");
        }
    }

    @Override
    public void delete() {


    }

    @Override
    public void display() {

    }

    @Override
    public void search() {

    }

    public List<String> convertWrite() {
        List<String> stringList = new ArrayList<>();
        for (TaiKhoanNganHang taiKhoanNganHang : taiKhoanNganHangSet) {
            if (taiKhoanNganHang instanceof TaiKhoanThanhToan) {
                stringList.add(taiKhoanNganHang.toString());
            } else {
                stringList.add(taiKhoanNganHang.toString());
            }
        }
        return stringList;
    }


    public List<TaiKhoanNganHang> convertRead() {
        List<String> stringList = FileCSV.readFileCSV(pathTaiKhoanNganHang);
        String[] arr;
        for (String line : stringList) {
            arr = line.split(",");
            if (arr.length == 6)
                taiKhoanNganHangSet.add(new TaiKhoanThanhToan(Integer.parseInt(arr[0]), Long.parseLong(arr[1]), arr[2], arr[3], Integer.parseInt(arr[4]), Long.parseLong(arr[5])));
            if (arr.length == 8)
                taiKhoanNganHangSet.add(new TaiKhoanTietKiem(Integer.parseInt(arr[0]), Long.parseLong(arr[1]), arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]), Integer.parseInt(arr[7])));
        }
        return taiKhoanNganHangSet;
    }
}
