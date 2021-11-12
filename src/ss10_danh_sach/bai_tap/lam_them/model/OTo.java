package ss10_danh_sach.bai_tap.lam_them.model;

import ss10_danh_sach.bai_tap.lam_them.model.Vehicle;

public class OTo extends Vehicle {
    private int soChoNgoi;
    private String kieuXe;

    public OTo() {
    }

    public OTo(int soChoNgoi, String kieuXe) {

        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public OTo(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return super.toString()+
                " , Số chổ ngồi: " + soChoNgoi +
                ", Kiểu xe: '" + kieuXe +"'" ;
    }
}
