package Test08.t0811;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};

        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning3 = {5, 10, 1, 3};
        String[][] photo3 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};

        System.out.println(Arrays.toString(donghwan.solution(name1, yearning1, photo1)));
        System.out.println(Arrays.toString(donghwan.solution(name2, yearning2, photo2)));
        System.out.println(Arrays.toString(donghwan.solution(name3, yearning3, photo3)));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> human = new HashMap<>(); //해당하는 인물의 대한 점수를 Map으로 저장
        for (int i = 0; i < name.length; i++) {
            human.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) { //이중반복문을 사용해서 이중배열에 접근
            String[] person = photo[i];
            int total = 0; // 총 점수를 받기 위해 변수 선언 및 초기화.
            for (int j=0; j<person.length; j++){ //이중 배열에 접근
                String personName = person[j]; //인물이름을 반복문으로 받기
                if(human.containsKey(personName)){ // 인물이 해당하면 점수추가
                    total += human.get(personName); //토탈변수에 점수를 쌓아주기
                }
            }
            answer[i] = total; // 토탈점수를 answer에 반환.
        }
        return answer;
    }
}


//        테스트 1 〉	통과 (0.03ms, 72.3MB)
//        테스트 2 〉	통과 (0.04ms, 77.1MB)
//        테스트 3 〉	통과 (0.27ms, 73.5MB)
//        테스트 4 〉	통과 (0.15ms, 70.7MB)
//        테스트 5 〉	통과 (5.17ms, 74.6MB)
//        테스트 6 〉	통과 (1.14ms, 80.4MB)
//        테스트 7 〉	통과 (0.77ms, 83.6MB)
//        테스트 8 〉	통과 (0.70ms, 79.3MB)
//        테스트 9 〉	통과 (1.29ms, 93.9MB)
//        테스트 10 〉	통과 (1.51ms, 100MB)
//        테스트 11 〉	통과 (2.42ms, 89.7MB)
//        테스트 12 〉	통과 (0.96ms, 89.5MB)
//        테스트 13 〉	통과 (0.15ms, 76.4MB)
//        테스트 14 〉	통과 (0.04ms, 74.1MB)