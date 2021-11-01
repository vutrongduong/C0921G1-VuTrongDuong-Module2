package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng A: ");
        int doDaiA = scanner.nextInt();
        int[] arrA = new int[doDaiA];
        for (int i = 0; i < doDaiA; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1)+" của mảng A");
            arrA[i] = scanner.nextInt();
        }
        System.out.println("Nhập độ dài của mảng B: ");
        int doDaiB = scanner.nextInt();
        int[] arrB = new int[doDaiA];
        for (int j = 0; j < doDaiB; j++) {
            System.out.println("Nhập phần tử thứ " + (j + 1)+" của mảng B");
            arrB[j] = scanner.nextInt();
        }
        int[] arrC = new int[doDaiA + doDaiB];
        for (int a = 0; a < (doDaiA); a++) {
            arrC[a] = arrA[a];
        }
        int z=0;
        for (int b = doDaiA ; b < arrC.length; b++) {
            arrC[b] = arrB[z];
            ++z;
        }
        for (int c=0;c<arrC.length;c++){
            System.out.print(arrC[c]+" ");
        }
    }

}
