package Test06.Test0630_P;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Jisoo_Test {
	public static void main(String[] args) {
		// 랜덤으로 배열을 생성하는 메서드
		int[] arr = generateRandomArray(100_000_000);

		// 다른 사람 풀이(ArrayList 이용)
		long start1 = System.currentTimeMillis();
		solutionUsingArrayList(arr);
		long end1 = System.currentTimeMillis();
		System.out.println("arraylist -> int[] : " + (end1 - start1) + "ms");

		// 내 첫 풀이
		long start2 = System.currentTimeMillis();
		solution(arr);
		long end2 = System.currentTimeMillis();
		System.out.println("첫풀이 -> int[] : " + (end2 - start2) + "ms");

		// 다른 사람의 풀이에서 자료구조만 Stack으로 바꿔보기.
		long start3 = System.currentTimeMillis();
		solution2(arr);
		long end3 = System.currentTimeMillis();
		System.out.println("stack -> int[] : " + (end3 - start3) + "ms");

	}

	// 다른 사람 풀이(ArrayList 이용)
	public static int[] solutionUsingArrayList(int[] arr) {
		ArrayList<Integer> tempList = new ArrayList<>();
		int preNum = 10;
		for (int num : arr) {
			if (preNum != num) {
				tempList.add(num);
			}
			preNum = num;
		}
		int[] answer = new int[tempList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = tempList.get(i);
		}
		return answer;
	}

	// 첫 풀이
	public static int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (!stack.peek().equals(arr[i])) {
				stack.push(arr[i]);
			}
		}
		int[] answer = new int[stack.size()];
		for (int i = stack.size() - 1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		return answer;
	}

	// 다른 사람의 풀이에서 자료구조만 Stack으로 바꿔보기.
	public static int[] solution2(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int preNum = 10;
		for (int num : arr) {
			if (preNum != num) {
				stack.push(num);
			}
			preNum = num;
		}
		int[] answer = new int[stack.size()];
		for (int i = stack.size() - 1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		return answer;
	}

	// 성능 테스트를 위해 랜덤으로 백만개의 0~9의 원소를 가진 배열 생성
	// random.nextInt(n) 메서드는 0이상 n미만의 범위에서 랜덤으로 정수를 생성하는 메서드.
	public static int[] generateRandomArray(int size) {
		int[] arr = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(10);
		}
		return arr;
	}
}

/*

<< 결과 >>
arraylist -> int[] : 3430ms
첫풀이 -> int[] : 5912ms
stack -> int[] : 3517ms

<< 원인 분석 >>
arrayList와 stack의 차이도 어느 정도 나지만, 자료구조의 문제가 아니라

int와 array 원소를 비교하느냐
stack의 peek과 array원소를 비교하느냐

의 차이였던 것 같다.

아마 stack이 조금 더 느린 이유는 메모리 할당, 포인터 조작, 메모리 해제 등의 오버헤드가 일어나서 그런거로 추정.

 */