package Test07.Test0703_P;

import java.util.ArrayList;
import java.util.List;

public class Haena {
	public static void main(String[] args) {
		SolutionHn sol = new SolutionHn();
		System.out.println(sol.solution(45));
		System.out.println(sol.solution(125));
	}
}

class SolutionHn {
	public int solution(int n) {
		// 뒤집어진 3진수 구하기
		List list = new ArrayList<>();
		while (n != 0) {
			list.add(n % 3);
			n /= 3;
		}

		// 뒤집어진 3진수를 순서대로 돌면서 답을 구하기
		int answer = 0;
		for (int i = 0, j = list.size() - 1; i < list.size(); i++, j--) {
			answer += (int) Math.pow(3, j) * (int) list.get(i);
			// Math.pow는 double형이고, list.get(i)는 list에서 가져오기 때문에 Object로 인식히여 int 강제 형변환 필요
		}
		return answer;
	}
}


/*
테스트 1 〉	통과 (0.10ms, 72.3MB)
테스트 2 〉	통과 (0.05ms, 76.2MB)
테스트 3 〉	통과 (0.04ms, 74.5MB)
테스트 4 〉	통과 (0.04ms, 73.3MB)
테스트 5 〉	통과 (0.05ms, 75.6MB)
테스트 6 〉	통과 (0.04ms, 69.8MB)
테스트 7 〉	통과 (0.05ms, 76.3MB)
테스트 8 〉	통과 (0.05ms, 75.6MB)
테스트 9 〉	통과 (0.04ms, 77.7MB)
테스트 10 〉	통과 (0.04ms, 72.3MB)
 */