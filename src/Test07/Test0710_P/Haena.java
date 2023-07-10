package Test07.Test0710_P;

public class Haena {
	public static void main(String[] args) {
		Haena sol = new Haena();
		System.out.println(sol.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5}));
		System.out.println(sol.solution(new String[]{"TR", "RT", "TR"}, new int[] {7, 1, 3}));
	}

	public String solution(String[] survey, int[] choices) {
		// 지표별로 총 점수가 마이너스거나 0이면 false 유형이, 플러스면 true 유형이 나오도록 만들기
		int data1 = 0; // 1번 지표, false: R, true: T
		int data2 = 0; // 2번 지표, false: C, true: F
		int data3 = 0; // 3번 지표, false: J, true: M
		int data4 = 0; // 4번 지표, false: A, true: N

		boolean flag; // 어떤 유형에 점수를 더할지 방향 정하기

		for (int i = 0; i < survey.length; i++) {
			char dataFlag = survey[i].charAt(1);

			// 어떤 유형에 점수를 더할지 방향 정하기
			if(dataFlag == 'T' || dataFlag == 'F' || dataFlag == 'M' || dataFlag == 'N') {
				flag = true;
			} else {
				flag = false;
			}

			int dataChoice = choices[i];
			int dataScore = 0;

			// 만약 flag가 true라면 스코어를 순서대로 두고 -4, false라면 스코어를 반대로 뒤집어 생각하기
			// 예) if RT -> true -3 -2 -1 0 1 2 3 || TR -> false 3 2 1 0 -1 -2 -3
			if (flag == true) {
				dataScore = dataChoice - 4;
			} else {
				switch (dataChoice) {
					case 1 : dataScore = 3; break;
					case 2 : dataScore = 2; break;
					case 3 : dataScore = 1; break;
					case 5 : dataScore = -1; break;
					case 6 : dataScore = -2; break;
					case 7 : dataScore = -3; break;
				}
			}

			// 스코어를 더하기
			if (dataFlag == 'R' || dataFlag == 'T') {
				data1 += dataScore;
			} else if (dataFlag == 'C' || dataFlag == 'F') {
				data2 += dataScore;
			} else if (dataFlag == 'J' || dataFlag == 'M') {
				data3 += dataScore;
			} else if (dataFlag == 'A' || dataFlag == 'N') {
				data4 += dataScore;
			}
		}

		// 모든 스코어를 더했을 때
		StringBuilder sb = new StringBuilder();
		char s1 = data1 <= 0 ? 'R' : 'T';
		char s2 = data2 <= 0 ? 'C' : 'F';
		char s3 = data3 <= 0 ? 'J' : 'M';
		char s4 = data4 <= 0 ? 'A' : 'N';
		sb.append(s1);
		sb.append(s2);
		sb.append(s3);
		sb.append(s4);

		return sb.toString();

		// 모든 스코어를 더했을 때
//		String s1 = data1 <= 0 ? "R" : "T";
//		String s2 = data2 <= 0 ? "C" : "F";
//		String s3 = data3 <= 0 ? "J" : "M";
//		String s4 = data4 <= 0 ? "A" : "N";
//		return s1 + s2 + s3 + s4;
	}
}

/* String으로 제출 했을 때
테스트 1 〉	통과 (18.27ms, 83.5MB)
테스트 2 〉	통과 (21.03ms, 75.8MB)
테스트 3 〉	통과 (13.89ms, 68.4MB)
테스트 4 〉	통과 (16.91ms, 73.9MB)
테스트 5 〉	통과 (15.46ms, 89.5MB)
테스트 6 〉	통과 (19.31ms, 80.1MB)
테스트 7 〉	통과 (16.32ms, 83.7MB)
테스트 8 〉	통과 (30.23ms, 76.9MB)
테스트 9 〉	통과 (20.31ms, 83.8MB)
테스트 10 〉	통과 (16.58ms, 88.3MB)
테스트 11 〉	통과 (24.99ms, 79.1MB)
테스트 12 〉	통과 (16.63ms, 81.5MB)
테스트 13 〉	통과 (19.06ms, 83.6MB)
테스트 14 〉	통과 (18.04ms, 77.1MB)
테스트 15 〉	통과 (15.61ms, 76.5MB)
테스트 16 〉	통과 (15.39ms, 85.1MB)
테스트 17 〉	통과 (16.39ms, 85.7MB)
테스트 18 〉	통과 (20.43ms, 94.8MB)
테스트 19 〉	통과 (16.63ms, 81.2MB)
테스트 20 〉	통과 (15.47ms, 86.1MB)
 */

/* StringBuilder로 제출 했을 때
테스트 1 〉	통과 (0.04ms, 80.4MB)
테스트 2 〉	통과 (0.03ms, 73.7MB)
테스트 3 〉	통과 (0.04ms, 79.8MB)
테스트 4 〉	통과 (0.04ms, 75.6MB)
테스트 5 〉	통과 (0.04ms, 77.6MB)
테스트 6 〉	통과 (0.04ms, 75.8MB)
테스트 7 〉	통과 (0.04ms, 75.7MB)
테스트 8 〉	통과 (0.04ms, 75.4MB)
테스트 9 〉	통과 (0.04ms, 74.3MB)
테스트 10 〉	통과 (0.04ms, 73.3MB)
테스트 11 〉	통과 (0.06ms, 84MB)
테스트 12 〉	통과 (0.09ms, 74.3MB)
테스트 13 〉	통과 (0.12ms, 83.7MB)
테스트 14 〉	통과 (0.11ms, 81.8MB)
테스트 15 〉	통과 (0.21ms, 77.6MB)
테스트 16 〉	통과 (0.25ms, 77.3MB)
테스트 17 〉	통과 (0.21ms, 72.2MB)
테스트 18 〉	통과 (0.14ms, 77MB)
테스트 19 〉	통과 (0.21ms, 81.2MB)
테스트 20 〉	통과 (0.22ms, 79.1MB)
 */