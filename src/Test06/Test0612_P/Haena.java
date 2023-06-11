// 최댓값과 최솟값

package Test06.Test0612_P;

public class Haena { // 35분 소요
    // 예시를 이용하여 solution 메서드를 잘 구현했는지 확인하는 main 메서드
    public static void main( String[] args ) {
        Haena hn = new Haena();

        // 프로그래머스 문제에서 나오는 예제들
        String t1 = "1 2 3 4";
        String t2 = "-1 -2 -3 -4";
        String t3 = "-1 -1";

        System.out.println( hn.solution( t1 ) );
        System.out.println( hn.solution( t2 ) );
        System.out.println( hn.solution( t3 ) );

    }

    // solution 메서드
    public String solution( String s ) {
        // 문제 푸는 부분

        // 문자를 공백을 기준으로 나눠서 String 배열에 담기
        String[] strings = s.split(" "); // split 메소드: 문자열을 일정한 기준으로 나눠 배열로 담을 수 있게 함

        // String 배열을 int 배열로 변환하기
        int[] numbers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        // 최댓값 구하기
        int maxNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }

        // 최솟값 구하기
        int minNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
            }
        }

        // int를 String으로 다시 변환하기
        String maxStr = Integer.toString(maxNum);
        String minStr = Integer.toString(minNum);

        String answer = minStr + " " + maxStr;

        return answer;
    }
}