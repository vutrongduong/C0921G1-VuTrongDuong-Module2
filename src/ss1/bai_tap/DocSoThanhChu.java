package ss1.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int so;
        System.out.println("Nhập số cần đọc: ");
        so = scanner.nextInt();
        if (so<10){
            switch (so) {
                case 0:
                    System.out.println("không");
                    break;
                case 1:
                    System.out.println("một");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bốn");
                    break;
                case 5:
                    System.out.println("năm");
                    break;
                case 6:
                    System.out.println("sáu");
                    break;
                case 7:
                    System.out.println("bảy");
                    break;
                case 8:
                    System.out.println("tám");
                    break;
                case 9:
                    System.out.println("chín");
                    break;
            }}
        else if(so<20){
            String str= Integer.toString(so);
            String[] words = str.split("");

            for (String w : words) {
                System.out.println(w);
            }

        }
    }
}
