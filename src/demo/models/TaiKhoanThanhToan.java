package demo.models;

import demo.models.TaiKhoanNganHang;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    long soThe;
    long soTienTrongTaiKhoan;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(long soThe, long soTienTrongTaiKhoan) {
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public TaiKhoanThanhToan(int id, long maTaiKhoan, String ten, String ngayTao, long soThe, long soTienTrongTaiKhoan) {
        super(id, maTaiKhoan, ten, ngayTao);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public long getSoThe() {
        return soThe;
    }

    public void setSoThe(long soThe) {
        this.soThe = soThe;
    }

    @Override
    public String toString() {
        return id + "," + maTaiKhoan + "," + ten + "," + ngayTao + ',' + soThe + "," + soTienTrongTaiKhoan;
    }
}
