// lv.1 같은 숫자는 싫어
package Test06.Test0630_P;

import java.util.Arrays;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        //예시 배열
        int[] arr1 = { 1, 1, 3, 3, 0, 1, 1 };
        int[] arr2 = { 4,4,4,3,3 };

        //예시 출력
        System.out.println(jinhyuk.solution(arr1));
        System.out.println(jinhyuk.solution(arr2));
    }

    public int[] solution(int[] arr) {

        int equal = 0; // equal를 선언 초기화

        for (int i = 0; i < arr.length - 1; i++) { //반복문으로 arr배열의 길이만큼 반복한다.
            if (arr[i] == arr[i + 1]) { //arr배열 속 같이 다음 숫자와 같은지 비교하고 같다면
                equal++; // equal을 한개 증가시킨다
            }
        }
        // 같은 수는 제거할 계획이므로 결과에 해당하는 배열은 equal만치 그 크기가 작다.
        int[] result = new int[arr.length - equal];

        int index = 0; //index 하나 쓸거라서 생성 초기화하고

        for (int i = 0; i < arr.length - 1; i++) { //for반복문을 arr배열의 크기만큼 돌리면서
            if (arr[i] != arr[i + 1]) { // arr의 숫자가 연속하지 않을때
                result[index++] = arr[i]; // 결과의 배열에 arr[i]를 추가하고 index를 하나 늘려준다
            }
        }
        result[index] = arr[arr.length - 1]; //틀린 부분!
        // 입력 배열의 마지막 숫자를 결과 배열에 추가하는 부분!
        return result; //결과 배열을 반환
    }
}

/*
테스트 1 〉	통과 (0.02ms, 81MB)
테스트 2 〉	통과 (0.02ms, 72.2MB)
테스트 3 〉	통과 (0.04ms, 71.1MB)
테스트 4 〉	통과 (0.03ms, 74.3MB)
테스트 5 〉	통과 (0.02ms, 72.9MB)
테스트 6 〉	통과 (0.03ms, 78.5MB)
테스트 7 〉	통과 (0.02ms, 80.3MB)
테스트 8 〉	통과 (0.04ms, 81.1MB)
테스트 9 〉	통과 (0.02ms, 74.2MB)
테스트 10 〉	통과 (0.02ms, 71.1MB)
테스트 11 〉	통과 (0.02ms, 75.2MB)
테스트 12 〉	통과 (0.01ms, 75.1MB)
테스트 13 〉	통과 (0.02ms, 78.6MB)
테스트 14 〉	통과 (0.03ms, 77.6MB)
테스트 15 〉	통과 (0.02ms, 74.6MB)
테스트 16 〉	통과 (0.02ms, 72.1MB)
테스트 17 〉	통과 (0.02ms, 72.8MB)
효율성  테스트
테스트 1 〉	통과 (16.00ms, 106MB)
테스트 2 〉	통과 (16.09ms, 106MB)
테스트 3 〉	통과 (15.28ms, 106MB)
테스트 4 〉	통과 (15.54ms, 108MB)
채점 결과
정확성: 71.9
효율성: 28.1
합계: 100.0 / 100.0
*/