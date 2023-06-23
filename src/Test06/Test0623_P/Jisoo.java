// lv.1 공원 산책
package Test06.Test0623_P;

import java.util.Arrays;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();

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

		System.out.println(Arrays.toString(jisoo.solution(t1_1, t1_2)));
		System.out.println(Arrays.toString(jisoo.solution(t2_1, t2_2)));
		System.out.println(Arrays.toString(jisoo.solution(t3_1, t3_2)));

	}

	public int[] solution(String[] park, String[] routes) {
		// 공원의 칸을 2차원 배열을 만들어 한 칸 한 칸 따로 저장.
		// ex. test 1 : {{"S", "O", "O"}, {"O", "O", "O"}, {"O", "O", "O"}}
		String[][] deepPark = new String[park.length][park[0].length()];
		// 이동하는 좌표(현재 좌표)
		int[] answer = new int[2];

		// deepPark 만들면서 시작지점 찾기
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length(); j++) {
				deepPark[i][j] = Character.toString(park[i].charAt(j));
				if (deepPark[i][j].equals("S")) {
					answer[0] = i;
					answer[1] = j;
				}
			}
		}

		// 주어진 routes[i]에서 첫번째 글자는 direction, 두번째 숫자는 움직이는 칸 수
		// charAt(2)라고 쓸 수 있는 이유 : 숫자의 범위가 1부터 9까지 이므로. 안 그랬으면 split(" ")으로 하면 될 거 같다.
		for (int i = 0; i < routes.length; i++) {
			char direction = routes[i].charAt(0);
			int move = routes[i].charAt(2) - '0';

			// canGo 메서드 : 공원, 현재 좌표, 방향, 움직이는 칸의 수가 정해졌을 때,
			// 내가 움직일 수 있는지 boolean값으로 return하는 메서드.
			if (canGo(deepPark, answer, direction, move)) {
				switch (direction) {
					case 'E':
						answer[1] += move;
						break;
					case 'W':
						answer[1] -= move;
						break;
					case 'S':
						answer[0] += move;
						break;
					case 'N':
						answer[0] -= move;
						break;
				}
			}
		}
		return answer;
	}

	// 장애물 확인 & 공원을 벗어나는지 확인
	public boolean canGo(String[][] deepArr, int[] start, char direction, int move) {
		int width = deepArr[0].length;
		int height = deepArr.length;

		switch (direction) {
			case 'E': {
				// 첫번째 조건, move만큼 움직였을 때 공원을 벗어나는지 확인
				if (start[1] + move >= width) {
					return false;
				}
				// 공원을 벗어나지 않는다면 move만큼 움직였을 때 가는 길에 장애물이 있는지 확인
				for (int i = start[1] + 1; i <= start[1] + move; i++) {
					if (deepArr[start[0]][i].equals("X")) {
						return false;
					}
				}
				break;
			}
			case 'W': {
				if (start[1] - move < 0) {
					return false;
				}
				for (int i = start[1] - 1; i >= start[1] - move; i--) {
					if (deepArr[start[0]][i].equals("X")) {
						return false;
					}
				}
				break;
			}
			case 'S': {
				if (start[0] + move >= height) {
					return false;
				}
				for (int i = start[0] + 1; i <= start[0] + move; i++) {
					if (deepArr[i][start[1]].equals("X")) {
						return false;
					}
				}
				break;
			}
			case 'N': {
				if (start[0] - move < 0) {
					return false;
				}
				for (int i = start[0] - 1; i >= start[0] - move; i--) {
					if (deepArr[i][start[1]].equals("X")) {
						return false;
					}
				}
				break;
			}
		}
		return true;
	}
}

/*
테스트 1 〉통과 (0.06ms, 77.9MB)
테스트 2 〉통과 (0.06ms, 77.1MB)
테스트 3 〉통과 (0.10ms, 76.3MB)
테스트 4 〉통과 (0.36ms, 67.3MB)
테스트 5 〉통과 (0.64ms, 79.6MB)
테스트 6 〉통과 (1.04ms, 81MB)
테스트 7 〉통과 (1.18ms, 78.3MB)
테스트 8 〉통과 (1.27ms, 86.8MB)
테스트 9 〉통과 (0.81ms, 73.8MB)
테스트 10 〉통과 (0.93ms, 69MB)
테스트 11 〉통과 (1.73ms, 90.4MB)
테스트 12 〉통과 (0.77ms, 76.6MB)
테스트 13 〉통과 (1.05ms, 72.7MB)
테스트 14 〉통과 (0.94ms, 75.8MB)
테스트 15 〉통과 (0.99ms, 74.6MB)
테스트 16 〉통과 (0.13ms, 78.7MB)
테스트 17 〉통과 (0.47ms, 78.2MB)
테스트 18 〉통과 (0.10ms, 74.6MB)
테스트 19 〉통과 (0.96ms, 79MB)
테스트 20 〉통과 (0.27ms, 69MB)
 */