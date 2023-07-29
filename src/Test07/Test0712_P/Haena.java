package Test07.Test0712_P;
// 프로그래머스 lv.1 삼총사

public class Haena {
	public int solution(int[] number) {
		int cnt = 0;
		for (int i = 0; i < number.length - 2; i++) {
			for (int j = i + 1; j < number.length - 1; j++) {
				for (int k = j + 1; k < number.length; k++) {
					if (number[i] + number[j] + number[k] == 0) {
						cnt++;
					}
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(sol.solution(new int[]{-2, 3, 0, 2, -5}));
		System.out.println(sol.solution(new int[]{-3,-2,-1,0,1,2,3}));
		System.out.println(sol.solution(new int[]{-1,1,-1,1}));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 72.5MB)
테스트 2 〉	통과 (0.02ms, 73.2MB)
테스트 3 〉	통과 (0.02ms, 72.7MB)
테스트 4 〉	통과 (0.02ms, 78.6MB)
테스트 5 〉	통과 (0.03ms, 75.1MB)
테스트 6 〉	통과 (0.03ms, 66.9MB)
테스트 7 〉	통과 (0.02ms, 75.7MB)
테스트 8 〉	통과 (0.04ms, 77.1MB)
테스트 9 〉	통과 (0.03ms, 74.5MB)
테스트 10 〉	통과 (0.02ms, 76.2MB)
테스트 11 〉	통과 (0.04ms, 75.7MB)
테스트 12 〉	통과 (0.03ms, 76.4MB)
테스트 13 〉	통과 (0.03ms, 76.1MB)
 */
