package ss10_danh_sach.bai_tap.lam_them.model;

public class XeMay extends Vehicle {
    int congXuat;

    public XeMay() {
    }

    public XeMay(int congXuat) {
        this.congXuat = congXuat;
    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int congXuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congXuat = congXuat;
    }

    public int getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(int congXuat) {
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Công xuất: " + congXuat;
    }
}
