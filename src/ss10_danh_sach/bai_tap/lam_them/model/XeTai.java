package ss10_danh_sach.bai_tap.lam_them.model;

import ss10_danh_sach.bai_tap.lam_them.model.Vehicle;

public class XeTai extends Vehicle {
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Trọng tải: " + trongTai ;
    }
}
