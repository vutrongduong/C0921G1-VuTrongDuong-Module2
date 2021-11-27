package ss21_design_pattens.thuc_hanh.trien_khai_singleton;

public class TaxiNotFoundException extends RuntimeException {
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
