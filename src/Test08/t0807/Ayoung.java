package Test08.t0807;
import java.util.Arrays;
// lv1. K번째 수

public class Ayoung {

    public static void main(String[] args) {
        Ayoung ay = new Ayoung();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(ay.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int [] answer =  new int[commands.length];
        int j = 0;

        // 1. i번째부터 j번째까지 자른 배열 생성
        for(int[] num : commands){
            int k = 0;
            int temp[] = new int [num[1] - num[0] + 1];

            for(int i = num[0]-1 ; i < num[1] ; i++){
                // 2. 배열에 값 추가
                temp[k++] = array[i];
            }

            // 3. 값 정렬
            Arrays.sort(temp);

            // 4. 생성한 배열의 k번째 값을 담은 배열
            answer[j++] = temp[num[2]-1];
        }

        // 4. 결과값 return
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.36ms, 78.1MB)
테스트 2 〉	통과 (0.33ms, 75.6MB)
테스트 3 〉	통과 (0.38ms, 74.1MB)
테스트 4 〉	통과 (0.39ms, 74.3MB)
테스트 5 〉	통과 (0.43ms, 76.6MB)
테스트 6 〉	통과 (0.54ms, 77.3MB)
테스트 7 〉	통과 (0.56ms, 73.7MB)
 */