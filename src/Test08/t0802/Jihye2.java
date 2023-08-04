package Test08.t0802;

public class Jihye2 {
    public static void main(String[] args) {
        Jihye2 jh = new Jihye2();

        int[] food1 = {1, 3, 4, 6};
        int[] food2 = {1, 7, 1, 2};

        System.out.println(jh.solution(food1));
        System.out.println(jh.solution(food2));
    }
    public String solution(int[] food) {
        // StringBuilder를 사용한다.
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                // 이중for문을 이용하여 값 추가
                sb.append(i);
            }
        }

//      sb에 toString()을 붙이지 않으면 reverse()값이 출력된다.
        return sb.toString() + "0" + sb.reverse();
    }

//    테스트 1 〉	통과 (8.38ms, 67.4MB)
//    테스트 2 〉	통과 (8.31ms, 78.2MB)
//    테스트 3 〉	통과 (10.99ms, 77.9MB)
//    테스트 4 〉	통과 (12.74ms, 80.7MB)
//    테스트 5 〉	통과 (13.00ms, 88.5MB)
//    테스트 6 〉	통과 (11.24ms, 86MB)
//    테스트 7 〉	통과 (10.97ms, 77.4MB)
//    테스트 8 〉	통과 (12.44ms, 88MB)
//    테스트 9 〉	통과 (9.68ms, 77.3MB)
//    테스트 10 〉	통과 (10.30ms, 72.1MB)
//    테스트 11 〉	통과 (10.39ms, 67.1MB)
//    테스트 12 〉	통과 (9.99ms, 74.1MB)
//    테스트 13 〉	통과 (18.47ms, 73.6MB)
//    테스트 14 〉	통과 (31.80ms, 71.7MB)
//    테스트 15 〉	통과 (13.68ms, 71.1MB)
//    테스트 16 〉	통과 (12.53ms, 88.3MB)
//    테스트 17 〉	통과 (11.00ms, 79.7MB)
//    테스트 18 〉	통과 (9.42ms, 76.1MB)
//    테스트 19 〉	통과 (10.37ms, 79MB)
//    테스트 20 〉	통과 (8.26ms, 80.4MB)
}
