// lv.1 같은 숫자는 싫어
package Test06.Test0630_P;

import java.util.Stack;

public class Jisoo {
    public static void main(String[] args) {
        Jisoo jisoo = new Jisoo();
    }

    // 처음 풀이
    public static int[] jisooSolution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (!stack.peek().equals(arr[i])) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }

}
