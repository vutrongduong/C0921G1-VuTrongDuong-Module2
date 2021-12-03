package demo.models;

public abstract class TaiKhoanNganHang {
    int id;
    long maTaiKhoan;
    String ten;
    String ngayTao;

    public TaiKhoanNganHang() {
    }

    public TaiKhoanNganHang(int id, long maTaiKhoan, String ten, String ngayTao) {
        this.id = id;
        this.maTaiKhoan = maTaiKhoan;
        this.ten = ten;
        this.ngayTao = ngayTao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(long maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return "TaiKhoanNganHang{" +
                "id=" + id +
                ", maTaiKhoan=" + maTaiKhoan +
                ", ten='" + ten + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                '}';
    }
}
