package ss12_java_collections_framework.bai_tap.luyen_tap;

import java.util.Comparator;

public class SapXepTangDanTheoGia implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
