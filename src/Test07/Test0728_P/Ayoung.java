// 문자열 내 마음대로 정렬하기
package Test07.Test0728_P;
import java.util.*;

// lv.1 문자열 내 마음대로 정렬하기
public class Ayoung {
    public static void main(String[] args) {
        Ayoung sol = new Ayoung();
        System.out.println(Arrays.toString(sol.solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(sol.solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }

    public String[] solution(String[] strings, int n) {
        // Map으로 문자열, n번째 문자의 쌍을 만든다
        Map<String, Character> map = new HashMap<>();

        for(String st : strings){
            map.put(st, st.charAt(n));
        }

        List<String> keySet = new ArrayList<>(map.keySet());

        /*
        A.compareTo(B) : A < B 일 때 음수, A = B 일 때 0, A > B 일 때 양수 return
        문자열의 경우 A가 사전적으로 더 앞에 있는 값일 경우 음수 리턴
        */

        // value 값으로 오름차순 정렬, value가 같으면 key 값으로 오름차순 정렬

        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) { // o1은 앞의 String, o2는 뒤의 String
                if(map.get(o1).compareTo(map.get(o2)) == 0){ // char 값이 동일할 경우
                    return o1.compareTo(o2); // key값끼리 비교하여 return
                }else{ // 아닐 경우
                    return map.get(o1).compareTo(map.get(o2));
                }
            }
        });

        // key 값을 배열로 만들어 리턴
        String[] answer = keySet.toArray(new String[map.size()]);

        return answer;
    }
}
/*
| 테스트 1 〉 | 통과 (0.56ms, 72.6MB) |
| --- | --- |
| 테스트 2 〉 | 통과 (0.83ms, 74.5MB) |
| 테스트 3 〉 | 통과 (0.75ms, 74.5MB) |
| 테스트 4 〉 | 통과 (0.67ms, 76.4MB) |
| 테스트 5 〉 | 통과 (0.55ms, 76.7MB) |
| 테스트 6 〉 | 통과 (0.79ms, 72MB) |
| 테스트 7 〉 | 통과 (0.75ms, 79.6MB) |
| 테스트 8 〉 | 통과 (0.67ms, 75.6MB) |
| 테스트 9 〉 | 통과 (0.48ms, 78MB) |
| 테스트 10 〉 | 통과 (0.89ms, 76.5MB) |
| 테스트 11 〉 | 통과 (0.48ms, 76.9MB) |
| 테스트 12 〉 | 통과 (0.72ms, 78.4MB) |
 */