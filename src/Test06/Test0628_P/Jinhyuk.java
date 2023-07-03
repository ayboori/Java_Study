// lv.1 시저 암호
package Test06.Test0628_P;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();
        String s1 = "AB";
        int n1 = 1;

        String s2 = "z";
        int n2 = 1;

        System.out.println(jinhyuk.solution(s1, n1));
        System.out.println(jinhyuk.solution(s2, n2));
    }

    public String solution(String s, int n) {
        String answer = ""; //정답 선언 초기화

        int[] ascii = new int[s.length()]; //ascii코드를 넣을 배열 선언초기화

        char[] array = s.toCharArray(); //s를 받아서 char로 만들 배열 선언초기화

        n=n%26; //n이 큰 경우 알파벳이 26개 이므로 그 나머지를 사용할 예정이다

        for (int i = 0; i < array.length; i++) { //array배열의 길이만큼 반복되는 반복문을 사용합니다
            ascii[i] = (int) array[i]; // array베열에서 i번째 요소를 int형으로 해당 요소의 아스키 코드값을 구해주고
        }                              // 그 값을 ascii 배열에 i번째 요소로 저장합니다.

        for (int i = 0; i < ascii.length; i++) { //ascii배열의 길이만큼 반복되는 반복문 사용
            if (65 <= ascii[i] && ascii[i] <= 90) { //아스키코드가 알파벳 대문자(65~90)에 해당하면
                ascii[i] += n;// 이동시킬 n만큼 더해주고
                if (ascii[i] > 90) { //90을 넘어가 버릴경우
                    ascii[i] = ascii[i] - 90 + 64; // 다시 65부터 되돌아올수 있게한다
                }
            } else if (97 <= ascii[i] && ascii[i] <= 122) { //아스키코드가 알파벳 소문자(97~122)에 해당하면
                ascii[i] += n; // 이동시킬 만큼 n을 더해준다
                if (ascii[i] > 122) { //122 넘어갈 경우에
                    ascii[i] = ascii[i] - 122 + 96; //다시 97부터 리턴해줄수 있도록한다
                }
            }
        }

        for (int i = 0; i < ascii.length; i++) { //ascii 배열만큼 반복
            answer += (char) ascii[i]; //int에서 다시 char로 바꾸어 answer에 저장해준다.
        }

        return answer; //결과 출력
    }

}

/*테스트 1 〉	통과 (13.03ms, 79MB)
테스트 2 〉	통과 (9.04ms, 79.1MB)
테스트 3 〉	통과 (12.29ms, 83.7MB)
테스트 4 〉	통과 (8.81ms, 77.6MB)
테스트 5 〉	통과 (10.69ms, 79.9MB)
테스트 6 〉	통과 (8.80ms, 77.3MB)
테스트 7 〉	통과 (11.76ms, 79MB)
테스트 8 〉	통과 (13.51ms, 84.4MB)
테스트 9 〉	통과 (14.96ms, 80.3MB)
테스트 10 〉	통과 (10.34ms, 86MB)
테스트 11 〉	통과 (15.04ms, 75.1MB)
테스트 12 〉	통과 (11.24ms, 79.7MB)
테스트 13 〉	통과 (29.51ms, 92.3MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0*/
