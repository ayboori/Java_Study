package Test07.Test0707_P;
import java.util.Arrays;
public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(new int[1, 3, 2, 5, 4],9);
        System.out.println(new int[2, 2, 3, 3],10);
    }
    public int solution(int[] d, int budget) {
        Arrays.sort(d); // 오름차순 정렬

        for(int i = 0 ; i < d.length ; i++){
            if(budget < d[i]){
                return i;
                /* 할당 불가할 경우 지금까지 할당한 갯수 리턴
                (이번 할당 전에 return 하므로 이번 루프 -1 값을 리턴해야 하는데,
                i는 0부터 시작하므로 0을 리턴하면 된다.*/
            }
            budget -= d[i]; // 예산에서 할당한 값 빼기
        }
        return d.length;
    }
}

/*
0.32ms ~ 0.51ms

테스트 1 〉	통과 (0.40ms, 77.7MB)
테스트 2 〉	통과 (0.32ms, 65.3MB)
테스트 3 〉	통과 (0.33ms, 74.4MB)
테스트 4 〉	통과 (0.40ms, 71.5MB)
테스트 5 〉	통과 (0.41ms, 74.4MB)
테스트 6 〉	통과 (0.33ms, 73.5MB)
테스트 7 〉	통과 (0.41ms, 74.6MB)
테스트 8 〉	통과 (0.39ms, 72.3MB)
테스트 9 〉	통과 (0.40ms, 76.4MB)
테스트 10 〉	통과 (0.36ms, 73.9MB)
테스트 11 〉	통과 (0.38ms, 75.4MB)
테스트 12 〉	통과 (0.51ms, 77.8MB)
테스트 13 〉	통과 (0.36ms, 74.8MB)
테스트 14 〉	통과 (0.44ms, 81MB)
테스트 15 〉	통과 (0.43ms, 66.9MB)
테스트 16 〉	통과 (0.39ms, 74.2MB)
테스트 17 〉	통과 (0.37ms, 78.1MB)
테스트 18 〉	통과 (0.38ms, 74.1MB)
테스트 19 〉	통과 (0.39ms, 78.1MB)
테스트 20 〉	통과 (0.42ms, 70.2MB)
테스트 21 〉	통과 (0.36ms, 73.3MB)
테스트 22 〉	통과 (0.34ms, 74.9MB)
테스트 23 〉	통과 (0.35ms, 75MB)
 */