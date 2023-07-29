package Test07.Test0717_P;

public class Jinhyuk {
    public static void main(String[] args) {

    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n]; // n 크기의 배열

        for (int i = 0; i < n; i++) {
            String jinsuLEE_str = Integer.toBinaryString(arr1[i]); // 1번째 지도 2진수 문자열로 전환
            jinsuLEE_str = String.format("%" + n + "s", jinsuLEE_str) // n 자리 문자열로 전환
                    .replace(' ', '0'); //공백을 0으로 반환

            String jinsuLEE2_str = Integer.toBinaryString(arr2[i]); // 위와 같음
            jinsuLEE2_str = String.format("%" + n + "s", jinsuLEE2_str)
                    .replace(' ', '0');

            StringBuilder Treasure_Map = new StringBuilder(); // StringBuilder로 Treasure_Map를 만들어주고

            for (int j = 0; j < n; j++) {
                if (jinsuLEE_str.charAt(j) == '1' || jinsuLEE2_str.charAt(j) == '1'){ //만약에 1이라는 문자가 있으면
                    Treasure_Map.append('#'); // 벽을 만들어주고
                }else { //1이 한개도 없으면
                    Treasure_Map.append(' '); //길을 만들어 준다
                }
            }
            answer[i] = Treasure_Map.toString(); //결과 문자열을 저장
        }
        return answer;
    }
}

/*〉
통과 시간 (7.80 ~ 10.64ms)!
테스트 1 >   통과 (8.88ms, 71MB)
테스트 2 〉	통과 (8.74ms, 77.2MB)
테스트 3 〉	통과 (9.16ms, 74.2MB)
테스트 4 〉	통과 (10.38ms, 79.2MB)
테스트 5 〉	통과 (10.04ms, 88.6MB)
테스트 6 〉	통과 (7.80ms, 79.4MB)
테스트 7 〉	통과 (9.23ms, 72.1MB)
테스트 8 〉	통과 (10.64ms, 89.7MB)
*/
