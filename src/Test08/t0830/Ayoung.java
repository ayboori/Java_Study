package Test08.t0830;
import java.util.ArrayList;

// lv.1 모의고사
public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(Arrays.toString(ay.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(ay.solution(new int[]{1, 3, 2, 4, 2})));
    }

    public int[] solution(int[] answers) {
        // 수포자들의 답
        int[] firstPerson = {1, 2, 3, 4, 5};
        int[] secondPerson = { 2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdPerson = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int firstIndex = 0, secondIndex = 0, thirdIndex = 0;
        int [] score = {0,0,0}; // 처음엔 다 0점

        // 정답 맞으면 +1
        for(int ans : answers){
            if(ans == firstPerson[firstIndex++]){
                score[0] ++;
            }

            if(ans == secondPerson[secondIndex++]){
                score[1] ++;
            }

            if(ans == thirdPerson[thirdIndex++]){
                score[2] ++;
            }

            // 배열의 크기를 index가 넘지 않도록 세팅
            if(firstIndex == firstPerson.length){ firstIndex = 0;}
            if(secondIndex == secondPerson.length){ secondIndex = 0;}
            if(thirdIndex == thirdPerson.length){ thirdIndex = 0;}
        }


        // 최댓값 세팅
        int max = Math.max(score[0], Math.max(score[1], score[2]));


        // 최댓값에 해당하는 점수를 가진 애들을 return
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < 3 ; i++){
            if(score[i] == max){
                ans.add(i+1); // index가 0부터 시작하니까 +1 해야 함!
            }
        }

        // List > 배열
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;

    }
}
