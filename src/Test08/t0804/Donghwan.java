package Test08.t0804;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        System.out.println(Arrays.toString(donghwan.solution("banana")));
        System.out.println(Arrays.toString(donghwan.solution("foobar")));
    }

    public int[] solution(String s) {
        int[] arr = new int[s.length()]; // s의 길이만큼 int 배열 생성
        ArrayList<Character> arrayList= new ArrayList<>();

        for (int i=0; i<s.length(); i++) { // s의 길이만큼 반복
            if (s.indexOf(s.charAt(i))== i) { // indexOf로 s.charAt으로 찾은 알파벳의 위치가 i와 대조
                arr[i] = -1; // 처음 들어온 값이라면 arr[i]에 값 저장.
            }else {
                arr[i] = i - arrayList.lastIndexOf(s.charAt(i)); // 중복된 값이 아니라면 arr[i]에 i에 찾아온 인덱스 값을 빼기.
            }
            arrayList.add(s.charAt(i)); // arrayList에 뽑아준 값을 add
        }
        return arr; // 리턴
    }
}

// 테스트 1 〉	통과 (0.09ms, 84MB)
// 테스트 2 〉	통과 (0.35ms, 87.1MB)
// 테스트 3 〉	통과 (0.49ms, 75.5MB)
// 테스트 4 〉	통과 (1.35ms, 78MB)
// 테스트 5 〉	통과 (5.44ms, 82.3MB)
// 테스트 6 〉	통과 (2.49ms, 76.2MB)
// 테스트 7 〉	통과 (4.99ms, 79.5MB)
// 테스트 8 〉	통과 (2.34ms, 74.3MB)
// 테스트 9 〉	통과 (6.83ms, 81.1MB)
// 테스트 10 〉	통과 (1.83ms, 72.6MB)
// 테스트 11 〉	통과 (6.02ms, 75.7MB)
// 테스트 12 〉	통과 (0.11ms, 76MB)
// 테스트 13 〉	통과 (0.10ms, 77.1MB)
// 테스트 14 〉	통과 (0.95ms, 83.5MB)
// 테스트 15 〉	통과 (0.11ms, 73.9MB)
// 테스트 16 〉	통과 (0.16ms, 73.1MB)
// 테스트 17 〉	통과 (0.30ms, 72.8MB)
// 테스트 18 〉	통과 (1.94ms, 73.2MB)
// 테스트 19 〉	통과 (3.59ms, 86.5MB)
// 테스트 20 〉	통과 (1.15ms, 75.1MB)
// 테스트 21 〉	통과 (0.27ms, 77MB)
// 테스트 22 〉	통과 (3.11ms, 80.6MB)
// 테스트 23 〉	통과 (1.14ms, 72.1MB)
// 테스트 24 〉	통과 (1.41ms, 75.3MB)
// 테스트 25 〉	통과 (1.19ms, 76.8MB)
// 테스트 26 〉	통과 (0.44ms, 77MB)
// 테스트 27 〉	통과 (1.55ms, 84.5MB)
// 테스트 28 〉	통과 (1.53ms, 76.4MB)
// 테스트 29 〉	통과 (0.09ms, 72.3MB)
// 테스트 30 〉	통과 (4.68ms, 79.3MB)
