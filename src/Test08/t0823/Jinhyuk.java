package Test08.t0823;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        int a1 = 1;
        int b1 = 19;

        int a2 = 3;
        int b2 = 14;

        int a3 = 5;
        int b3 = 28;

        int a4 = 12;
        int b4 = 25;

        System.out.println(jinhyuk.solution(a1, b1));
        System.out.println(jinhyuk.solution(a2, b2));
        System.out.println(jinhyuk.solution(a3, b3));
        System.out.println(jinhyuk.solution(a4, b4));
    }
    public String solution(int a, int b) {

        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"}; // 요일 배열

        int start = 5; // 2016년 1월 1일은 금요일부터 시작

        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //각 달이 끝나는 날

        int allDays = 0; // 1월 1일부터 a월 b일까지의 총 일수

        for (int i = 0; i < a - 1; i++) {
            allDays += month[i]; // (a-1)번째 달까지의 날짜를 더함
        }

        allDays += b; // b일까지의 날짜를 더함

        return day[(allDays + start - 1) % 7]; // 기존에 깔린 start를 생각해서 -1을 해줌
    }
}

/*  풀이과정
    정답률보고 만만하게 들어갔는데 문제가 짧은거 대비해서
    어떻게 풀어야할지 감이 너무 안잡혀서<-(변명)
    처음에는 하나씩 지정해줘서 하드코딩급으로 하려다가
    pr한거 슬쩍보고 참고했습니다...

        {{ Trouble Shooting }}
1)      테스트 9, 13 통과 못함 -> WHY?
        String[] days = new String[366]; // 2020년은 윤년이므로 366일

        for (int i = 1; i < 366; i++) {  //366일까지 반복
            days[i] = day[start++ % 7]; // 7로 나눈 나머지를 이용해 요일을 저장
        }
        부분이 필요없다고 판단하여 삭제

        return day[(allDays + start - 1) % 7]; 으로 대체함

        for (int i = 1; i < a; i++) {
            if (a == 1) { //1월은 따로 계산
                allDays += b;
            } else {
                allDays += month[i-1]; // 나머지 달은 month배열을 이용해 날짜를 더함
            }
        }   부분을 변경하여
            for (int i = 0; i < a - 1; i++) {
        allDays += month[i]; // (a-1)번째 달까지의 날짜를 더함
    }   로 변경

[[ 테스트 통과 시간 0.02~0.04ms ]]
테스트 1 〉	통과 (0.03ms, 75.7MB)
테스트 2 〉	통과 (0.02ms, 88.1MB)
테스트 3 〉	통과 (0.02ms, 77.8MB)
테스트 4 〉	통과 (0.02ms, 72.7MB)
테스트 5 〉	통과 (0.03ms, 67.1MB)
테스트 6 〉	통과 (0.02ms, 74.6MB)
테스트 7 〉	통과 (0.03ms, 73.9MB)
테스트 8 〉	통과 (0.04ms, 73.2MB)
테스트 9 〉	통과 (0.03ms, 74.4MB)
테스트 10 〉	통과 (0.02ms, 81.9MB)
테스트 11 〉	통과 (0.03ms, 73.3MB)
테스트 12 〉	통과 (0.04ms, 80MB)
테스트 13 〉	통과 (0.02ms, 75MB)
테스트 14 〉	통과 (0.03ms, 80.7MB)
*/

