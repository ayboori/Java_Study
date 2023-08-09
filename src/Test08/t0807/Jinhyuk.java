package Test08.t0807;

import java.util.Arrays;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(jinhyuk.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < answer.length; i++) {
            int startNum = commands[i][0]; // 시작 위치 설정
            int endNum = commands[i][1]; // 끝나는 위치 설정
            int k = commands[i][2]; //k번째 숫자

            if (startNum == endNum) { // 4,4,1 같은 경우 위한 같을때 분리
                answer[i] = array[startNum - 1]; //바로 넣어버리기
            } else {
                int[] temp = new int[endNum - startNum + 1]; //기존 배열 크기
                for (int j = 0; j < temp.length; j++) {
                    temp[j] = array[startNum - 1 + j]; // array 리스트 속 (startNum - 1)번째 숫자부터 하나씩 넣기
                }
                Arrays.sort(temp); //정렬하기
                answer[i] = temp[k - 1]; // k번째 넣기
            }
        }
        return answer;
    }
}

/*
    [[ 시간 복잡도 0.31~0.50ms ]]
테스트 1 〉	통과 (0.50ms, 71.1MB)
테스트 2 〉	통과 (0.41ms, 72.5MB)
테스트 3 〉	통과 (0.44ms, 81.9MB)
테스트 4 〉	통과 (0.36ms, 74MB)
테스트 5 〉	통과 (0.33ms, 74.2MB)
테스트 6 〉	통과 (0.35ms, 68MB)
테스트 7 〉	통과 (0.31ms, 77.1MB)

    {{ Trouble Shooting }}
e파일에서 생겼었던 4,4,1일때 오류를 수정하고자
 if (startNum == endNum) 일 경우
 answer[i] = array[startNum - 1]; 를 통해 answer[i]에 바로 넣어버리기로 함
----------------------------------------------------------------------
기존의 이중 for문의 경우 i,j 길이선언 부분등 가독성이 많이 떨어진다고 생각하여
int startNum = commands[i][0];
int endNum = commands[i][1];
int k = commands[i][2];
으로 각각 시작, 끝, 넣는 숫자의 위치를 미리 정해주어서 좀 더 가독성을 높임
----------------------------------------------------------------------
main 에서 예시가 한 개이므로 array1 -> array 로 1붙였던 부분을 수정
*/