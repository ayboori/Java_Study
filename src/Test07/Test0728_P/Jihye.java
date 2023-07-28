// 문자열 내 마음대로 정렬하기
package Test07.Test0728_P;

import java.util.*;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();

        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] strings1 = {"abce", "abcd", "cdx"};
        int n1 = 2;

        System.out.println(Arrays.toString(jh.solution(strings, n)));
        System.out.println(Arrays.toString(jh.solution(strings1, n1)));

        System.out.println(Arrays.toString(jh.solution1(strings, n)));
        System.out.println(Arrays.toString(jh.solution1(strings1, n1)));
    }

    // 첫 번째 방법
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Arrays.sort(strings); // 먼저 사전적 순서로 정렬

        // 중복 X, 순서 O LinkedHashMap사용
        Map<String, Character> map = new LinkedHashMap<>();
        for(String in : strings){
            map.put(in, in.charAt(n));
        }

        // n번째에 위치한 문자 순서대로 정렬을 해야하기에
        // list에 map값 전체 담기 => ketSet()
        List<String> list = new ArrayList<>(map.keySet());
        // 리스트 정렬을 사용
        // list에 있는 값들을 a, b변수에 차례로 넣고 비교(compareTo)
        Collections.sort(list, (a, b) -> map.get(a).compareTo(map.get(b)));

        // 리스트를 배열로 바꾸기
        answer = list.toArray(new String[0]);

        return answer;
    }

    // 두 번째 방법
    public String[] solution1(String[] strings, int n) {
        String[] answer = new String[strings.length];

        Arrays.sort(strings); // 먼저 사전적 순서로 정렬

        // 중복 X, 순서 O LinkedHashMap사용
        HashMap<String, Character> map = new LinkedHashMap<>();
        for(String in : strings){
            map.put(in, in.charAt(n));
        }

        // Map 인터페이스의 내부 인터페이스(inner interface) 이다.
        // https://junecode.tistory.com/113
        List<Map.Entry<String, Character>> entryList = new LinkedList<>(map.entrySet());

        // 값을 비교하고 정렬 (첫번째 방법에서 사용한 compareTo와 같다.)
        entryList.sort(Map.Entry.comparingByValue());

        int i = 0;
        for(Map.Entry<String, Character> entry : entryList){
            answer[i++] = entry.getKey();
        }

        return answer;
    }

//    같은 코드로 테스트 할때마다 초가 바뀝니다..?
//    테스트 1 〉	통과 (1.02ms, 75.4MB)
//    테스트 2 〉	통과 (1.30ms, 74.1MB)
//    테스트 3 〉	통과 (1.13ms, 78.3MB)
//    테스트 4 〉	통과 (1.63ms, 77.9MB)
//    테스트 5 〉	통과 (1.38ms, 74.5MB)
//    테스트 6 〉	통과 (1.30ms, 83.7MB)
//    테스트 7 〉	통과 (1.40ms, 75.4MB)
//    테스트 8 〉	통과 (1.26ms, 76MB)
//    테스트 9 〉	통과 (1.06ms, 76MB)
//    테스트 10 〉	통과 (1.38ms, 85.6MB)
//    테스트 11 〉	통과 (1.06ms, 77.6MB)
//    테스트 12 〉	통과 (1.34ms, 74.3MB)
}
