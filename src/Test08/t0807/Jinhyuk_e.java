package Test08.t0807;

import java.util.Arrays;

public class Jinhyuk_e {
    public static void main(String[] args) {
        Jinhyuk_e jinhyukE = new Jinhyuk_e();

        int[] array1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(jinhyukE.solution(array1, commands1)));
    }
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < answer.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1]; //배열 크기 선언
            for (int j = 0; j < temp.length; j++) {
                temp[j] = array[commands[i][0] + j]; // temp배열에 array의 commands[i][0]번째 부터 commands[i][1]번째 까지 담음
            }
            Arrays.sort(temp); //숫자 정렬
            answer[i] = temp[commands[i][2]-1]; // k번째 숫자를 배열에 넣음
        }
        return answer;
    }
}

/*
    {{ Trouble Shooting }}

temp[i] = array[commands[0][0+i]]; 부분
temp[i] = array[commands[0][0] + i]; 로 수정
---------------------------------------------
answer[i] = temp[commands[i][2]]; 에서
자릿 수가 아닌 k번째 숫자를 배열에 담으므로
answer[i] = temp[commands[i][2]-1]; 으로 수정
---------------------------------------------
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
[4, 4, 1]에서 배열의 4번째~4번째로 가져온 1개의 숫자를 그대로 가져와야 하는데 범위 초과 발생
 */