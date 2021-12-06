package demo.service.impl;

import case_study.utils.FileCSV;
import demo.models.TaiKhoanNganHang;
import demo.models.TaiKhoanThanhToan;
import demo.models.TaiKhoanTietKiem;
import demo.service.TaiKhoanNganHangService;
import demo.validate.NotFoundBankAccountException;
import demo.validate.Validate;

import java.util.*;

public class TaiKhoanNganHangServiceimpl implements TaiKhoanNganHangService {
    static final String pathTaiKhoanNganHang = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\demo\\data\\bank_accounts.csv";

    Scanner scanner = new Scanner(System.in);
    List<TaiKhoanNganHang> taiKhoanNganHangSet = new ArrayList();

    {
        taiKhoanNganHangSet = convertRead();
    }

    @Override
    public void add() {
        int id = 0;
        for (TaiKhoanNganHang e : taiKhoanNganHangSet) {
            id = e.getId();
        }
        id = id + 1;
        System.out.println("Id : " + id);
        System.out.println("Nhập mã tài khoản :");
        String maTaiKhoan = scanner.nextLine();
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
                String soThe = Long.toString(Validate.checkSo(scanner.nextLine()));
                System.out.println("Nhập số tiền trong tài khoản");
                long soTienTrongTaiKhoan = Validate.checkSo(scanner.nextLine());
                taiKhoanNganHangSet.add(new TaiKhoanThanhToan(id, maTaiKhoan, ten, ngayTao, soThe, soTienTrongTaiKhoan));
                FileCSV.writeFileCSV(convertWrite(), pathTaiKhoanNganHang);
                break;
            case 2:
                System.out.println("Nhập số tiền gửi tiết kiệm :");
                long tienGui = Validate.checkSo(scanner.nextLine());
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
        int index = -1;
        while (true) {
            try {
                System.out.println("Nhập mã tài khoản ngân hàng");
                String maTaiKhoan = scanner.nextLine();
                for (TaiKhoanNganHang taiKhoanNganHang : taiKhoanNganHangSet) {
                    if (taiKhoanNganHang.getMaTaiKhoan().equals(maTaiKhoan)) {
                        index = taiKhoanNganHangSet.indexOf(taiKhoanNganHang);
                    }
                }
                if (index != -1) {
                    taiKhoanNganHangSet.remove(index);
                    display();
                    FileCSV.writeFileCSV(convertWrite(), pathTaiKhoanNganHang);
                    System.out.println("Nhấn Enter để quay lại menu chính");
                    String nhap = scanner.nextLine();
                    if (nhap.equals("")) {
                        break;
                    }
                } else {
                    throw new NotFoundBankAccountException();
                }
            } catch (NotFoundBankAccountException e) {
                e.getMessage();
            }
        }
    }


    @Override
    public void display() {
        for (TaiKhoanNganHang ele : taiKhoanNganHangSet) {
//            if (ele instanceof TaiKhoanThanhToan) {
////              System.out.printf("|%3s | %-10s |%-5s |%-10s|%-5s |%-10s","STT", "Id", "Tên","ngày tạo tài khoản","số thẻ","số tiền trong tài khoản");
//                System.out.printf("|%3i |%-10s |%-5s |%-10s |%-5s |%-10s |%n", ele.getId() + ele.getMaTaiKhoan() + ele.getTen() + ele.getNgayTao() + ((TaiKhoanThanhToan) ele).getSoThe() + ((TaiKhoanThanhToan) ele).getSoTienTrongTaiKhoan());
//                System.out.println(ele);
//            } else if (ele instanceof TaiKhoanTietKiem) {
//
//            }
//        }
////        System.out.printf("|%3s | %-10s |%-5s |%n","STT", "Id", "Tên","");
            System.out.println(ele);
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập mã tài khoản hoặc tên chủ tài khoản");
        String check = scanner.nextLine();
        for (TaiKhoanNganHang t : taiKhoanNganHangSet) {
            if (t.getTen().toLowerCase().contains(check) || t.getMaTaiKhoan().contains(check)) {
                System.out.println(t);
            }
        }
    }

    public List<String> convertWrite() {
        List<String> stringList = new ArrayList<>();
        for (TaiKhoanNganHang ele : taiKhoanNganHangSet) {
            if (ele instanceof TaiKhoanThanhToan) {
                stringList.add(ele.getId() + "," + ele.getMaTaiKhoan() + "," + ele.getTen() + "," + ele.getNgayTao() + "," + ((TaiKhoanThanhToan) ele).getSoThe() + "," + ((TaiKhoanThanhToan) ele).getSoTienTrongTaiKhoan());
            } else if (ele instanceof TaiKhoanTietKiem) {
                stringList.add(ele.getId() + "," + ele.getMaTaiKhoan() + "," + ele.getTen() + "," + ele.getNgayTao() + "," + ((TaiKhoanTietKiem) ele).getTienGui() + "," + ((TaiKhoanTietKiem) ele).getNgayGui() + "," + ((TaiKhoanTietKiem) ele).getLaiXuat() + "," + ((TaiKhoanTietKiem) ele).getKiHan());
            }
        }
        return stringList;
    }


    public List<TaiKhoanNganHang> convertRead() {
        List<String> stringList = FileCSV.readFileCSV(pathTaiKhoanNganHang);
        String[] arr;
        for (String line : stringList) {
            arr = line.split(",");
            if (arr.length == 6) {
                taiKhoanNganHangSet.add(new TaiKhoanThanhToan(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], Long.parseLong(arr[5])));
            } else if (arr.length == 8) {
                taiKhoanNganHangSet.add(new TaiKhoanTietKiem(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]), Integer.parseInt(arr[7])));
            }
        }
        return taiKhoanNganHangSet;
    }
}
