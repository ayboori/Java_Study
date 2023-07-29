// 문자열 내 마음대로 정렬하기
package Test07.Test0728_P;

import java.util.ArrayList;
import java.util.Arrays;

public class Hojoong {

  public static void main(String[] args) {
    Hojoong hojoong = new Hojoong();

    String[] strings = {"sun", "bed", "car"};
    String[] strings2 = {"abce", "abcd", "cdx"};

    int n = 1;
    int n2 = 2;

    System.out.println(Arrays.toString(hojoong.solution(strings,n)));
    System.out.println(Arrays.toString(hojoong.solution(strings2,n2)));
  }

  public String[] solution(String[] strings, int n) {
    //1. string 안에 단어들이 들어가있고
    //2. 단어의 n번째 인덱스의 char를 뽑아와서
    char[] word = new char[strings.length];
    for (int i = 0; i < strings.length; i++) {
      word[i] = strings[i].charAt(n);
    }
    //3. 단어 정렬 한다음에
    Arrays.sort(word);

    //해결 2 word 배열에 순서가 저장되어있기 때문에, 기존 strings에 sort를 주어 사전순으로 정리하고 word의 순서에 따라 arraylist에 저장
    Arrays.sort(strings);

    //4. 정렬한 순서대로 string의 단어를 재배열 String[] -> ArrayList 변경
    ArrayList<String> arrayStrings = new ArrayList<>();
    for (int i = 0; i <word.length ; i++) {
      for (int j = 0; j < strings.length; j++) {
        if (word[i]==strings[j].charAt(n)){
          //함정 !!인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.!!
          //문제 1 중복 문제
          //문제 2 사전순으로 문자열이 앞쪽에 위치
          //문제 1 해결 String.contains 는 null일때 null exception 발생 (메서드네에 선언되는 변수에 @notnull 어노테이션 달려있음.)
          //          Arraylist.contains 오브젝트타입 null 가능
          if(!arrayStrings.contains(strings[j])){
            arrayStrings.add(strings[j]);
          }
        }
      }
    }

    String[] answer = arrayStrings.toArray(new String[0]);
    return answer;
  }
}
