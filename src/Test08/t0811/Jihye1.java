package Test08.t0811;

import java.util.Arrays;
import java.util.HashMap;

public class Jihye1 {
    public static void main(String[] args) {
        Jihye1 jh = new Jihye1();

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(jh.solution(name, yearning, photo)));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // HashMap을 이용하여 key, value를 지정해준다.
        HashMap<String, Integer> year = new HashMap<>();

        // for문을 통해 HashMap에 name과 yearning을 put해준다.
        for (int i = 0; i < name.length; i++) {
            year.put(name[i], yearning[i]);
        }

        //  photo의 길이 만큼 for문을 돌린다.
        for (int i = 0; i < photo.length; i++) {
            for (String person : photo[i]) { // {{1} {2} {3}}
                for (String n : year.keySet()) {  //key 값을 반환
                    if (n.equals(person)) {
                        answer[i] += year.get(n); // value값을 가져온다.
                    }
                }
            }
        }

        return answer;
    }


//    테스트 1 〉	통과 (0.05ms, 79.6MB)
//    테스트 2 〉	통과 (0.11ms, 77.2MB)
//    테스트 3 〉	통과 (1.57ms, 79MB)
//    테스트 4 〉	통과 (1.28ms, 69.3MB)
//    테스트 5 〉	통과 (16.98ms, 92.8MB)
//    테스트 6 〉	통과 (26.60ms, 88.1MB)
//    테스트 7 〉	통과 (26.52ms, 73.1MB)
//    테스트 8 〉	통과 (28.07ms, 83.9MB)
//    테스트 9 〉	통과 (31.48ms, 87.3MB)
//    테스트 10 〉	통과 (50.21ms, 98.9MB)
//    테스트 11 〉	통과 (76.59ms, 107MB)
//    테스트 12 〉	통과 (32.24ms, 98.9MB)
//    테스트 13 〉	통과 (0.43ms, 73.4MB)
//    테스트 14 〉	통과 (0.04ms, 84.4MB)
}

