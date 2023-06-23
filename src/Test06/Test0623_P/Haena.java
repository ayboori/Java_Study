// lv.1 공원 산책
package Test06.Test0623_P;

public class Haena {
    public static void main(String[] args) {
        SolutionHn sol = new SolutionHn();
        for (int a : sol.solution(new String[]{"SOO","OOO","OOO"}, new String[]{"E 2","S 2","W 1"})) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b : sol.solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"})) {
            System.out.print(b + " ");
        }
        System.out.println();
        for (int c : sol.solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"})) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (int d : sol.solution(new String[]{"OXXO", "XSXO", "XXXX"}, new String[]{"E 1", "S 1"})) {
            System.out.print(d + " ");
        }
        System.out.println();
        for (int d : sol.solution(new String[]{"OOO", "OSO", "OOO", "OOO"}, new String[]{"N 2", "S 2"})) {
            System.out.print(d + " ");
        }
    }
}

class SolutionHn {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        // 시작 지점 S 찾기
        for (int i = 0; i < park.length;i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i; // 세로 좌표
                    answer[1] = j; // 가로 좌표
                    break;
                }
            }
        }

        // 문제 없을 시 이동방향과 거리만큼 이동하기
        for (int i = 0; i < routes.length; i++) {
            int x = answer[1]; // 가로 이동
            int y = answer[0]; // 세로 이동
            char routeDirection = routes[i].charAt(0); // 이동 방향
            int routeDistance = Integer.parseInt(String.valueOf(routes[i].charAt(2))); // 이동 거리
            boolean flag = true; // 장애물에 걸릴 경우 바꾸기 위한 깃발

            // 파크 길이보다 클 경우 다음 루트로 넘어가기 -> 장애물에 걸릴 경우 다음 루트로 넘어가기 -> 해당 없을 시 이동하기
            switch (routeDirection) {
                case 'N' :
                    if (y - routeDistance < 0) {
                        break;
                    }
                    for (int j = y; j >= y - routeDistance; j--) {
                        if (park[j].charAt(x) == 'X') {
                            flag = false;
                            break;
                        }
                    }
                    if (flag == true) {
                        answer[0] = y - routeDistance;
                        break;
                    }
                    break;

                case 'S' :
                    if (y + routeDistance > park.length - 1) {
                        break;
                    }
                    for (int j = y; j <= y + routeDistance; j++) {
                        if (park[j].charAt(x) == 'X') {
                            flag = false;
                            break;
                        }
                    }
                    if (flag == true) {
                        answer[0] = y + routeDistance;
                        break;
                    }
                    break;

                case 'W' :
                    if (x - routeDistance < 0) {
                        break;
                    }
                    for (int j = x; j >= x - routeDistance; j--) {
                        if (park[y].charAt(j) == 'X') {
                            flag = false;
                            break;
                        }
                    }
                    if (flag == true) {
                        answer[1] = x - routeDistance;
                        break;
                    }
                    break;

                case 'E' :
                    if (x + routeDistance > park[0].length() - 1) {
                        break;
                    }
                    for (int j = x; j <= x + routeDistance; j++) {
                        if (park[y].charAt(j) == 'X') {
                            flag = false;
                            break;
                        }
                    }
                    if (flag == true) {
                        answer[1] = x + routeDistance;
                        break;
                    }
                    break;
            }

        }

        return answer;
    }
}

/* 테스트 통과 시간 : 0.04ms ~ 0.31ms
테스트 1 〉	통과 (0.04ms, 81.7MB)
테스트 2 〉	통과 (0.06ms, 84.2MB)
테스트 3 〉	통과 (0.05ms, 72.1MB)
테스트 4 〉	통과 (0.07ms, 78.7MB)
테스트 5 〉	통과 (0.13ms, 78.3MB)
테스트 6 〉	통과 (0.19ms, 71.3MB)
테스트 7 〉	통과 (0.22ms, 79.3MB)
테스트 8 〉	통과 (0.21ms, 71.6MB)
테스트 9 〉	통과 (0.31ms, 76.5MB)
테스트 10 〉	통과 (0.17ms, 75.8MB)
테스트 11 〉	통과 (0.18ms, 75.8MB)
테스트 12 〉	통과 (0.18ms, 73.4MB)
테스트 13 〉	통과 (0.21ms, 76.1MB)
테스트 14 〉	통과 (0.21ms, 78.3MB)
테스트 15 〉	통과 (0.18ms, 74.7MB)
테스트 16 〉	통과 (0.05ms, 77MB)
테스트 17 〉	통과 (0.11ms, 73.5MB)
테스트 18 〉	통과 (0.04ms, 76.1MB)
테스트 19 〉	통과 (0.20ms, 76.4MB)
테스트 20 〉	통과 (0.08ms, 76.6MB)
 */
