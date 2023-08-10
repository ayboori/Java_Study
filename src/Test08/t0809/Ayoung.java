package Test08.t0809;
// lv.1 콜라 문제
public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution(2, 1, 20));
        System.out.println(ay.solution(3, 1, 20));
    }
    public int solution(int a, int b, int n) {
        int emptyBottle = n; // 현재 빈 병
        int gotCoke = 0; // 받은 콜라 수

        while(emptyBottle >= a){
            // 현재 교환할 병의 수 = 현재 바꿀 수 있는 최대
            int changeBottle = emptyBottle / a;
            // 1회 교환 시 보상으로 받는 병의 수 * 최대로 가져간 병 / 1회 교환 시 필요한 병의 수 = 현재 보상
            int tempGotCoke = b * changeBottle;

            // 현재 빈 병 = 현재 병 - 바꾼 병 + 현재 보상
            emptyBottle = emptyBottle % a + tempGotCoke;
            // 최종 보상에 현재 보상 더하기
            gotCoke += tempGotCoke;
        }
        return gotCoke;
    }
}

/*
0.01 ~ 0.13ms
테스트 1 〉	통과 (0.01ms, 78MB)
테스트 2 〉	통과 (0.02ms, 73.1MB)
테스트 3 〉	통과 (0.02ms, 79.4MB)
테스트 4 〉	통과 (0.03ms, 80.4MB)
테스트 5 〉	통과 (0.02ms, 94.1MB)
테스트 6 〉	통과 (0.03ms, 79.1MB)
테스트 7 〉	통과 (0.03ms, 71MB)
테스트 8 〉	통과 (0.01ms, 84.7MB)
테스트 9 〉	통과 (0.02ms, 76MB)
테스트 10 〉	통과 (0.02ms, 77.5MB)
테스트 11 〉	통과 (0.01ms, 74.9MB)
테스트 12 〉	통과 (0.13ms, 76.7MB)
테스트 13 〉	통과 (0.02ms, 75.7MB)
테스트 14 〉	통과 (0.03ms, 76.1MB)
 */