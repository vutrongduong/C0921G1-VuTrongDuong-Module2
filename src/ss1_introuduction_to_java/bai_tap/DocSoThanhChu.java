package ss1_introuduction_to_java.bai_tap;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so;
        System.out.println("Nhập số cần đọc: ");
        so = scanner.nextInt();
        String[] chu = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        int number[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < number.length; i++) {
            if (so == number[i]) {
                System.out.println(chu[i]);
            } else if (so < 20) {
                if (so % 10 == 0) {
                    System.out.println("mười ");
                    break;
                } else if (so % 10 == number[i]) {
                    System.out.println("mười " + chu[i]);
                    break;
                }
            } else if (so < 100) {
                if (so / 10 == number[i] && so % 10 == 0) {
                    System.out.println(chu[i] + " mươi");
                } else if (so / 10 == number[i] && so % 10 != 0) {
                    System.out.println(chu[so / 10] + " mươi " + chu[so % 10]);
                }
            } else if (so < 1000) {
                if (so / 100 == number[i] && (so / 10) % 10 == 0 && so % 10 == 0) {
                    System.out.println(chu[so / 100] + " trăm");
                } else if (so / 100 == number[i] && (so / 10) % 10 != 0 && so % 10 == 0) {
                    System.out.println(chu[so / 100] + " trăm " + chu[(so / 10) % 10] + " mươi ");
                } else if (so / 100 == number[i] && (so / 10) % 10 == 0 && so % 10 != 0) {
                    System.out.println(chu[so / 100] + " trăm " + " lẻ " + chu[so % 10]);
                } else if (so / 100 == number[i]) {
                    System.out.println(chu[so / 100] + " trăm " + chu[(so / 10) % 10] + " mươi " + chu[so % 10]);
                }
            }
        }
    }
}





