// 두 개 뽑아서 더하기
package Test07.Test0731_P;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        int[] numbers1 = {2,1,3,4,1};
        int[] numbers2 = {5,0,2,7};

        System.out.println(Arrays.toString(donghwan.solution(numbers1)));
        System.out.println(Arrays.toString(donghwan.solution(numbers2)));
    }
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>(); // 중복방지를 해주기 위해 ArrayList 생성

        for (int i=0; i<numbers.length; i++) { // i번째 인덱스를 비교해주기 위해 반복문 생성
            for (int j=i+1; j<numbers.length; j++) { // i+j를 해줘야되기때문에 이중 반복문 생성
                if (!answer.contains(numbers[i]+numbers[j])) { // 값 중복방지를 해주기 위해 contains를 사용해 중복방지
                    answer.add(numbers[i]+numbers[j]); // List에 더해준 값 추가
                }
            }
        }


        int[] answer1 = answer.stream() //ArrayList를 int[]로 변경해주기 위해 stream 사용
                .mapToInt(i -> i)
                .toArray();

        Arrays.sort(answer1); // 오름차순으로 정렬 후 반환

        return answer1;
    }
}

//        Troubleshooting
//        소요 시간이 너무 오래 걸림 아마도 ArrayList를 int 배열로 변환해주는 과정에서 시간을 많이 잡아먹는듯한데 좀 더 효율적인 방법으로 변경하는 방법을
//        테스트 1 〉	통과 (3.30ms, 79.6MB)
//        테스트 2 〉	통과 (2.59ms, 76.3MB)
//        테스트 3 〉	통과 (3.17ms, 73.7MB)
//        테스트 4 〉	통과 (2.90ms, 79.9MB)
//        테스트 5 〉	통과 (2.73ms, 72.8MB)
//        테스트 6 〉	통과 (2.73ms, 73.8MB)
//        테스트 7 〉	통과 (7.71ms, 74.8MB)
//        테스트 8 〉	통과 (4.02ms, 79.8MB)
//        테스트 9 〉	통과 (3.30ms, 77.3MB)