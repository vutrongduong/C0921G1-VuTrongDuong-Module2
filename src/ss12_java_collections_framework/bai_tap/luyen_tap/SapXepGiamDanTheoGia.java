package ss12_java_collections_framework.bai_tap.luyen_tap;

import java.util.Comparator;

public class SapXepGiamDanTheoGia implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice()-o1.getPrice());
    }
}
