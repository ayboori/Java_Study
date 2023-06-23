package Test06.Test0623_P;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Jisoo2_adv {
	public static void main(String[] args) {
		Jisoo2_adv otherJ = new Jisoo2_adv();
		String[] t1_1 = {
			"SOO",
			"OOO",
			"OOO"
		};
		String[] t1_2 = {"E 2", "S 2", "W 1"};
		String[] t2_1 = {
			"SOO",
			"OXX",
			"OOO"
		};
		String[] t2_2 = {"E 2", "S 2", "W 1"};
		String[] t3_1 = {
			"OSO",
			"OOO",
			"OXO",
			"OOO"
		};
		String[] t3_2 = {"E 2", "S 3", "W 1"};

		System.out.println(Arrays.toString(otherJ.solution(t1_1, t1_2)));
		System.out.println(Arrays.toString(otherJ.solution(t2_1, t2_2)));
		System.out.println(Arrays.toString(otherJ.solution(t3_1, t3_2)));

	}

	public int[] solution(String[] park, String[] routes) {
		// answer : 이동하는 좌표(현재 좌표)
		int[] answer = new int[2];

		// 시작점 찾기
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length(); j++) {
				if (park[i].charAt(j) == 'S') {
					answer[0] = i;
					answer[1] = j;
				}
			}
		}

		// routes 배열을 돌면서 갈 수 있으면 가고 갈 수 없으면 pass
		for (int i = 0; i < routes.length; i++) {
			char direction = routes[i].charAt(0);
			int move = routes[i].charAt(2) - '0';

			if (cango(park, answer, direction, move)) {
				answer[0] += mapping().get(direction)[0] * move;
				answer[1] += mapping().get(direction)[1] * move;
			}
		}

		return answer;
	}

	// 갈 수 있는지 boolean 으로 return 해주는 메서드.
	public boolean cango(String[] park, int[] answer, char direction, int move) {
		// park의 가로, 세로
		int width = park[0].length();
		int height = park.length;

		// 초기 x,y 좌표 설정
		int x = answer[0];
		int y = answer[1];

		for (int i = 1; i <= move; i++) {

			// 가야 할 방향의 단위거리설정
			int unitX = mapping().get(direction)[0];
			int unitY = mapping().get(direction)[1];

			// 단위거리만큼 이동
			x += unitX;
			y += unitY;

			// 단위거리만큼 이동했을 때, 공원 범위를 벗어나면 false
			if (x < 0 || x >= height || y < 0 || y >= width) {
				return false;
			}

			// 단위거리만큼 이동했을 때, 장애물이 있으면 false
			if (park[x].charAt(y) == 'X') {
				return false;
			}
		}
		return true;
	}

	public Map<Character, int[]> mapping() {
		// 동, 서, 남, 북과 단위거리 매핑
		Map<Character, int[]> directionUnit = new HashMap<>();
		directionUnit.put('E', new int[] {0, 1});
		directionUnit.put('W', new int[] {0, -1});
		directionUnit.put('S', new int[] {1, 0});
		directionUnit.put('N', new int[] {-1, 0});
		return directionUnit;
	}
}

/*
테스트 1 〉통과 (0.13ms, 77.9MB)
테스트 2 〉통과 (0.20ms, 75.7MB)
테스트 3 〉통과 (0.54ms, 75.3MB)
테스트 4 〉통과 (0.83ms, 76.7MB)
테스트 5 〉통과 (1.10ms, 81.2MB)
테스트 6 〉통과 (1.37ms, 78.8MB)
테스트 7 〉통과 (1.47ms, 86.5MB)
테스트 8 〉통과 (1.86ms, 76.7MB)
테스트 9 〉통과 (0.85ms, 77.9MB)
테스트 10 〉통과 (0.88ms, 73.3MB)
테스트 11 〉통과 (0.90ms, 78.1MB)
테스트 12 〉통과 (1.24ms, 73MB)
테스트 13 〉통과 (1.41ms, 74.1MB)
테스트 14 〉통과 (1.27ms, 79.1MB)
테스트 15 〉통과 (1.18ms, 73MB)
테스트 16 〉통과 (0.42ms, 77.1MB)
테스트 17 〉통과 (0.57ms, 71.4MB)
테스트 18 〉통과 (0.31ms, 65.4MB)
테스트 19 〉통과 (0.62ms, 76.8MB)
테스트 20 〉통과 (0.20ms, 80.1MB)
 */