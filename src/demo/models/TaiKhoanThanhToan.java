package demo.models;

import demo.models.TaiKhoanNganHang;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private String soThe;
    private long soTienTrongTaiKhoan;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(String soThe, long soTienTrongTaiKhoan) {
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public TaiKhoanThanhToan(int id, String maTaiKhoan, String ten, String ngayTao, String soThe, long soTienTrongTaiKhoan) {
        super(id, maTaiKhoan, ten, ngayTao);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public long getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(long soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return getId() + "," + getMaTaiKhoan() + "," + getTen() + "," + getNgayTao() + "," + soThe + "," + soTienTrongTaiKhoan;

    }


}
