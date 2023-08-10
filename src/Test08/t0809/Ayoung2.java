package Test08.t0809;
// lv.1 콜라 문제 = 채점 시 에러 코드
public class Ayoung2 {
    public static void main(String[] args) {
        Ayoung2 ay = new Ayoung2();
        System.out.println(ay.solution(2, 1, 20));
        System.out.println(ay.solution(3, 1, 20));
    }

    public int solution(int a, int b, int n) {
        int emptyBottle = n; // 현재 빈 병
        int gotCoke = 0; // 받은 콜라 수

        while(emptyBottle >= a){
            // 현재 교환할 병의 수 = 현재 바꿀 수 있는 최대
            int changeBottle = maxBottle(emptyBottle,a);
            // 1회 교환 시 보상으로 받는 병의 수 * 최대로 가져간 병 / 1회 교환 시 필요한 병의 수 = 현재 보상
            int tempGotCoke = b * changeBottle/a;

            // 현재 빈 병 = 현재 병 - 바꾼 병 + 현재 보상
            emptyBottle = emptyBottle - changeBottle + tempGotCoke;
            // 최종 보상에 현재 보상 더하기
            gotCoke += tempGotCoke;

            System.out.println("바꿀 병의 수 : " + changeBottle + " / 현재 보상 : " + tempGotCoke
                    + " / 현재 빈 병 : " + emptyBottle + " / 총 보상 : " + gotCoke);
        }

        return gotCoke;
    }

    // 최대로 교환할 병의 수
    private int maxBottle(int currentBottle, int changeableBottle){
        int answer = 1;

        // 1회 교환 시 필요한 병의 수만큼 계속 나눠준다
        for(int i = changeableBottle; i <= currentBottle ; i+= changeableBottle){
            if(currentBottle / changeableBottle == 0){
                break;
            }
            answer = i;
        }

        return answer;
    }
}

/*
9, 14번 실패
테스트 1 〉	통과 (0.36ms, 75.9MB)
테스트 2 〉	통과 (0.26ms, 70.6MB)
테스트 3 〉	통과 (0.11ms, 72.5MB)
테스트 4 〉	통과 (0.05ms, 67.1MB)
테스트 5 〉	통과 (0.06ms, 82.3MB)
테스트 6 〉	통과 (0.07ms, 73.8MB)
테스트 7 〉	통과 (0.03ms, 77.7MB)
테스트 8 〉	통과 (0.03ms, 70.6MB)
테스트 9 〉	실패 (0.03ms, 82.5MB)
테스트 10 〉	통과 (0.03ms, 82.4MB)
테스트 11 〉	통과 (0.02ms, 79.8MB)
테스트 12 〉	통과 (6.98ms, 75.6MB)
테스트 13 〉	통과 (0.03ms, 76.3MB)
테스트 14 〉	실패 (0.03ms, 75.3MB)
 */