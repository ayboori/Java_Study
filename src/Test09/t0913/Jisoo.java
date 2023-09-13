// 실패율
package Test09.t0913;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo js = new Jisoo();

		int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
		// [3, 4, 2, 1, 5]
		int[] stages2 = {4, 4, 4, 4, 4};
		// [4, 1, 2, 3]
		int[] stages3 = {3};
		// [1,2]
		int[] stages4 = {3, 2, 1, 1};
		// [3, 1, 2, 4, 5]

		System.out.println(Arrays.toString(js.solution(5, stages1)));
		System.out.println(Arrays.toString(js.solution(4, stages2)));
		System.out.println(Arrays.toString(js.solution(2, stages3)));
		System.out.println(Arrays.toString(js.solution(5, stages4)));
	}

	public int[] solution(int N, int[] stages) {
		int[] stay = new int[N + 2];

		// stage당 머물러 있는 수
		for (int i = 0; i < stages.length; i++) {
			stay[stages[i]]++;
		}
		int people = stages.length;		// 유저 수

		// 실패율 구하기
		List<Node> fail = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			double failure = people == 0 ? 0 : (double) stay[i] / people;
			fail.add(new Node(i, failure));
			people -= stay[i];
		}

		// 정렬 - 아래에서 구현해준 compare에 맞춰서 정렬됩니다.
		// 실패율이 큰 순서대로, 실패율이 크면 단계가 낮은 순서대로
		Collections.sort(fail);

		// 답 리턴해주기 위해 list -> 배열
		int[] answer = new int[N];
		for (int i = 0; i < fail.size(); i++) {
			answer[i] = fail.get(i).x;
		}

		return answer;
	}

	// 단계와 실패율 쌍 지어주기
	class Node implements Comparable<Node> {
		int x;    // 단계
		double y;    // 실패율

		Node(int x, double y) {
			this.x = x;
			this.y = y;
		}

		// 실패율로 비교하고, 실패율이 같으면 단계로 비교.
		@Override
		public int compareTo(Node n) {
			if (n.y > this.y) {
				return 1;
			} else if (this.y == n.y) {
				return this.x - n.x;
			} else {
				return -1;
			}
		}
	}
}

/*
정확성  테스트(0.41ms ~ 5.83ms)

뭐 이 정도면 나쁘지 않다~
그리고 생각보다 다들 이러케 푸러따~

테스트 1 〉통과 (0.66ms, 73.2MB)
테스트 2 〉통과 (0.54ms, 74MB)
테스트 3 〉통과 (1.52ms, 83.9MB)
테스트 4 〉통과 (2.64ms, 83.1MB)
테스트 5 〉통과 (5.83ms, 87.7MB)
테스트 6 〉통과 (1.01ms, 72.1MB)
테스트 7 〉통과 (0.90ms, 78.5MB)
테스트 8 〉통과 (4.15ms, 95.9MB)
테스트 9 〉통과 (3.84ms, 85MB)
테스트 10 〉통과 (4.03ms, 85MB)
테스트 11 〉통과 (2.65ms, 81.4MB)
테스트 12 〉통과 (2.87ms, 82MB)
테스트 13 〉통과 (4.14ms, 79.3MB)
테스트 14 〉통과 (0.51ms, 74.1MB)
테스트 15 〉통과 (1.79ms, 88.6MB)
테스트 16 〉통과 (1.07ms, 76.6MB)
테스트 17 〉통과 (2.20ms, 81.8MB)
테스트 18 〉통과 (2.24ms, 57.2MB)
테스트 19 〉통과 (0.64ms, 76.2MB)
테스트 20 〉통과 (1.62ms, 80.8MB)
테스트 21 〉통과 (2.45ms, 82.9MB)
테스트 22 〉통과 (3.68ms, 104MB)
테스트 23 〉통과 (4.48ms, 91.2MB)
테스트 24 〉통과 (2.89ms, 86.5MB)
테스트 25 〉통과 (0.51ms, 92.1MB)
테스트 26 〉통과 (0.53ms, 74.8MB)
테스트 27 〉통과 (0.41ms, 73.1MB)
 */