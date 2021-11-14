package ss11_stack_and_queue.bai_tap.Demerging;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<NhanVien> nhanSu = new LinkedList<>();
        {
            nhanSu.add(new NhanVien("Duong", "Nam", "01/01/1991"));
            nhanSu.add(new NhanVien("Hien", "Nu", "02/02/1992"));
            nhanSu.add(new NhanVien("Tu", "Nam", "03/03/1993"));
            nhanSu.add(new NhanVien("Ngoc", "Nu", "04/04/1994"));
            nhanSu.add(new NhanVien("Khanh", "Nam", "05/05/1995"));
            nhanSu.add(new NhanVien("Thuong", "Nu", "06/06/1996"));
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

        for (NhanVien ele : nu) {
            System.out.println(ele);
        }
        for (NhanVien ele : nam) {
            System.out.println(ele);
        }
//        Collections.sort(nu);


    }
}
