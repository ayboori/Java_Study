package Test07.Test0703_P;
// lv.1 3진법 뒤집기(74%)

import java.util.Stack;
public class Ayoung {
        public int solution(int n) {
            Stack<Integer> list3 = new Stack<>(); // 넣은 반대 순서대로 꺼내기 위해 Stack 사용
            int answer = 0; // 정답 더할 변수 세팅

            while(true){ // 나머지 나올 때까지 무한 루프
                if (n < 3){ // 나누는 수가 3보다 작으면
                    list3.push(n); // 그 수를 넣기
                    break;
                }
                list3.push(n%3); // 나머지를 넣기
                n = n/3; // 넣고 n을 3으로 나누기
            }

            int size = list3.size(); // size 값을 세팅을 미리 해주지 않으면 스택의 크기가 줄어든다!!

            for(int i = 0; i< size; i++){
                answer +=  Math.pow(3, i) * list3.pop(); // list에서 하나 꺼내서 3의 n제곱을 곱해준다
            }

            return answer;
        }

}
