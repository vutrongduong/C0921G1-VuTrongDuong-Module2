package ss15_xu_ly_ngoai_le_va_debug.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Sinh ra lỗi , nhập lại");
    }
    public IllegalTriangleException(String mess){
        super(mess);
    }
}
