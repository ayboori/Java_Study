package Test08.t0809;
// 프로그래머스 lv.1 콜라 문제

public class Haena {
	public int solution(int a, int b, int n) {
		// 내가 갖고 있는 콜라
		int myCola = n;

		// 추가로 받은 콜라를 더할 answer
		int answer = 0;

		while (myCola >= a) {
			// 내 콜라를 마트에 주고 추가로 받은 콜라와 나머지 계산하기
			int addCola = myCola / a * b;
			int rest = myCola % a;

			// 현재 내가 갖고 있는 콜라 = 추가로 받은 콜라 + 나머지
			myCola = addCola + rest;

			// 추가로 받은 콜라 answer에 더하기
			answer += addCola;
		}
		return answer;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(sol.solution(2, 1, 20));
		System.out.println(sol.solution(3, 1, 20));
		System.out.println(sol.solution(3, 2, 20));
		System.out.println(sol.solution(5, 3, 21));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 76.1MB)
테스트 2 〉	통과 (0.03ms, 66.9MB)
테스트 3 〉	통과 (0.03ms, 76.4MB)
테스트 4 〉	통과 (0.01ms, 74.5MB)
테스트 5 〉	통과 (0.04ms, 77.3MB)
테스트 6 〉	통과 (0.03ms, 72.1MB)
테스트 7 〉	통과 (0.02ms, 80.2MB)
테스트 8 〉	통과 (0.03ms, 79.9MB)
테스트 9 〉	통과 (0.02ms, 74.6MB)
테스트 10 〉	통과 (0.02ms, 81.5MB)
테스트 11 〉	통과 (0.03ms, 70.9MB)
테스트 12 〉	통과 (0.08ms, 73.9MB)
테스트 13 〉	통과 (0.02ms, 78.6MB)
테스트 14 〉	통과 (0.02ms, 73.8MB)
 */