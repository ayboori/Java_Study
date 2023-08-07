// K번째 수
package Test08.t0807;

import java.util.*;

public class JisooTest {
	public static void main(String[] args) {
		// Arrays.sort()와 Collections.sort()의 차이
		JisooTest jisoo = new JisooTest();

		// n을 하나하나 늘려간다.
		for (int n = 1; n <= 1_000_000; n += 100) {

			// 정해진 크기만큼의 배열을 만들고 0, -1, ... 내림차순으로 원소를 넣어놓는다.
			int[] array = new int[n];
			for (int i = 0; i < array.length; i++) {
				array[i] = -i;
			}

			// arrayList에 0, -1, ... 내림차순으로 원소를 넣어놓는다.
			ArrayList<Integer> arrayList = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				arrayList.add(-i);
			}

			// Arrays.sort() 전후, Collection.sort() 전후로 시간을 측정한다.
			long one = System.currentTimeMillis();
			Arrays.sort(array);
			long two = System.currentTimeMillis();
			Collections.sort(arrayList);
			long three = System.currentTimeMillis();

			// Arrays.sort()가 더 느릴 때 print문으로 출력한다.
			if (three - two < two - one) {
				System.out.println(n + "에서 Array가 느려 : " + ((two - one) - (three - two)) + "만큼 차이 나.");
			}
		}

	}

}

/*

이번 프로그래머스 풀이에서 Collections.sort()로 구해보니 조금 더 빠르길래..?
오잉? 왜 빠르지? 하고 Arrays.sort()와 Collections.sort()의 성능을 테스트해봤다!

** 신기했던 것 **

크기가 353_000까지는 Array.sort()가 느릴 때도 있는데
Collections.sort()의 차이가 1ms 정도로 차이가 매우 근소하다.

그 외에는 다 Arrays.sort()가 빠르다!

** Collections.sort()의 내부 코드 **

Collections.sort()는 list.sort()를 쓰고

list.sort()는
list를 배열로 바꾸고
Arrays.sort()로 정렬을 해준 뒤,
iterator로 list에 다시 넣어주는 방식인 것 같다.

** 결론 **

자료구조를 써야 더 빨리 풀린다 & 정렬하는 크기가 그렇게 크지 않다
-> Collections.sort()를 쓰자.

자료구조를 쓰는 것보다는 배열을 쓰는게 좋다 || 정렬하는 크기가 매우매우 크다!
-> Arrays.sort()를 쓰는쪽으로 해보자.

나중에 데이터 크기가 커지니까 iterator 때문인지 막 5배 넘게 걸리고 그랬다..!

 */