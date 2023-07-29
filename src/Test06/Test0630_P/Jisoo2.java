// lv.1 같은 숫자는 싫어
package Test06.Test0630_P;

import java.util.Stack;

public class Jisoo2 {
    public static void main(String[] args) {
        Jisoo2 jisoo = new Jisoo2();
    }

    // get() 대신에 pop()을 넣어본다. 끝에서부터 조회를 하게 되니까 인덱스도 끝에서부터 넣어준다.
    public static int[] solution2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!stack.peek().equals(arr[i])) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

}
