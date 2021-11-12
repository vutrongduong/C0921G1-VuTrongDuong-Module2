package ss10_danh_sach.bai_tap.lam_them.service;

public interface IPhuongTien {
    void add();
    void display();
    void delete(String bienKiemSoat);
    boolean check(String bienKiemSoat);
}
