package Test08.t0802;

import java.util.LinkedList;

public class Hojoong {

  public static void main(String[] args) {
    Hojoong hojoong = new Hojoong();

    int[] food = {1, 3, 4, 6};
    int[] food2 = {1, 7, 1, 2};

    System.out.println(hojoong.solution(food));
    System.out.println(hojoong.solution(food2));
  }


  public String solution(int[] food) {
    // 수웅이가 바보같이 주문을 그지같이함
    // food[0]은 물이구요. 뭐여
    // food[i]  = 인덱스이름의 음식이 몇 개인지
    // ->풀이 로직 나머지0일 때 수량만큼 양옆으로 음식인덱스번호 넣어줌, 나머지1일 때 -1한 뒤 동일


    //TreeSet 공부 -> Linked 관련된 내용 보면서 addFirst, addLast 기억이 나서 사용
    //양 옆으로 음식 인덱스 번호 넣어주기 위함
    LinkedList<String> list = new LinkedList<>();

    //작은수가 제일 앞으로 가기 때문에 거꾸리 for 문
    for (int i = food.length - 1; i > 0; i--) {
      int count = food[i];

      //count 짝수 일경우 양쪽에 각각 하나씩 넣어주기
      if (count % 2 == 0) {
        //지수님 문자열 정렬시 사용햇던 로직 생각이남 while문 count가 0이 될때까지 음식 줄세우기
        while (count != 0) {
          list.addFirst(String.valueOf(i));
          count--;
          list.addLast(String.valueOf(i));
          count--;
        }
      }

      //count 홀수 일경우 count-1 해준 후 각각 넣어주기, 만약 1일경우 0이므로 while 진행 x
      if (count % 2 != 0) {
        int recount = count - 1;
        while (recount != 0) {
          list.addFirst(String.valueOf(i));
          recount--;
          list.addLast(String.valueOf(i));
          recount--;
        }
      }

    }
    //중간에 물 넣어주기
    int water = list.size() / 2;
    list.add(water, "0");

    //String 변환
    String answer = "";
    for (int i = 0; i < list.size(); i++) {
      answer += list.get(i);
    }
    return answer;
  }

//  테스트 1 〉	통과 (13.58ms, 82.6MB)
//  테스트 2 〉	통과 (12.39ms, 81.7MB)
//  테스트 3 〉	통과 (9.46ms, 76.6MB)
//  테스트 4 〉	통과 (26.33ms, 88.2MB)
//  테스트 5 〉	통과 (2.94ms, 77.6MB)
//  테스트 6 〉	통과 (19.29ms, 103MB)
//  테스트 7 〉	통과 (33.68ms, 87MB)
//  테스트 8 〉	통과 (12.36ms, 79.2MB)
//  테스트 9 〉	통과 (6.54ms, 76.3MB)
//  테스트 10 〉	통과 (8.50ms, 72.6MB)
//  테스트 11 〉	통과 (1.32ms, 77.3MB)
//  테스트 12 〉	통과 (2.08ms, 77.4MB)
//  테스트 13 〉	통과 (1.35ms, 73.8MB)
//  테스트 14 〉	통과 (67.90ms, 104MB)
//  테스트 15 〉	통과 (1.34ms, 71.4MB)
//  테스트 16 〉	통과 (1.51ms, 78.5MB)
//  테스트 17 〉	통과 (1.27ms, 73.8MB)
//  테스트 18 〉	통과 (1.23ms, 73MB)
//  테스트 19 〉	통과 (1.31ms, 78.5MB)
//  테스트 20 〉	통과 (1.28ms, 74.1MB)
}
