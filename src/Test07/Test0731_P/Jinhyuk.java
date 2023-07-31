// 두 개 뽑아서 더하기
package Test07.Test0731_P;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Jinhyuk {
    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        int[] numbers1 = {2, 1, 3, 4, 1};
        int[] numbers2 = {5, 0, 2, 7};
        int[] numbers3 = {1, 2, 3, 4, 5};
        int[] numbers4 = {1, 9, 4, 8, 8};

        // 그냥 출력하면 hash코드 나옴 - toString으로 바꿔줘야함
        System.out.println(Arrays.toString(jinhyuk.solution(numbers1)));
        System.out.println(Arrays.toString(jinhyuk.solution(numbers2)));
        System.out.println(Arrays.toString(jinhyuk.solution(numbers3)));
        System.out.println(Arrays.toString(jinhyuk.solution(numbers4)));

    }

    public int[] solution(int[] numbers) {

        HashMap<Integer, Integer> sumNumMap = new HashMap<>();
        // sumNumMap이라는 이름의 해쉬맵을 써서 중복되는 값을 삭제할 예정

        for (int i = 0; i < numbers.length; i++) { //이중 포문으로 전부 하나씩 더해보기
            for (int j = i + 1; j < numbers.length; j++) {
                sumNumMap.put(numbers[i] + numbers[j], 0); // 더한 값 sumNumMap에 키에 저장, 값은 0 고정
            }
        }

        ArrayList<Integer> sumNumList = new ArrayList<>(sumNumMap.keySet());
        // sumNumMap의 키 값을 arratList인 sumNumList에 저장해줌

        // 저번시간에 했던 버블정렬 복습
        for (int i = 0; i < sumNumList.size() - 1; i++) { //마찬가지로 이중for문에
            for (int j = 0; j < sumNumList.size() - i - 1; j++) {
                if (sumNumList.get(j) > sumNumList.get(j + 1)) {
                    //if문을 써서 크기 비교를 하는데 sumNumList.get(j)가 sumNumList.get(j + 1)보다 크면

                    int temp = sumNumList.get(j); // temp에 sumNumList.get(j)를 저장하고,
                    sumNumList.set(j, sumNumList.get(j + 1)); // sumNumList.get(j)에는 sumNumList.get(j + 1)을 저장하고,
                    sumNumList.set(j + 1, temp); // sumNumList.get(j + 1)에는 temp를 저장해준다 둘이 바꿈
                }
            }
        }

        int[] answer = new int[sumNumList.size()]; //answer 배열의 크기는 sumNumList의 사이즈와 같고
        for (int i = 0; i < sumNumList.size(); i++) { // for문을 돌려서
            answer[i] = sumNumList.get(i); //하나씩 값을 순서대로 넣어준다
        }
        return answer; //반환 완료
    }
}

/*
[ TroubleShooting ]
1. sumMap에 값을 528(내 생일)로 넣었다가 0에 비해서 시간이 많이 소요되서 수정
2. main에서 sout후 jinhyuk.solution(numbers1)로 출력했더니
 [I@776ec8df <- 다음과 같이 hash코드가 나와서 Arrays.toString으로 바꿔줌
3. ArrayList<Integer> sumList = new ArrayList<>(sumMap.keySet()); 에서
키 값을 어레이에 저장 해주는 부분이 기억나지 않아 검색
4. 전반적으로 한 눈에 이해하게 수정함 (주석, sumNumList, sumNumMap 등등)
5. git으로 pull을 땡겨올시에 머지 오류 발생


[ 테스트 소요 시간 ]    0.05~4.81ms
테스트 1 〉	통과 (0.05ms, 72.7MB)
테스트 2 〉	통과 (0.07ms, 83.4MB)
테스트 3 〉	통과 (0.08ms, 72.5MB)
테스트 4 〉	통과 (0.12ms, 78.8MB)
테스트 5 〉	통과 (0.32ms, 79.4MB)
테스트 6 〉	통과 (0.74ms, 82MB)
테스트 7 〉	통과 (4.81ms, 74.3MB)
테스트 8 〉	통과 (1.19ms, 75MB)
테스트 9 〉	통과 (0.93ms, 82.4MB)
*/