package Test08.t0811;

import java.util.Arrays;
import java.util.HashMap;

// 추억 점수
public class Haena {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // answer 배열을 선언한다.
        int answer[] = new int[photo.length];

        // name과 yearning을 Map에 매칭한다.
        HashMap<String, Integer> map = new HashMap<>();
        for (int i =0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        // photo를 돌며 name에 일치하는 yearning 값을 더해 answer에 추가한다.
        for (int i = 0, index = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    sum += map.get(photo[i][j]);
                }
            }
            answer[index++] = sum;
        }

        // answer를 return 한다.
        return answer;
    }

    public static void main(String[] args) {
        Haena sol = new Haena();
        System.out.println(Arrays.toString(sol.solution(
                new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3},
                new String[][]{
                        {"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"},
                        {"kon", "kain", "may", "coni"}})));

        System.out.println(Arrays.toString(sol.solution(
                new String[]{"kali", "mari", "don"}, new int[]{11, 1, 55},
                new String[][]{
                        {"kali", "mari", "don"},
                        {"pony", "tom", "teddy"},
                        {"con", "mona", "don"}})));

        System.out.println(Arrays.toString(sol.solution(
                new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3},
                new String[][]{
                        {"may"},
                        {"kein", "deny", "may"},
                        {"kon", "coni"}})));
    }
}

/*
테스트 1 〉	통과 (0.04ms, 70.7MB)
테스트 2 〉	통과 (0.05ms, 95.8MB)
테스트 3 〉	통과 (0.23ms, 76.5MB)
테스트 4 〉	통과 (3.26ms, 75.7MB)
테스트 5 〉	통과 (0.61ms, 77.1MB)
테스트 6 〉	통과 (1.22ms, 86.9MB)
테스트 7 〉	통과 (0.95ms, 91.9MB)
테스트 8 〉	통과 (1.16ms, 81.2MB)
테스트 9 〉	통과 (1.00ms, 90.9MB)
테스트 10 〉	통과 (2.16ms, 94.3MB)
테스트 11 〉	통과 (2.24ms, 99MB)
테스트 12 〉	통과 (1.46ms, 84.4MB)
테스트 13 〉	통과 (0.17ms, 93.7MB)
테스트 14 〉	통과 (0.04ms, 71.2MB)
 */