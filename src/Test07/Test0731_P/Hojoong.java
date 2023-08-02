package Test07.Test0731_P;// 두 개 뽑아서 더하기

import java.util.*;

public class Hojoong {
    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        int[] numbers = {2,1,3,4,1};


        System.out.println(Arrays.toString(hojoong.solution(numbers)));
        System.out.println(Arrays.toString(hojoong.solution2(numbers)));
        System.out.println(Arrays.toString(hojoong.solution3(numbers)));
    }

    public int[] solution(int[] numbers) {
        // 1.정수 배열 numbers
        // 2.서로 다른 인덱스에서 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수의 배열
        // 1+1,1+2,1+3,1+4,1+5 // 2+2,2+3,2+4,2+5 // 3+3,3+4,3+5
        //-> 같은 인덱스의 합이 더해지는 중복제거 또는 같은 값의 중복 제거 및 3. 오름차순 return -> TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 1+i; j < numbers.length; j++) {
                int a = numbers[i]+numbers[j];
                treeSet.add(a);
            }
        }
        //set->int[] 변환
        Object[] InterArray = treeSet.toArray();
        int[] answer = new int[InterArray.length];
        for (int i = 0; i < answer.length ; i++) {
            answer[i] = (int) InterArray[i];
        }
        return answer;
//        테스트 1 〉	통과 (0.78ms, 74.8MB)
//        테스트 2 〉	통과 (0.64ms, 75.7MB)
//        테스트 3 〉	통과 (0.50ms, 76.9MB)
//        테스트 4 〉	통과 (0.55ms, 78.1MB)
//        테스트 5 〉	통과 (0.63ms, 77.7MB)
//        테스트 6 〉	통과 (1.21ms, 82.3MB)
//        테스트 7 〉	통과 (3.38ms, 68.6MB)
//        테스트 8 〉	통과 (2.64ms, 80.6MB)
//        테스트 9 〉	통과 (1.63ms, 75.3MB)
    }

    public int[] solution2(int[] numbers) {
        // 1.정수 배열 numbers
        // 2.서로 다른 인덱스에서 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수의 배열
        // 1+1,1+2,1+3,1+4,1+5 // 2+2,2+3,2+4,2+5 // 3+3,3+4,3+5
        //-> 같은 인덱스의 합이 더해지는 중복제거 또는 같은 값의 중복 제거  -> hashSet
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 1+i; j < numbers.length; j++) {
                int a = numbers[i]+numbers[j];
                hashSet.add(a);
            }
        }
        //set->int[] 변환
        Object[] InterArray = hashSet.toArray();
        int[] answer = new int[InterArray.length];
        for (int i = 0; i < answer.length ; i++) {
            answer[i] = (int) InterArray[i];
        }
        // 3. 오름차순 정렬
        Arrays.sort(answer);
        return answer;
//        테스트 1 〉	통과 (1.24ms, 72.1MB)
//        테스트 2 〉	통과 (0.57ms, 76.3MB)
//        테스트 3 〉	통과 (1.06ms, 81.4MB)
//        테스트 4 〉	통과 (1.10ms, 72.9MB)
//        테스트 5 〉	통과 (1.17ms, 85.3MB)
//        테스트 6 〉	통과 (0.75ms, 75.8MB)
//        테스트 7 〉	통과 (1.19ms, 73.5MB)
//        테스트 8 〉	통과 (1.77ms, 75.1MB)
//        테스트 9 〉	통과 (0.82ms, 70.6MB)
    }

    public int[] solution3(int[] numbers) {
        // 1.정수 배열 numbers
        ArrayList<Integer> answer = new ArrayList<>();
        // 2. 서로 다른 인덱스의 두 개의 수를 뽑아
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers.length ; j++) {
                // 3. 같은 인덱스 배열의 숫자를 더하지 않는 조건
                if(i != j){
                    int sum = numbers[i]+numbers[j];
                    // 4. 저장되어있는 숫자가 중복 저장 되지않게 하는 조건
                    if(!answer.contains(sum)){
                        answer.add(sum);
                    }
                }
            }
        }
        // int[] 배열 변환
        int[] answer2 = new int[answer.size()];
        for (int i = 0; i < answer.size() ; i++) {
            answer2[i] = answer.get(i);
        }
        // 5. 오름차순 정렬
        Arrays.sort(answer2);
        return answer2;
//        테스트 1 〉	통과 (0.41ms, 78.4MB)
//        테스트 2 〉	통과 (0.36ms, 78.3MB)
//        테스트 3 〉	통과 (0.55ms, 72.4MB)
//        테스트 4 〉	통과 (0.38ms, 69.7MB)
//        테스트 5 〉	통과 (0.67ms, 77.7MB)
//        테스트 6 〉	통과 (1.16ms, 74.1MB)
//        테스트 7 〉	통과 (7.51ms, 75.2MB)
//        테스트 8 〉	통과 (2.68ms, 86MB)
//        테스트 9 〉	통과 (1.52ms, 77.3MB)
    }
}
