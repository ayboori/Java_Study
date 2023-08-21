package Test08.t0811;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();

		String[] name1 = {"may", "kein", "kain", "radi"};
		int[] yearning1 = {5, 10, 1, 3};
		String[][] photo1 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		// {19, 15, 6}

		String[] name2 = {"kali", "mari", "don"};
		int[] yearning2 = {11, 1, 55};
		String[][] photo2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
		// {67, 0, 55}

		String[] name3 = {"may", "kein", "kain", "radi"};
		int[] yearning3 = {5, 10, 1, 3};
		String[][] photo3 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};
		// {5, 15, 0}

		System.out.println(Arrays.toString(jisoo.solution(name1, yearning1, photo1)));
		System.out.println(Arrays.toString(jisoo.solution(name2, yearning2, photo2)));
		System.out.println(Arrays.toString(jisoo.solution(name3, yearning3, photo3)));
	}

	// 각 사람별 추억 점수가 필요하다! -> Map을 쓰자~
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		// 각 사람별 추억 점수 저장
		Map<String, Integer> scores = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			scores.put(name[i], yearning[i]);
		}

		// 사진별 추억 점수 구하기
		int[] answer = new int[photo.length];
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				answer[i] += scores.getOrDefault(photo[i][j], 0);
			}
		}

		return answer;
	}
}

/*
(0.05ms ~ 2.58ms)
테스트 1 〉통과 (0.06ms, 72.1MB)
테스트 2 〉통과 (0.05ms, 74.8MB)
테스트 3 〉통과 (1.20ms, 104MB)
테스트 4 〉통과 (0.28ms, 83.3MB)
테스트 5 〉통과 (0.78ms, 73.7MB)
테스트 6 〉통과 (1.43ms, 81.2MB)
테스트 7 〉통과 (1.76ms, 78.8MB)
테스트 8 〉통과 (1.38ms, 84.4MB)
테스트 9 〉통과 (1.31ms, 83.6MB)
테스트 10 〉통과 (2.58ms, 95.8MB)
테스트 11 〉통과 (2.49ms, 96.3MB)
테스트 12 〉통과 (2.12ms, 95.2MB)
테스트 13 〉통과 (0.33ms, 74.6MB)
테스트 14 〉통과 (0.05ms, 74.7MB)
 */