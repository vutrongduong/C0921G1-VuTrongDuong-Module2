package ss11_stack_and_queue.bai_tap;

import java.util.Map;
import java.util.TreeMap;

public class DemSoLanXuatHienCuaMoiTu {
    public static void main(String[] args) {
        Map<String, Integer> maps = new TreeMap<String, Integer>();
        String chuoi = "Vu Trong      Duong duong      vu code gym    duong";
        String arr[] = chuoi.toLowerCase().split(" ");
        for (String ele : arr) {
            if (!"".equals(ele)) {
                if (maps.containsKey(ele)) {
                    maps.replace(ele, maps.get(ele) + 1);
                } else {
                    maps.put(ele, 1);
                }
            }
        }
        System.out.println("Số lần xuất hiện của mỗi từ trong chuỗi: ");
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}