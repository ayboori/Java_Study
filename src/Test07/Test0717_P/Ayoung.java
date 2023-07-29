package Test07.Test0717_P;

import java.util.Arrays;

public class Ayoung {
    public static void main(String[] args) {
            Ayoung ay = new Ayoung();

            System.out.println(Arrays.toString(ay.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
            // return ["#####", "# # #", "### #", "#  ##", "#####"]
            System.out.println(Arrays.toString(ay.solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));

            // return ["######", "###  #", "##  ##", " #### ", " #####", "### # "]
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n]; // 정답을 리턴할 String 배열
        StringBuilder sb = new StringBuilder(); // String 배열 하나를 만들 StringBuilder
        int k = 0; // answer String 배열

        for(int i = 0; i<n ; i++){
            String binary = Integer.toBinaryString(arr1[i] |  arr2[i]);
            // arr1 OR arr2 연산 결과를 String으로 만들어 담기
            sb.setLength(0); // StringBuilder 비우기

            for (int j = 0; j<binary.length() ; j++){ // 만들어진 binary 배열 길이만큼

                if(binary.charAt(j) == '1' ){ // OR 연산 결과가 1이면 # 붙이기
                    sb.append("#");
                }else{ // OR 연산 결과가 0이면 공백 붙이기
                    sb.append(" ");
                }

                // 이진수 배열의 크기가 정사각형의 크기보다 작으면 그만큼 공백 삽입
                for(int l = sb.length()-1 ; l<n-binary.length() ; l++){
                    sb.insert(0, " ");
                }
            }
            answer[k++] = sb.toString(); // 만들어진 string 배열에 넣기
        }

        return answer;
    }
}

/* 테스트 1 〉	통과 (0.10ms, 74.2MB)
테스트 2 〉	통과 (0.22ms, 67.3MB)
테스트 3 〉	통과 (0.07ms, 78MB)
테스트 4 〉	통과 (0.11ms, 67.7MB)
테스트 5 〉	통과 (0.10ms, 75.6MB)
테스트 6 〉	통과 (0.16ms, 86.8MB)
테스트 7 〉	통과 (0.06ms, 71.6MB)
테스트 8 〉	통과 (0.05ms, 74.1MB)
 */