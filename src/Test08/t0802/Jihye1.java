package Test08.t0802;

public class Jihye1 {
    public static void main(String[] args) {
        Jihye1 jh = new Jihye1();

        int[] food1 = {1, 3, 4, 6};
        int[] food2 = {1, 7, 1, 2};

        System.out.println(jh.solution(food1));
        System.out.println(jh.solution(food2));
    }

    public String solution(int[] food) {
        String answer = "";

        // 인덱스 1부터 시작 index[0]은 물이다.
        for(int i=1; i<food.length; i++){
            if(food[i] == 1){ // index값이 1이면 넘긴다.
                continue;
            }
            else if(food[i] % 2 == 0){
                for(int j=0; j<food[i]/2; j++){
                    // index값이 짝수일때 food[i]/2만큼 toString을 사용하여 값 넣어준다.
                    answer+=Integer.toString(i);
                }
            }else{
                for(int j=0; j<(food[i]-1)/2; j++){
                    // index값이 홀수일때 food[i]/2만큼 toString을 사용하여 값 넣어준다.
                    answer+=Integer.toString(i);
                }
            }
        }

        String reverse = "";
        // 반대되는 값을 for문으로 역순으로 넣어준다.
        for(int i=answer.length()-1; i>=0; i--){
            if(i==answer.length()-1) reverse += "0";
            reverse += answer.charAt(i);
        }

        return answer + reverse;
    }

//    테스트 1 〉	통과 (19.01ms, 81.5MB)
//    테스트 2 〉	통과 (20.60ms, 82.1MB)
//    테스트 3 〉	통과 (13.34ms, 85.4MB)
//    테스트 4 〉	통과 (20.75ms, 89.4MB)
//    테스트 5 〉	통과 (16.11ms, 75.3MB)
//    테스트 6 〉	통과 (16.87ms, 85.3MB)
//    테스트 7 〉	통과 (20.33ms, 82.9MB)
//    테스트 8 〉	통과 (19.05ms, 72.9MB)
//    테스트 9 〉	통과 (11.93ms, 79.8MB)
//    테스트 10 〉	통과 (12.15ms, 80.1MB)
//    테스트 11 〉	통과 (9.09ms, 75.9MB)
//    테스트 12 〉	통과 (11.27ms, 75.1MB)
//    테스트 13 〉	통과 (10.21ms, 75.1MB)
//    테스트 14 〉	통과 (25.70ms, 91.8MB)
//    테스트 15 〉	통과 (10.57ms, 66.6MB)
//    테스트 16 〉	통과 (12.36ms, 77.5MB)
//    테스트 17 〉	통과 (10.07ms, 82.5MB)
//    테스트 18 〉	통과 (11.28ms, 74.2MB)
//    테스트 19 〉	통과 (11.95ms, 77.5MB)
//    테스트 20 〉	통과 (12.29ms, 74MB)
}
