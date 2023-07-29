package Test07.Test0710_P;

public class Jinhyuk {

    public String solution(String[] survey, int[] choices) {

        //엠비티아이별 총점 생성
        int r = 0;
        int t = 0;
        int f = 0;
        int c = 0;
        int m = 0;
        int j = 0;
        int a = 0;
        int n = 0;

        // 평가항목마다 점수로 변환
        for (int i = 0; i < choices.length; i++) {
            int point = 0;
            switch (choices[i]) {
                case 1:
                    point = 3;
                    break;
                case 2:
                    point = 2;
                    break;
                case 3:
                    point = 1;
                    break;
                case 4:
                    point = 0;
                    break;
                case 5:
                    point = -1;
                    break;
                case 6:
                    point = -2;
                    break;
                case 7:
                    point = -3;
                    break;
            }

            // 각 지표마다 점수로 넣어준다
            switch (survey[i]) {
                case "RT":
                    r+=point;
                    break;
                case "TR":
                    t+=point;
                    break;
                case "FC":
                    f+=point;
                    break;
                case "CF":
                    c+=point;
                    break;
                case "MJ":
                    m+=point;
                    break;
                case "JM":
                    j+=point;
                    break;
                case "AN":
                    a+=point;
                    break;
                case "NA":
                    n+=point;
                    break;
            }
        }

        //누가 더 큰지 같으면 첫번째 껄로 선택하기
        char RT = (r >= t) ? 'R' : 'T';
        char CF = (c >= f) ? 'C' : 'F';
        char JM = (j >= m) ? 'J' : 'M';
        char AN = (a >= n) ? 'A' : 'N';

        // +를 쓰면 느리니까 StringBuilder로 넣어본다
        StringBuilder sb = new StringBuilder();

        //선택한 값 넣어주기
        sb.append(RT);
        sb.append(CF);
        sb.append(JM);
        sb.append(AN);

        //문자열로
        String answer = sb.toString();
        //정답제출
        return answer;
    }
}
/*
            테스트 1 〉	통과 (0.03ms, 73.7MB)
            테스트 2 〉	통과 (0.04ms, 72.3MB)
            테스트 3 〉	통과 (0.03ms, 75.4MB)
            테스트 4 〉	통과 (0.04ms, 74.8MB)
            테스트 5 〉	통과 (0.03ms, 73.3MB)
            테스트 6 〉	통과 (0.04ms, 78.4MB)
            테스트 7 〉	통과 (0.03ms, 89.1MB)
            테스트 8 〉	통과 (0.04ms, 75.7MB)
            테스트 9 〉	통과 (0.04ms, 74.4MB)
            테스트 10 〉	통과 (0.05ms, 75MB)
            테스트 11 〉	통과 (0.05ms, 77.5MB)
            테스트 12 〉	통과 (0.07ms, 84.8MB)
            테스트 13 〉	통과 (0.08ms, 77.2MB)
            테스트 14 〉	통과 (0.12ms, 77.5MB)
            테스트 15 〉	통과 (0.13ms, 73.9MB)
            테스트 16 〉	통과 (0.16ms, 81.1MB)
            테스트 17 〉	통과 (0.23ms, 75.3MB)
            테스트 18 〉	통과 (0.18ms, 76.3MB)
            테스트 19 〉	통과 (0.16ms, 76.5MB)
            테스트 20 〉	통과 (0.16ms, 79MB)
            채점 결과
            정확성: 100.0
            합계: 100.0 / 100.0
*/
