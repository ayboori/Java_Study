package Test09.t0913;

import java.util.Arrays;
import java.util.HashMap;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        int N = 7;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(hojoong.solution(N, stages)));
    }

    public int[] solution(int N, int[] stages) {
        // 각 스테이지 마다 실패율이 있음 -> 해쉬맵(스테이지,실패율)
        HashMap<Integer, Double> hashMap = new HashMap<>();

        // 실패율 순서 정렬을 위한 double 배열 선언
        double[] doubleList = new double[N];

        for (int i = 1; i <= N; i++) {

            int a = 0; // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
            int b = 0; // 스테이지에 도달한 플레이어 수

            for (int j = 0; j < stages.length; j++) {

                // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 ++
                if (i == stages[j]) {
                    a++;
                }

                // 스테이지에 도달한 플레이어 수 ++
                if (i <= stages[j]) {
                    b++;
                }

            }

            double c; // 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
            if(a!=0){
                c = (double) a / b;
            } else {
                c = 0.0;
            }

            hashMap.put(i, c);
            doubleList[i - 1] = c;
        }

        Arrays.sort(doubleList);
        int[] answer = new int[N];

        for (int i = N-1; i >=0 ; i--) {

            for (Integer key:hashMap.keySet()) {
                if(hashMap.get(key).equals(doubleList[i])) {
                    answer[(N-1)-i] = key;
                    hashMap.remove(key);
                    break;
                }
            }

        }

        return answer;
    }
}
