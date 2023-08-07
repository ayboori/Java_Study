package Test08.t0807;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jihye {

    public static void main(String[] args) {

        Jihye jh = new Jihye();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};

        System.out.println(Arrays.toString(jh.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i< commands.length; i++) {
            // List를 for문 안에서 넣어서 [i][]가 한번씩 끝날때마다 새롭게 객채 생성해주기
            List<Integer> list = new ArrayList<>();
            // 2~5번째이지만 실상 우리는 -1번째를 구해야 하기때문에 -1
            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
        }
        return answer;
    }
}
