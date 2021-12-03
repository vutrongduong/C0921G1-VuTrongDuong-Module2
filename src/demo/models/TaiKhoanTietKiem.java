package demo.models;

import demo.models.TaiKhoanNganHang;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    long tienGui;
    String ngayGui;
    int laiXuat;
    int kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(long tienGui, String ngayGui, int laiXuat, int kiHan) {
        this.tienGui = tienGui;
        this.ngayGui = ngayGui;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem(int id, long maTaiKhoan, String ten, String ngayTao, long tienGui, String ngayGui, int laiXuat, int kiHan) {
        super(id, maTaiKhoan, ten, ngayTao);
        this.tienGui = tienGui;
        this.ngayGui = ngayGui;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public long getTienGui() {
        return tienGui;
    }

    public void setTienGui(long tienGui) {
        this.tienGui = tienGui;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public int getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(int laiXuat) {
        this.laiXuat = laiXuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return id + "," + maTaiKhoan + "," + ten + ",'" + ngayTao + "," + tienGui + ",'" + ngayGui + "," + laiXuat + "," + kiHan;
    }
}
