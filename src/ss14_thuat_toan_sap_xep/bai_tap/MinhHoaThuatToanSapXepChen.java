package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class MinhHoaThuatToanSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng số nguyên vừa nhập: ");
        display(arr);
        System.out.println("\nBắt đầu chèn...");
        insertionSort(arr);
        System.out.println("Mảng số nguyên sau khi sắp xếp:  ");
        display(arr);
    }
    public static void insertionSort(int[] array){
        int x, pos;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
                System.out.println("Di chuyển phần tử : "+array[pos]);
            }
            if (pos!=i){
                System.out.println("Chèn phần tử : "+x+
                        ", tại vị trí "+ pos);
                array[pos]=x;
            }
            System.out.println("Vòng lặp thứ : "+i);
            display(array);
        }
    }
    public static  void display(int arr[]) {
        int i;
        System.out.print("[");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }
}
