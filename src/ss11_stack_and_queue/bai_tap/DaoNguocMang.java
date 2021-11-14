package ss11_stack_and_queue.bai_tap;

import java.util.Stack;

public class DaoNguocMang {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] so = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (Integer ele : so) {
            stack.push(ele);
        }
        for (int i = 0; i < so.length; i++) {
            so[i] = stack.pop();
        }
        for (Integer ele : so) {
            System.out.print(ele + " ");
        }
        Stack<String> wStack = new Stack<>();
        String word = "Vu Trong Duong";
        String mWored[] = word.split(" ");
        for (String mWoord : mWored) {
            wStack.push(mWoord);
        }
        for (int i = 0; i < mWored.length; i++) {
            mWored[i] = wStack.pop();
        }
        for (String ele : mWored) {
            System.out.print(ele + " ");
        }
    }
}
