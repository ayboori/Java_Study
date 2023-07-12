package Test07.Test0712_P;

public class Haena_CombinationExample {
	public static void main(String[] args) {
		int[] arr = {-3, -2, -1, 0, 1, 2, 3};
		boolean[] visited = new boolean[arr.length];
		int n = arr.length;
		int r = 3;

		System.out.println("=====backtracking=====");
		backtrackingCombination(arr, visited, 0, n, r);
	}

	/**
	 * 백트래킹 사용
	 * nCr : n개의 항목에서 r개를 뽑는다.
	 * n : 전체 크기 혹은 길이
	 * r : 뽑을 갯수
	 */
	static void backtrackingCombination(int[] arr, boolean[] visited, int start, int n, int r) {
		if (r == 0) {
			print(arr, visited, n);
			return;
		}

		for (int i = start; i < n; i++) {
			visited[i] = true;
			backtrackingCombination(arr, visited, i + 1, n, r - 1);
			visited[i] = false;
		}
	}

	// 배열 출력
	static void print(int[] arr, boolean[] visited, int n) {
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}
