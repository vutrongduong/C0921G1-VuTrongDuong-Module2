package ss11_stack_and_queue.bai_tap.Demerging;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<NhanVien> nhanSu = new LinkedList<>();
        {
            nhanSu.add(new NhanVien("Duong", "Nam", "01/07/1991"));
            nhanSu.add(new NhanVien("Hien", "Nu", "29/02/1991"));
            nhanSu.add(new NhanVien("Tu", "Nam", "03/11/1990"));
            nhanSu.add(new NhanVien("Ngoc", "Nu", "25/05/1998"));
            nhanSu.add(new NhanVien("Khanh", "Nam", "16/10/1990"));
            nhanSu.add(new NhanVien("Thuong", "Nu", "24/06/1996"));
        }
        Queue<NhanVien> nu = new LinkedList<>();
        Queue<NhanVien> nam = new LinkedList<>();
        for (NhanVien ele : nhanSu) {
            if (ele.getGender().equals("Nu")) {
                nu.add(ele);
            } else {
                nam.add(ele);
            }
        }
        Collections.sort((LinkedList<NhanVien>) nu);
        Collections.sort((LinkedList<NhanVien>) nam);
        for (NhanVien ele : nu) {
            System.out.println(ele);
        }
        for (NhanVien ele : nam) {
            System.out.println(ele);
        }
    }
}
