package Test08.t0804;

import java.util.ArrayList;
import java.util.Arrays;

public class Hojoong {

    public static void main(String[] args) {

        Hojoong hojoong = new Hojoong();

        String s = "banana";

        System.out.println(Arrays.toString(hojoong.solution(s)));
    }

    public int[] solution(String s) {

        int[] answer = new int[s.length()];

        // for문 돌려가면서
        // 포함하고 있지않으면 -1
        // 포함하고 있으면 가장가까운 녀석의 과의 인덱스 거리

        // 로직 -> for문에서 중복 문자열의 인덱스 - 가장 가까중 중복 문자열 인덱스 = 거리

        // **포함하고 있는게 여러개일때 가장 가까운녀석과의 거리를 구해야함**

        //-> for문을 1번씩 돌아갈 때마다 arrayList를 통해 추가 배열을 만들어주고
        //   포함하고 있을 때 arraylist의 lastIndexOf를 통해 문자열이 포함되어있는 인덱스를 찾아
        //   현제 자신의 인덱스와 가장 가까운 (즉 arraylist에 문자열이 포함되어있는 인덱스) 를 빼주면 -> 가장 가까운 거리

        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                answer[i] = -1;
            } else {
                // banana에서 a가 중복되어 넘어올 때 index = 3 , 5
                // 현재 arraylist 배열상태 b,a,n // b,a,n,a,n
                // Arraylist의 lastindexof 즉, a의 index = 1 , 3
                // 3-1 = 2  // 5-3 = 2
                int closeWordIndex = arrayList.lastIndexOf(s.charAt(i));
                answer[i] = i - closeWordIndex;
            }
            arrayList.add(s.charAt(i));
        }
        return answer;
    }

//    테스트 1 〉	통과 (0.12ms, 74.3MB)
//    테스트 2 〉	통과 (0.47ms, 75.3MB)
//    테스트 3 〉	통과 (0.44ms, 73.3MB)
//    테스트 4 〉	통과 (1.40ms, 80.2MB)
//    테스트 5 〉	통과 (7.55ms, 86.1MB)
//    테스트 6 〉	통과 (4.36ms, 75.9MB)
//    테스트 7 〉	통과 (7.90ms, 78.7MB)
//    테스트 8 〉	통과 (2.59ms, 75.2MB)
//    테스트 9 〉	통과 (7.08ms, 76.1MB)
//    테스트 10 〉	통과 (6.97ms, 79MB)
//    테스트 11 〉	통과 (7.69ms, 81.5MB)
//    테스트 12 〉	통과 (0.14ms, 71.5MB)
//    테스트 13 〉	통과 (0.14ms, 75.2MB)
//    테스트 14 〉	통과 (1.22ms, 79.3MB)
//    테스트 15 〉	통과 (0.15ms, 78.5MB)
//    테스트 16 〉	통과 (0.16ms, 76MB)
//    테스트 17 〉	통과 (0.38ms, 80.1MB)
//    테스트 18 〉	통과 (6.56ms, 69.6MB)
//    테스트 19 〉	통과 (2.46ms, 76.9MB)
//    테스트 20 〉	통과 (1.18ms, 76.9MB)
//    테스트 21 〉	통과 (0.38ms, 76MB)
//    테스트 22 〉	통과 (3.97ms, 79.2MB)
//    테스트 23 〉	통과 (1.02ms, 69.3MB)
//    테스트 24 〉	통과 (1.50ms, 80.9MB)
//    테스트 25 〉	통과 (5.54ms, 75.8MB)
//    테스트 26 〉	통과 (0.52ms, 71.5MB)
//    테스트 27 〉	통과 (1.51ms, 68.3MB)
//    테스트 28 〉	통과 (1.15ms, 72.7MB)
//    테스트 29 〉	통과 (0.11ms, 75.9MB)
//    테스트 30 〉	통과 (4.81ms, 82MB)

}
