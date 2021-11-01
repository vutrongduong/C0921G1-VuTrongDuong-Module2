package ss1_introuduction_to_java.bai_tap;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Nhập số USD cần chuyển đổi");
        int usd = scanner.nextInt();
        usd = usd * rate;
        System.out.println("Giá trị VND là " + usd + " VND");
    }
}



