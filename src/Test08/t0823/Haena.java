package Test08.t0823;

// 프로그래머스 lv.1 2016년
public class Haena {
    public String solution(int a, int b) {
        // 1월 1일이 금요일이므로 index 1이 금요일이 되도록 요일을 String 배열에 넣는다.
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        // 날짜를 모두 더할 수 있도록 월별로 일수를 int 배열에 담는다.
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        // 주어진 날짜까지의 모든 날짜를 더한다.
        // ex) 3월 2일 = (1월) 31 + (2월) 29 + (3월) 2
        int allDays = b;
        for (int i = 1; i < a; i++) {
            allDays += monthDays[i-1];
        }

        // 모든 날짜를 더한 값을 7로 나눈 나머지로 index를 구한 후
        // 요일 배열에서 주어진 날짜의 요일을 찾는다.
        return week[allDays % 7];
    }

    public static void main(String[] args) {
        Haena sol = new Haena();
        System.out.println(sol.solution(5, 24));
    }
}

/*
테스트 1 〉	통과 (0.02ms, 77.5MB)
테스트 2 〉	통과 (0.04ms, 76.1MB)
테스트 3 〉	통과 (0.02ms, 71.2MB)
테스트 4 〉	통과 (0.02ms, 71.4MB)
테스트 5 〉	통과 (0.03ms, 73.7MB)
테스트 6 〉	통과 (0.02ms, 71.9MB)
테스트 7 〉	통과 (0.03ms, 75.4MB)
테스트 8 〉	통과 (0.04ms, 78MB)
테스트 9 〉	통과 (0.04ms, 75.2MB)
테스트 10 〉	통과 (0.02ms, 72.7MB)
테스트 11 〉	통과 (0.04ms, 76.1MB)
테스트 12 〉	통과 (0.03ms, 74.8MB)
테스트 13 〉	통과 (0.03ms, 77.1MB)
테스트 14 〉	통과 (0.02ms, 72.2MB)
 */
