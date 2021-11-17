package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiTangDanCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string=scanner.nextLine();
        LinkedList<Character>max=new LinkedList<>();
        for (int i = 0; i <string.length() ; i++) {
            LinkedList<Character> stringLinkedList=new LinkedList<>();
            stringLinkedList.add(string.charAt(i));
            for (int j = 0; j <string.length() ; j++) {
                if(string.charAt(j)>stringLinkedList.getLast()){
                    stringLinkedList.add(string.charAt(j));
                }
            }
            if(stringLinkedList.size()>max.size()){
                max.clear();
                max.addAll(stringLinkedList);
            }
            stringLinkedList.clear();
        }
        for (Character ele:max) {
            System.out.print(ele);
        }
    }
}
