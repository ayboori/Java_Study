package Test08.t0828;

import java.util.*;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(jinhyuk.solution(cards1, cards2, goal)); // 기대값 yse
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
/*
    [제한사항]
    원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
    한 번 사용한 카드는 다시 사용할 수 없습니다.
    카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
    기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
    goal의 원소는 cards1과 cards2의 원소들로만 이루어져 있습니다.
    cards1, cards2, goal의 문자열들은 모두 알파벳 소문자로만 이루어져 있습니다.
    goal의 길이 ≤ cards1의 길이 + cards2의 길이
    cards1과 cards2에는 서로 다른 단어만 존재합니다.
*/
        List<String> test = new ArrayList<>();
        List<String> cards1List = new ArrayList<>(Arrays.asList(cards1)); //Arrays.asList()를 사용하여 배열을 리스트로 변환
        List<String> cards2List = new ArrayList<>(Arrays.asList(cards2));

        for (int i = 0; i < goal.length; i++) {
            String goalTest = goal[i]; // 정답을 goalTest에 넣는다

            if (cards1List.size() > 0 && cards1List.get(0).equals(goalTest)) { //1번 뭉치에 0번째 값이 정답이면
                test.add(goalTest); //테스트에 넣고
                cards1List.remove(0); //넣은 부분 제거
                continue; //계속~
            }
            if (cards2List.size() > 0 && cards2List.get(0).equals(goalTest)) { //2번 뭉치에서 0번째 값이 정답이면
                test.add(goalTest); //마찬가지로 넣고
                cards2List.remove(0); //넣은거 제거
            }
        }
        return test.equals(Arrays.asList(goal)) ? "Yes" : "No"; //둘중에 하나만 대답해~ yes or no
    }
}

/*
{{ Trouble Shooting }}
1. List<String> cards1List = new ArrayList<>();
   위와같이 선언하면 따로 리스트에 넣어줘야 하는데
   new ArrayList<>(Arrays.asList(cards1)); 을 사용했다.
   Arrays.asList를 검색하여 cards1을 넣어주어서,
   배열을 리스트 형식으로 변환해서 cards1List에 넣어줄 수 있었다.

2. 2번째 카드 뭉치 밑에도 continue; 를 넣었었는데,
   속도에 차이없고 안쓰이는 것 같아서 제거

3. cards1List.size() > 0을 지정해주지않아 런타임 에러가 발생
   반복할 때마다 cards1List.size() > 0을 지정해주어서 확인하게 수정함.

런타임 테스트 0.09ms~0.18ms (그치만 빠르쥬~?)
테스트 1 〉	통과 (0.10ms, 73MB)
테스트 2 〉	통과 (0.14ms, 74.9MB)
테스트 3 〉	통과 (0.14ms, 72.8MB)
테스트 4 〉	통과 (0.09ms, 72.7MB)
테스트 5 〉	통과 (0.09ms, 79.5MB)
테스트 6 〉	통과 (0.17ms, 76.3MB)
테스트 7 〉	통과 (0.12ms, 78.8MB)
테스트 8 〉	통과 (0.10ms, 73.3MB)
테스트 9 〉	통과 (0.09ms, 74.8MB)
테스트 10 〉	통과 (0.10ms, 70.2MB)
테스트 11 〉	통과 (0.10ms, 72.2MB)
테스트 12 〉	통과 (0.12ms, 72.7MB)
테스트 13 〉	통과 (0.16ms, 79.4MB)
테스트 14 〉	통과 (0.11ms, 66.7MB)
테스트 15 〉	통과 (0.11ms, 78.9MB)
테스트 16 〉	통과 (0.13ms, 75.3MB)
테스트 17 〉	통과 (0.17ms, 76.9MB)
테스트 18 〉	통과 (0.18ms, 79.2MB)
테스트 19 〉	통과 (0.16ms, 77.2MB)
테스트 20 〉	통과 (0.12ms, 75.4MB)
테스트 21 〉	통과 (0.12ms, 73.6MB)
테스트 22 〉	통과 (0.12ms, 77.1MB)
테스트 23 〉	통과 (0.10ms, 74.9MB)
테스트 24 〉	통과 (0.14ms, 76.1MB)
테스트 25 〉	통과 (0.10ms, 71.8MB)
 */