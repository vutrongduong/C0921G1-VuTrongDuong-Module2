package demo.validate;

public class NotFoundBankAccountException extends  Exception{
    public NotFoundBankAccountException() {
        System.err.println("Dữ liệu không hợp lệ");
    }
}
