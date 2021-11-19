package ss12_java_collections_framework.bai_tap.luyen_tap;

import java.util.*;

public class ProductManager {

    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void suaTheoId(Product product) {
        int index=productList.indexOf(product);
        if(index==-1){
            productList.add(product);
        }else {
            productList.set(index,product);
        }
    }


    public void xoaSanPhamTheoId(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if ((id == productList.get(i).getId())) {
                productList.remove(i);
            }
        }
    }

    public void disPlay() {
        for (Product ele : productList) {
            System.out.println(ele);
        }
    }

    public void timSanPhamTheoTen(String tenSanPham) {
        for (Product tim : productList) {
            if (tenSanPham.equals(tim.getName())) {
                System.out.println(tim);
            }
        }
    }

    public void sapXepTangDan() {
        SapXepTangDanTheoGia sapXepTangDanTheoGia = new SapXepTangDanTheoGia();
        Collections.sort(productList, sapXepTangDanTheoGia);
        for (Product tangDan : productList) {
            System.out.println(tangDan);
        }
    }

    public void sapXepGiamDan() {
        SapXepGiamDanTheoGia sapXepGiamDanTheoGia = new SapXepGiamDanTheoGia();
        Collections.sort(productList, sapXepGiamDanTheoGia);
        for (Product giamDan : productList) {
            System.out.println(giamDan);
        }
    }


}
