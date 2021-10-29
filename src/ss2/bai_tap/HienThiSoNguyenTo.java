package ss2.bai_tap;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static boolean snt(int n){

        if (n < 2 ){
            return  false ;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return  false ;
            }
        }
        return  true ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập số lương số nguyên tố cần in ra");
        number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            if (snt(n)) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}

