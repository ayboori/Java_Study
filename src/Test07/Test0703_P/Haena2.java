package Test07.Test0703_P;

public class Haena2 {
	public static void main(String[] args) {
		SolutionHn2 sol = new SolutionHn2();
		System.out.println(sol.solution(45));
		System.out.println(sol.solution(125));
	}
}

class SolutionHn2 {
	public int solution(int n) {
		StringBuilder sb = new StringBuilder(Integer.toString(n,3));
		return Integer.parseInt(sb.reverse().toString(),3);
	}
}

/*
테스트 1 〉	통과 (0.06ms, 77.9MB)
테스트 2 〉	통과 (0.07ms, 76.1MB)
테스트 3 〉	통과 (0.04ms, 75.3MB)
테스트 4 〉	통과 (0.06ms, 73MB)
테스트 5 〉	통과 (0.05ms, 77.5MB)
테스트 6 〉	통과 (0.05ms, 73.1MB)
테스트 7 〉	통과 (0.04ms, 71.3MB)
테스트 8 〉	통과 (0.06ms, 87.4MB)
테스트 9 〉	통과 (0.05ms, 72.4MB)
테스트 10 〉	통과 (0.04ms, 75.4MB)
 */
