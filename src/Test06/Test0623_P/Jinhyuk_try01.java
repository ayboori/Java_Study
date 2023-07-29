package Test06.Test0623_P;

public class Jinhyuk_try01 {
    class Solution {
        public int[] solution(String[] park, String[] routes) {
            int[] answer = new int[2]; //선언 초기화
            int H = park.length; //공원 세로길이
            int W = park[0].length(); //공원 가로길이
            int x = 0; //로봇강아지 세로위치
            int y = 0; //로봇강이지 가로위치


            char[][] parkArray = new char[H][W]; //선언 초기화 크기지정
            for (int i = 0; i < H; i++) {
                parkArray[i] = park[i].toCharArray();// 해당 위치의 정보를 이차원 배열에 저장
                for (int j = 0; j < W; j++) {
                    if (parkArray[i][j] == 'S') { //시작 지점 s
                        x = i; //로봇강아지 세로좌표
                        y = j; //가로좌표
                    }
                }
            }


            for (String route : routes) { //각 명령 대해서
                String[] splitRoute = route.split(" "); //명령을 한개씩 분리
                char direction = splitRoute[0].charAt(0); //이동 방향 지정
                int distance = Integer.parseInt(splitRoute[1]); //이동 거리 지정


                switch (direction) { //방향에 따라 이동하는 case 생성
                    case 'N': // 북쪽으로 이동하는 경우
                        for (int i = 0; i < distance; i++) {
                            if (x - 1 < 0 || parkArray[x - 1][y] == 'X') break;
                            // 공원의 범위를 넘지않고, x(방해물이)이 아닐때
                            x--;
                        }
                        break;
                    case 'S': // 남쪽으로 이동하는 경우
                        for (int i = 0; i < distance; i++) {
                            if (x + 1 >= H || parkArray[x + 1][y] == 'X') break;
                            x++;
                        }
                        break;
                    case 'W': // 서쪽 이동시
                        for (int i = 0; i < distance; i++) {
                            if (y - 1 < 0 || parkArray[x][y - 1] == 'X') break;
                            y--;
                        }
                        break;
                    case 'E': // 동쪽 이동시
                        for (int i = 0; i < distance; i++) {
                            if (y + 1 >= W || parkArray[x][y + 1] == 'X') break;
                            y++;
                        }
                        break;
                }
            }

            answer[0] = x; //최종 세로좌표
            answer[1] = y;  //최종 가로 좌표

            return answer;  //정답 반환
        }
    }
}