package Test08.t0830;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        int[] answers = {1, 3, 2, 4, 2};

        System.out.println(hojoong.solution(answers));
    }

    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Queue<Integer> q1 = addAnswer(supo1);
        Queue<Integer> q2 = addAnswer(supo2);
        Queue<Integer> q3 = addAnswer(supo3);

        // count 배열을 통하여 맞춘 문제 수 배열 선언
        int[] answerCount = {0, 0, 0};

        // Queue를 통하여 수포자가 문제를 찍을때 fifo 숫자를 찍은 후 버리고 다시 맨뒤에 채워준다
        // 맞으면 카운트++,
        for (int i = 0; i < answers.length; i++) {
            if (count(q1, answers[i])) {
                answerCount[0]++;
            }
            if (count(q2, answers[i])) {
                answerCount[1]++;
            }
            if (count(q3, answers[i])) {
                answerCount[2]++;
            }
        }

        // 맞춘 문제에 따라 랭크 선정
        int[] userRank = {1, 1, 1};
        for (int i = 0; i < answerCount.length; i++) {
            for (int j = 0; j < answerCount.length; j++) {
                if (answerCount[i] < answerCount[j]) {
                    userRank[i] = userRank[i] + 1;
                }
            }
        }

        // 내사랑을 불러
        // 1등일 경우에만 인덱스+1 값(유저 순서)를 넣어줌.
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < userRank.length; i++) {
            if (userRank[i] == 1) {
                arrayList.add(i + 1);
            }
        }

        // int배열 변환
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    static Queue<Integer> addAnswer(int[] answer) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i : answer) {
            queue.add(i);
        }
        return queue;
    }

    static boolean count(Queue<Integer> queue, int answer) {
        queue.add(queue.peek());
        Integer poll = queue.poll();
        return poll == answer;
    }

//    테스트 1 〉	통과 (0.25ms, 72.8MB)
//    테스트 2 〉	통과 (0.17ms, 71.6MB)
//    테스트 3 〉	통과 (0.17ms, 81.1MB)
//    테스트 4 〉	통과 (0.13ms, 74.4MB)
//    테스트 5 〉	통과 (0.24ms, 75.5MB)
//    테스트 6 〉	통과 (0.25ms, 72MB)
//    테스트 7 〉	통과 (2.87ms, 82.4MB)
//    테스트 8 〉	통과 (1.31ms, 74.8MB)
//    테스트 9 〉	통과 (3.30ms, 72.4MB)
//    테스트 10 〉	통과 (1.83ms, 83MB)
//    테스트 11 〉	통과 (3.22ms, 77.7MB)
//    테스트 12 〉	통과 (3.00ms, 79.2MB)
//    테스트 13 〉	통과 (0.87ms, 76.2MB)
//    테스트 14 〉	통과 (4.90ms, 76.6MB)
}
