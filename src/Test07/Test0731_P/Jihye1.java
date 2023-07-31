// 두 개 뽑아서 더하기
package Test07.Test0731_P;

import java.util.Arrays;
import java.util.TreeSet;

public class Jihye1 {
    public static void main(String[] args) {
        Jihye1 jh = new Jihye1();

        int[] numbers1 = {2, 1, 3, 4, 1};
        int[] numbers2 = {5, 0, 2, 7};

        System.out.println(Arrays.toString(jh.solution(numbers1)));
        System.out.println(Arrays.toString(jh.solution(numbers2)));
    }

    public int[] solution(int[] numbers) {
        // TreeSet은 중복X, 기본 오름차순
        TreeSet<Integer> hapList = new TreeSet<>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                hapList.add(numbers[i]+numbers[j]);
            }
        }
        // Integer -> int
        // mapToInt : 스트림을 IntStream으로 변환
        int[] answer =  hapList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

//    테스트 1 〉	통과 (3.72ms, 73.4MB)
//    테스트 2 〉	통과 (3.06ms, 79.3MB)
//    테스트 3 〉	통과 (2.38ms, 77.1MB)
//    테스트 4 〉	통과 (3.23ms, 72.5MB)
//    테스트 5 〉	통과 (3.37ms, 70.5MB)
//    테스트 6 〉	통과 (5.05ms, 75.5MB)
//    테스트 7 〉	통과 (9.56ms, 78.9MB)
//    테스트 8 〉	통과 (5.86ms, 69.1MB)
//    테스트 9 〉	통과 (3.77ms, 75.3MB)
}