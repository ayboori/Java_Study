package Test07.Test0712_P;

public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();

        System.out.println(solution(new int[-2, 3, 0, 2, -5]); // 2
        System.out.println(solution(new int[-3, -2, -1, 0, 1, 2, 3]); // 5
        System.out.println(solution(new int[-1, 1, -1, 1]); // 0
    }

    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0 ; i < number.length ; i++){ // 첫 번째 인덱스
            for (int j = i + 1; j < number.length ; j++){ // 두 번째 인덱스 - 1번 다음 값부터 증가
                for (int k = j + 1 ; k < number.length ; k++){// 세 번째 인덱스 - 2번 다음 값부터 증가
                    if(number[i] + number[j] + number[k] == 0){
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 71.4MB)
테스트 2 〉	통과 (0.02ms, 76MB)
테스트 3 〉	통과 (0.02ms, 74.5MB)
테스트 4 〉	통과 (0.02ms, 76.5MB)
테스트 5 〉	통과 (0.04ms, 78.4MB)
테스트 6 〉	통과 (0.02ms, 76.9MB)
테스트 7 〉	통과 (0.03ms, 75.4MB)
테스트 8 〉	통과 (0.02ms, 72MB)
테스트 9 〉	통과 (0.03ms, 78.1MB)
테스트 10 〉	통과 (0.02ms, 69.4MB)
테스트 11 〉	통과 (0.03ms, 77.3MB)
테스트 12 〉	통과 (0.03ms, 75.2MB)
테스트 13 〉	통과 (0.03ms, 77MB)
 */