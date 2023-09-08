package Test09.t0908;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        int n1 = 10;
        int n2 = 5;

        System.out.println(jinhyuk.solution(n1)); // 4
        System.out.println(jinhyuk.solution(n2)); // 3
    }

    public int solution(int n) {
        int answer = 0;
        int[] sosuNum = new int[n+1]; //0과 1은 소수가 아니고 포함도 안되므로 n-1개의 배열을 생성

        for (int i = 2; i <= n; i++) { //2부터 n까지의 수를 배열에 넣어주겠습니다.
            sosuNum[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (sosuNum[i] == 0) continue; //0이면 다음으로 넘어가고
            for (int j = 2 * i; j <= n; j += i) { //각 숫자들의 배수를
                sosuNum[j] = 0; //0으로 만들어버립니다.
            }
        }
        for (int i = 0; i < sosuNum.length; i++) { //0부터 sosuNum의 길이만큼에서
            if (sosuNum[i] != 0) { //0이 아닌 수들은
                answer++; //answer에 1을 더합니다. -> 소수의 개수
            }
        }
        return answer; // 결과 리턴 슈웃~!
    }
}

/*
{{ Trouble Shooting }}
int[] sosuNum = new int[n-1];
sosuNum의 범위가 2~n까지의 범위이므로 n-1이 맞다고 생각하였으나
소수를 판별하는 에라토스테네스의 체에서는 해당 범위 사용시 n이 10일 경우에
0~8까지만 판단하는 공식이 되어버리는 오류가 발생하는 것을 발견
따라서 범위를 아래와 같이 수정했습니다.
int[] sosuNum = new int[n+1];

정확성 테스트 (0.03~16.06ms, 67.1~85.3M)
테스트 1 〉	통과 (0.05ms, 82.1MB)
테스트 2 〉	통과 (0.03ms, 70.9MB)
테스트 3 〉	통과 (0.08ms, 74.8MB)
테스트 4 〉	통과 (0.09ms, 73.4MB)
테스트 5 〉	통과 (0.11ms, 79MB)
테스트 6 〉	통과 (0.62ms, 67.1MB)
테스트 7 〉	통과 (0.33ms, 85.3MB)
테스트 8 〉	통과 (0.83ms, 85.3MB)
테스트 9 〉	통과 (0.76ms, 77MB)
테스트 10 〉	통과 (7.67ms, 68.7MB)
테스트 11 〉	통과 (16.06ms, 80.6MB)
테스트 12 〉	통과 (9.81ms, 75.9MB)

효율성 테스트 (18.63~26.95ms, 55.5~56.5MB)
테스트 1 〉	통과 (26.95ms, 56MB)
테스트 2 〉	통과 (18.63ms, 56.5MB)
테스트 3 〉	통과 (25.99ms, 55.5MB)
테스트 4 〉	통과 (22.38ms, 55.5MB)
*/