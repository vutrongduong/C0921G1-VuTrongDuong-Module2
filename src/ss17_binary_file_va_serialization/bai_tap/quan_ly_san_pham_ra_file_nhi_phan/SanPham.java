package ss17_binary_file_va_serialization.bai_tap.quan_ly_san_pham_ra_file_nhi_phan;

import java.io.Serializable;

public class SanPham implements Serializable {
    private int ma;
    private String ten;
    private String hangSanXuat;
    private double gia;
    private String cacMoTaKhac;

    public SanPham() {
    }

    public SanPham(int ma, String ten, String hangSanXuat, double gia, String cacMoTaKhac) {
        this.ma = ma;
        this.ten = ten;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.cacMoTaKhac = cacMoTaKhac;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getCacMoTaKhac() {
        return cacMoTaKhac;
    }

    public void setCacMoTaKhac(String cacMoTaKhac) {
        this.cacMoTaKhac = cacMoTaKhac;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", gia=" + gia +
                ", cacMoTaKhac='" + cacMoTaKhac + '\'' +
                '}';
    }
}
