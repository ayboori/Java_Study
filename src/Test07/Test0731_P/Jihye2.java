// 두 개 뽑아서 더하기
package Test07.Test0731_P;

import java.util.*;

public class Jihye2 {
    public static void main(String[] args) {
        Jihye2 jh = new Jihye2();

        int[] numbers1 = {2, 1, 3, 4, 1};
        int[] numbers2 = {5, 0, 2, 7};

        System.out.println(Arrays.toString(jh.solution(numbers1)));
        System.out.println(Arrays.toString(jh.solution(numbers2)));
    }
    public int[] solution(int[] numbers) {
        // 중복 X
        HashSet<Integer> num = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                num.add(numbers[i] + numbers[j]);
            }
        }

        // 정렬을 위해 list로 변환
        ArrayList<Integer> arr = new ArrayList<>(num);
        // list 정렬 Collenctions
        Collections.sort(arr);

        // Integer -> int 변환
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] += arr.get(i);
        }

        return answer;
    }

//    테스트 1 〉	통과 (0.26ms, 80.4MB)
//    테스트 2 〉	통과 (0.45ms, 72MB)
//    테스트 3 〉	통과 (0.23ms, 76.4MB)
//    테스트 4 〉	통과 (0.28ms, 72.8MB)
//    테스트 5 〉	통과 (0.49ms, 77MB)
//    테스트 6 〉	통과 (0.59ms, 75MB)
//    테스트 7 〉	통과 (1.72ms, 76MB)
//    테스트 8 〉	통과 (1.27ms, 73.4MB)
//    테스트 9 〉	통과 (0.77ms, 71.8MB)
}