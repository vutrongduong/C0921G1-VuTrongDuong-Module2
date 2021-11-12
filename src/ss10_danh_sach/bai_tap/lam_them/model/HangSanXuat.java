package ss10_danh_sach.bai_tap.lam_them.model;

public class HangSanXuat {
    String maSanXuat;
    String tenHang;
    String tenQuocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String maSanXuat, String tenHang, String tenQuocGia) {
        this.maSanXuat = maSanXuat;
        this.tenHang = tenHang;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaSanXuat() {
        return maSanXuat;
    }

    public void setMaSanXuat(String maSanXuat) {
        this.maSanXuat = maSanXuat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    @Override
    public String toString() {
        return
                "maSanXuat='" + maSanXuat + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", tenQuocGia='" + tenQuocGia;
    }

}
