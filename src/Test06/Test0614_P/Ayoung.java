// lv.1 가운데 글자 가져오기
package Test06.Test0614_P;

public class Ayoung {
        public String solution(String s) {
            if (s.length() % 2 ==0){ // 짝수일 경우
                return Character.toString(s.charAt(s.length()/2-1)) + Character.toString(s.charAt(s.length()/2));
                // 두 문자를 추출, toString에 +를 사용하여 병합함 (어차피 리턴 타입이 String임)
            }else{
                return Character.toString(s.charAt(s.length()/2));
                // 길이의 반에 해당하는 문자 1개 리턴
                // 이때 charAt은 char 값이므로 스트링으로 변환
            }
        }
    public static void main(String[] args) {
       Ayoung sol = new Ayoung();
        // 테스트 케이스들
        System.out.println(sol.solution("tree"));
        System.out.println(sol.solution("match"));
        System.out.println(sol.solution("hi"));

    }
}

//        테스트 1 〉	통과 (0.03ms, 78.8MB)
//        테스트 2 〉	통과 (1.69ms, 75.2MB)
//        테스트 3 〉	통과 (0.03ms, 76MB)
//        테스트 4 〉	통과 (0.03ms, 76.6MB)
//        테스트 5 〉	통과 (0.03ms, 74.4MB)
//        테스트 6 〉	통과 (1.75ms, 72.8MB)
//        테스트 7 〉	통과 (0.02ms, 71MB)
//        테스트 8 〉	통과 (1.27ms, 75.3MB)
//        테스트 9 〉	통과 (0.05ms, 81.9MB)
//        테스트 10 〉	통과 (0.04ms, 74.5MB)
//        테스트 11 〉	통과 (0.04ms, 75.2MB)
//        테스트 12 〉	통과 (0.05ms, 76.4MB)
//        테스트 13 〉	통과 (1.76ms, 77.8MB)
//        테스트 14 〉	통과 (1.16ms, 71.8MB)
//        테스트 15 〉	통과 (1.82ms, 77.2MB)
//        테스트 16 〉	통과 (1.44ms, 77.3MB)