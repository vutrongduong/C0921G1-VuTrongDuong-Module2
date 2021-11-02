package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập X: ");
        int x = scanner.nextInt();
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0,0};
        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();
        if (index<=-1&&index>=arr.length-1){
            System.out.println("không chèn được phần từ vào mảng");
        }
        arr = Arrays.copyOf(arr,arr.length+1);
        for (int i=arr.length-1;i>=index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=x;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
