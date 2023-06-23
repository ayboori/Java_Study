// lv.1 문자열 다루기 기본
package Test06.Test0623_P;

public class Ayoung {
    public int[] solution(String[] park, String[] routes) {
        // 현재 위치를 저장할 Point 객체 생성
        Point point = new Point();

        // 시작점 찾기
        for (int i = 0; i<park.length; i++) {
            if (park[i].contains("S")) {
                point.setPoint(park[i].indexOf("S"),i);
                System.out.println(point.x + " "+ point.y);
                break;
            }
        }

        for (String str : routes) {
            // 이동할 경로를 char / int로 분리하기
            String[] split = str.split(" ");
            char direction = split[0].charAt(0);
            int number = Integer.parseInt(split[1]);

            System.out.println(direction + " "+ number);

            move(park, direction, number, point); // 이동 수행
        }

        int[] answer = {point.y,point.x};
        return answer;
    }

    public void move(String[] park, char direction, int number, Point point) {
        switch (direction) {
            case 'E': // 동쪽 ( + x)
                for (int i = 0; i <= number; i++) {
                    if (park[point.y].charAt(point.x + i) == 'X' || point.x + number >= park[point.y].length()) {
                        return;
                    }
                }
                point.x += number;
                break;

            case 'S': // 남쪽 ( + y)
                for (int i = 0; i <= number; i++) {
                    if (park[point.y + i].charAt(point.x) == 'X' || point.y + number >= park.length) {
                        return;
                    }
                }
                point.y += number;
                break;

            case 'W': // 서쪽 ( - x)
                for (int i = 0; i <= number; i++) {
                    if (park[point.y].charAt(point.x - i) == 'X' || point.x - number < 0) {
                        return;
                    }
                }
                point.x -= number;
                break;

            case 'N': // 북쪽 (- y)
                for (int i = 0; i <= number; i++) {
                    if (park[point.y - i].charAt(point.x) == 'X' || point.y - number < 0) {
                        return;
                    }
                }
                point.y -= number;
                break;

            default:
                // 예외 던지기
                throw new IllegalArgumentException("wrong input");
        }
    }


    class Point { // 현재 위치 저장할 객체
        int x;
        int y;

        public void setPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

/*
테스트 1 〉	통과 (19.52ms, 67.7MB)
테스트 2 〉	통과 (12.99ms, 88.3MB)
테스트 3 〉	통과 (11.79ms, 76.7MB)
테스트 4 〉	통과 (15.76ms, 69.2MB)
테스트 5 〉	통과 (21.07ms, 71.2MB)
테스트 6 〉	통과 (34.62ms, 70.6MB)
테스트 7 〉	통과 (24.25ms, 70.3MB)
테스트 8 〉	통과 (16.23ms, 70.7MB)
테스트 9 〉	통과 (13.91ms, 72MB)
테스트 10 〉	통과 (14.74ms, 70.6MB)
테스트 11 〉	통과 (12.08ms, 76.4MB)
테스트 12 〉	통과 (13.82ms, 80.7MB)
테스트 13 〉	통과 (13.49ms, 78.2MB)
테스트 14 〉	통과 (13.20ms, 80MB)
테스트 15 〉	통과 (13.33ms, 81.1MB)
테스트 16 〉	통과 (10.87ms, 70.8MB)
테스트 17 〉	통과 (27.06ms, 74.6MB)
테스트 18 〉	통과 (15.55ms, 75.9MB)
테스트 19 〉	통과 (12.67ms, 71.9MB)
테스트 20 〉	통과 (14.32ms, 78.1MB)

 */