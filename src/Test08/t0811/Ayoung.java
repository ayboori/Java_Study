package Test08.t0811;

import java.util.HashMap;

// lv.1 추억 점수
public class Ayoung {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] answer = new int[photo.length];
        // 인물 - 추억 점수를 map으로 저장
        HashMap<String, Integer> memory = new HashMap<>();

        // map에 값 세팅
        for (int i = 0; i < name.length; i++) {
            memory.put(name[i], yearning[i]);
        }

        int j = 0; // answer 배열의 index
        for (String[] ph : photo) {
            int temp = 0; // 현재 배열의 추억 점수를 저장할 변수
            for (int i = 0; i < ph.length; i++) {
                if (memory.containsKey(ph[i])) { // key 값을 가지고 있을 때 연산
                    temp += memory.get(ph[i]);
                }
            }
            answer[j++] = temp; // 이번 배열의 추억 점수를 세팅
        }
        return answer;
    }

    public static void main(String[] args) {
        Ayoung ay = new Ayoung();

        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};

        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning3 = {5, 10, 1, 3};
        String[][] photo3 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};

        System.out.println(Arrays.toString(ay.solution(name1, yearning1, photo1))); // [19, 15, 6]
        System.out.println(Arrays.toString(ay.solution(name2, yearning2, photo2))); // [67, 0, 55]
        System.out.println(Arrays.toString(ay.solution(name3, yearning3, photo3))); // [5, 15, 0]
    }

}

/*
0.02 ~ 2.22ms
테스트 1 〉	통과 (0.04ms, 72MB)
테스트 2 〉	통과 (0.04ms, 75MB)
테스트 3 〉	통과 (0.17ms, 77MB)
테스트 4 〉	통과 (0.13ms, 76MB)
테스트 5 〉	통과 (0.38ms, 78.4MB)
테스트 6 〉	통과 (0.67ms, 83MB)
테스트 7 〉	통과 (0.75ms, 79.8MB)
테스트 8 〉	통과 (1.10ms, 92.6MB)
테스트 9 〉	통과 (0.76ms, 83.2MB)
테스트 10 〉	통과 (2.02ms, 87.4MB)
테스트 11 〉	통과 (2.22ms, 101MB)
테스트 12 〉	통과 (0.87ms, 89.5MB)
테스트 13 〉	통과 (0.09ms, 77.5MB)
테스트 14 〉	통과 (0.02ms, 67.5MB)
 */