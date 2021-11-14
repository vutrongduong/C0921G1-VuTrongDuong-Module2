package ss11_stack_and_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoi {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thập phân");
        int soThapPhan = Integer.parseInt(scanner.nextLine());
        while (soThapPhan != 0) {
            int so = soThapPhan % 2;
            stack.push(so);
            soThapPhan /= 2;
        }
        System.out.println("Giá trị nhị phân là: ");
        while (!(stack.empty())) {
            System.out.print(stack.pop());
        }
    }
}
