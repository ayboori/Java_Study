package Test08.t0802;
// lv.1 푸드 파이트 대회
import java.util.Stack;

public class Ayoung2 {
    public static void main(String[] args) {
        Ayoung2 ay = new Ayoung2();
        System.out.println(ay.solution(new int[]{1, 3, 4, 6})); // "1223330333221"
        System.out.println(ay.solution(new int[]{1, 7, 1, 2})); // "111303111"
    }

    // 거꾸로 꺼낸다 > Stack이 생각나서 풀이해보았다!
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        // StringBuilder에 부착 시 stack에도 값 넣기
        for(int i = 1; i<food.length; i++){
            for(int j = 0 ; j < food[i]/2 ; j++){
                sb.append(i);
                stack.push(i);
            }
        }

        sb.append(0);

        // Stack 크기 미리 지정
        int size = stack.size();

        // 거꾸로 꺼내면서 StringBuilder에 부착
        for(int i = 0 ; i < size; i++){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}

/*
역시나 오래 걸린다...
테스트 1 〉	통과 (2.81ms, 74.4MB)
테스트 2 〉	통과 (2.08ms, 74.6MB)
테스트 3 〉	통과 (1.97ms, 77.8MB)
테스트 4 〉	통과 (2.60ms, 73.4MB)
테스트 5 〉	통과 (1.11ms, 72.7MB)
테스트 6 〉	통과 (2.42ms, 77.3MB)
테스트 7 〉	통과 (2.34ms, 78.1MB)
테스트 8 〉	통과 (2.47ms, 74.9MB)
테스트 9 〉	통과 (1.38ms, 77.7MB)
테스트 10 〉	통과 (1.54ms, 76MB)
테스트 11 〉	통과 (0.20ms, 75.4MB)
테스트 12 〉	통과 (0.21ms, 77.6MB)
테스트 13 〉	통과 (0.18ms, 73.9MB)
테스트 14 〉	통과 (3.57ms, 73.7MB)
테스트 15 〉	통과 (0.21ms, 77.4MB)
테스트 16 〉	통과 (0.19ms, 76.4MB)
테스트 17 〉	통과 (0.22ms, 79.4MB)
테스트 18 〉	통과 (0.14ms, 74.4MB)
테스트 19 〉	통과 (0.13ms, 72.1MB)
테스트 20 〉	통과 (0.27ms, 76.6MB)
 */