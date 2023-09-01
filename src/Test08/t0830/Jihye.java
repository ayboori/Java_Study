package Test08.t0830;

import java.util.ArrayList;
import java.util.Arrays;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();

        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};

        System.out.println(Arrays.toString(jh.solution(answers1)));
        System.out.println(Arrays.toString(jh.solution(answers2)));

    }
    public int[] solution(int[] answers) {
        int[] user1 = {1, 2, 3, 4, 5};
        int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // 정답 수를 담을 배열
        int[] num = new int[3];
        ArrayList<Integer> list = new ArrayList<>();

        // 나머지 연산자를 통해 정답 비교 후 같으면 +1
        for(int i=0; i<answers.length; i++){
            if(user1[i%5] == answers[i]){
                num[0]++;
            }
            if(user2[i%8] == answers[i]){
                num[1]++;
            }
            if(user3[i%10] == answers[i]){
                num[2]++;
            }
        }

        // 가장 많이 맞춘 사람 선별
        int max = Math.max(Math.max(num[0], num[1]), num[2]);
        // 오름차순으로 저장하기
        if(max == num[0]){
            list.add(1);
        }
        if(max == num[1]){
            list.add(2);
        }
        if(max == num[2]){
            list.add(3);
        }

//      list를 배열에 담기
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

//    테스트 1 〉	통과 (0.05ms, 81.5MB)
//    테스트 2 〉	통과 (0.06ms, 73.9MB)
//    테스트 3 〉	통과 (0.05ms, 73MB)
//    테스트 4 〉	통과 (0.08ms, 82.3MB)
//    테스트 5 〉	통과 (0.07ms, 71.4MB)
//    테스트 6 〉	통과 (0.07ms, 88.9MB)
//    테스트 7 〉	통과 (0.32ms, 76.2MB)
//    테스트 8 〉	통과 (0.13ms, 78.3MB)
//    테스트 9 〉	통과 (0.88ms, 75.9MB)
//    테스트 10 〉	통과 (0.30ms, 72.3MB)
//    테스트 11 〉	통과 (0.63ms, 79.1MB)
//    테스트 12 〉	통과 (0.63ms, 73.8MB)
//    테스트 13 〉	통과 (0.09ms, 77MB)
//    테스트 14 〉	통과 (0.60ms, 78.3MB)
}
