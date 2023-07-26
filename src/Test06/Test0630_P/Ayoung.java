// lv.1 같은 숫자는 싫어
package Test06.Test0630_P;

import java.util.Stack;

public class Ayoung {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>(); // 가변 크기의 컬렉션으로 값 담기
        stack.push(arr[0]); // 비교를 위해 배열의 첫번째 값 넣기

        for(int i=0; i<arr.length; i++){ // 배열의 길이만큼 돌면서 비교
            if(stack.elementAt(stack.size()-1) != arr[i]){ // 바로 앞에 있는 stack의 값과 일치하지 않을 때만
                stack.push(arr[i]);  // stack에 값 추가
            }
        }

        int[] answer = new int[stack.size()]; // stack의 크기만한 int 배열 생성

        for(int i=answer.length-1 ; i>=0 ; i--){ // stack은 LIFO (후입선출)이므로 배열 맨뒤부터 값 넣어줌
            answer[i] = stack.pop();
        }
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.11ms, 79.1MB)
테스트 2 〉	통과 (0.29ms, 71MB)
테스트 3 〉	통과 (0.33ms, 71.6MB)
테스트 4 〉	통과 (0.28ms, 77.6MB)
테스트 5 〉	통과 (0.26ms, 77.6MB)
테스트 6 〉	통과 (0.19ms, 76.6MB)
테스트 7 〉	통과 (0.28ms, 70.2MB)
테스트 8 〉	통과 (0.25ms, 78.4MB)
테스트 9 〉	통과 (0.24ms, 72.5MB)
테스트 10 〉	통과 (0.24ms, 78.2MB)
테스트 11 〉	통과 (0.18ms, 77.4MB)
테스트 12 〉	통과 (0.18ms, 73.9MB)
테스트 13 〉	통과 (0.24ms, 81.8MB)
테스트 14 〉	통과 (0.28ms, 74.4MB)
테스트 15 〉	통과 (0.26ms, 65.7MB)
테스트 16 〉	통과 (0.27ms, 75.3MB)
테스트 17 〉	통과 (0.11ms, 72.9MB)
효율성  테스트
테스트 1 〉	통과 (50.00ms, 120MB)
테스트 2 〉	통과 (47.65ms, 113MB)
테스트 3 〉	통과 (47.71ms, 111MB)
테스트 4 〉	통과 (48.90ms, 116MB)
 */