package Test07.Test0705_P;


import java.util.Arrays;

public class Jinhyuk {
    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        String s1 = "try hello world";

        System.out.println(jinhyuk.solution(s1));
    }

    /*1.전체를 소문자로 만들고 쪼개준다. split(" ", -1)
     2.각각의 문자마다 배열을 돌려 char로 바꾸어 저장해주고 toCharArray()
     3.다시 배열을 돌려서 홀수번째의 자릿수일시 대문자로 바꾸어준다. toUpperCase()
     4.다 바꾸었다면 배열에 저장해주고  new String(chars)
     5.배열을 문자열로 합쳐서 반환  String.join()
     */

    public String solution(String s) {
        String[] words = s.toLowerCase().split(" ", -1); //전체를 소문자로 바꾸고 나눠서 words에 담는다
        //split의 두번째 인자로 -1을 사용시 나누는 문자열 갯수 제한이 없고 연속적으로 구분자가 있는 경우 포함

        for (int i = 0; i < words.length; i++) { //words의 길이만큼 배열을 돌린다
            char[] chars = words[i].toCharArray(); //chars라는 char형태의 배열에 소문자로 담는다
            for (int j = 0; j < chars.length; j++) { //chars의 길이만큼 배열을 또 돌린다
                if (j % 2 == 0) { //단어의 위치가 0부터 시작이니까, j가 짝수일때==홀수번째의 단어
                    chars[j] = Character.toUpperCase(chars[j]); //대문자로 바꾸어준다
                }
            }
            words[i] = new String(chars); // char형식의 배열인 chars를 다시 words라는 string배열로 넣어주고
        }
        return String.join(" ", words); //join으로 띄어쓰기로 구분된 words 배열을 문자열로 만들어준다
    }
}

//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == ' ') {
//                answer += ' ';
//            }else if (i % 2 == 0) {
//                answer += String.valueOf(c).toUpperCase();
//            } else {
//                answer += String.valueOf(c).toLowerCase();
//            }
//        }

//        for (char c : s.toCharArray()) { //한글자씩 저장하고
//            if (c % 2 == 0) {
//                answer += String.valueOf(c).toUpperCase();
//            } else {
//                answer += String.valueOf(c).toLowerCase();
//            }
//        }