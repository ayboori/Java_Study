package Test07.Test0714_P;

public class Jinhyuk {
    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(jinhyuk.solution(sizes));
    }

    public int solution(int[][] sizes) {
        int answer = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) { // 만약에 첫번째 수보다 2번째 수가 클경우
                int big = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = big;

            }
        }

        int maxGa_ro = sizes[0][0]; // 가_로
        int maxSe_ro = sizes[0][1]; // 세_로

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > maxGa_ro) { // 첫 번째 수중에서 가장 큰수를 찾고
                maxGa_ro = sizes[i][0];
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][1] > maxSe_ro) { // 두 번째 수중에서 가장 큰수를 찾는다
                maxSe_ro = sizes[i][1];
            }
        }



        answer = maxGa_ro * maxSe_ro; // 가로 곱하기 세로

        return answer;
    }

}

/*
        테스트 결과 (0.01 ~ 1.67ms)
        테스트 1 〉	통과 (0.03ms, 71MB)
        테스트 2 〉	통과 (0.03ms, 70.1MB)
        테스트 3 〉	통과 (0.01ms, 80.7MB)
        테스트 4 〉	통과 (0.03ms, 73.2MB)
        테스트 5 〉	통과 (0.02ms, 68MB)
        테스트 6 〉	통과 (0.02ms, 84.9MB)
        테스트 7 〉	통과 (0.03ms, 69.4MB)
        테스트 8 〉	통과 (0.02ms, 87MB)
        테스트 9 〉	통과 (0.02ms, 79.8MB)
        테스트 10 〉	통과 (0.03ms, 78.3MB)
        테스트 11 〉	통과 (0.05ms, 69.4MB)
        테스트 12 〉	통과 (0.09ms, 70.9MB)
        테스트 13 〉	통과 (0.18ms, 73.7MB)
        테스트 14 〉	통과 (0.21ms, 78.1MB)
        테스트 15 〉	통과 (0.51ms, 80.1MB)
        테스트 16 〉	통과 (0.73ms, 84.4MB)
        테스트 17 〉	통과 (1.27ms, 94.6MB)
        테스트 18 〉	통과 (1.69ms, 89.2MB)
        테스트 19 〉	통과 (0.95ms, 83.8MB)
        테스트 20 〉	통과 (1.26ms, 81.1MB)
        채점 결과
        정확성: 100.0
        합계: 100.0 / 100.0
        */
