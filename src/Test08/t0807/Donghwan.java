package Test08.t0807;

import java.util.Arrays;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(donghwan.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // commands배열의 length만큼 int배열 생성

        for (int i = 0; i < commands.length; i++) { // commands length만큼 반복
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]); // 파라미터에 복사할 원본배열과 , 복사 할 첫번째 인덱스 , 마지막 인덱스를 지정을 해준다.
            Arrays.sort(temp); // copyOfRange해준 temp를 sort를 이용해 오름차순으로 정렬
            answer[i] = temp[commands[i][2] - 1]; // 구한 K를 answer에 0번째 인덱스부터 넣어주기
        }
        return answer;
    }
}


//        테스트 1 〉	통과 (0.53ms, 76.7MB)
//        테스트 2 〉	통과 (0.51ms, 73.4MB)
//        테스트 3 〉	통과 (0.41ms, 77.2MB)
//        테스트 4 〉	통과 (0.34ms, 70.6MB)
//        테스트 5 〉	통과 (0.37ms, 70.9MB)
//        테스트 6 〉	통과 (0.52ms, 75.7MB)
//        테스트 7 〉	통과 (0.33ms, 73.3MB)