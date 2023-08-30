// 카드 뭉치
package Test08.t0828;

public class Jisoo {
	public static void main(String[] args) {
		Jisoo jisoo = new Jisoo();

		// "Yes"
		String[] cards1_1 = {"i", "drink", "water"};
		String[] cards2_1 = {"want", "to"};
		String[] goal_1 = {"i", "want", "to", "drink", "water"};

		// "No"
		String[] cards1_2 = {"i", "water", "drink"};
		String[] cards2_2 = {"want", "to"};
		String[] goal_2 = {"i", "want", "to", "drink", "water"};

		System.out.println(jisoo.solution(cards1_1, cards2_1, goal_1));
		System.out.println(jisoo.solution(cards1_2, cards2_2, goal_2));
	}

	// goal의 단어를 for문으로 돌면서 차례대로 검색합니다.

	// 1. cards1의 {index1}번째 값과 비교하여 goal의 단어가 일치하면 index1++, goalIndex++해줍니다.
	// 	  이 때, cards1을 전부 검색했으면(index1 >= cards1.length가 되면) cards1은 검색하지 않습니다.

	// 2. cards2도 cards1과 마찬가지의 로직으로 검사합니다.

	// goal에 있는 단어를 만들 때마다 goalIndex++해줬으므로 goal.length와 비교하여 같으면 "Yes" 아니면 "No"를 반환합니다.
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		int index1 = 0;			// cards1의 index
		int index2 = 0;			// cards2의 index
		int goalIndex = 0;		// goal에 있는 단어를 만들 때마다 goalIndex++;

		for (int i = 0; i < goal.length; i++) {
			if (index1 < cards1.length && goal[i].equals(cards1[index1])) {
				index1++;
				goalIndex++;
			} else if (index2 < cards2.length && goal[i].equals(cards2[index2])) {
				index2++;
				goalIndex++;
			}
		}

		return goalIndex == goal.length ? "Yes" : "No";
	}

}
/*
정확성  테스트( 0.01ms ~ 0.05ms )

테스트 1 〉통과 (0.02ms, 74.7MB)
테스트 2 〉통과 (0.03ms, 86.6MB)
테스트 3 〉통과 (0.03ms, 71.1MB)
테스트 4 〉통과 (0.03ms, 71.4MB)
테스트 5 〉통과 (0.03ms, 76.6MB)
테스트 6 〉통과 (0.02ms, 82.9MB)
테스트 7 〉통과 (0.02ms, 72.7MB)
테스트 8 〉통과 (0.04ms, 75MB)
테스트 9 〉통과 (0.01ms, 82.4MB)
테스트 10 〉통과 (0.02ms, 73.1MB)
테스트 11 〉통과 (0.03ms, 77MB)
테스트 12 〉통과 (0.03ms, 76.6MB)
테스트 13 〉통과 (0.03ms, 80.9MB)
테스트 14 〉통과 (0.02ms, 77MB)
테스트 15 〉통과 (0.02ms, 78.3MB)
테스트 16 〉통과 (0.05ms, 75MB)
테스트 17 〉통과 (0.02ms, 82.6MB)
테스트 18 〉통과 (0.02ms, 76.4MB)
테스트 19 〉통과 (0.02ms, 80.4MB)
테스트 20 〉통과 (0.04ms, 65.4MB)
테스트 21 〉통과 (0.03ms, 75.4MB)
테스트 22 〉통과 (0.02ms, 78.1MB)
테스트 23 〉통과 (0.03ms, 84.7MB)
테스트 24 〉통과 (0.02ms, 77.9MB)
테스트 25 〉통과 (0.01ms, 71.3MB)
 */
