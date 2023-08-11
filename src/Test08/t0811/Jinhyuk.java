package Test08.t0811;

import java.util.Arrays;

public class Jinhyuk {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length]; // photo 의 행 길이만큼 배열 선언

        for (int i = 0; i < photo.length; i++) { //이게맞나

            for (int j = 0; j <photo[i].length; j++) { // i번째 행의 열 길이만큼 반복

                for (int k = 0; k < name.length; k++) { // 해당하는 맞는 점수를 주기위한 for k

                    if (name[k].equals(photo[i][j])) { // 일치할시
                        answer[i] += yearning[k]; // 일치하는 점수를 더함

                    } else {
                        answer[i] += 0; // 안 일치하면 0점 더하기
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        String[] name1 = {"진혁", "지수", "호중", "지혜"};
        int[] yearning1 = {8, 57, 10, 1};
        String[][] photo1 = {{"지수", "지혜", "호중"}, {"진혁", "호중", "동환"}};

        String[] name2 = {"동환", "해나", "아영"};
        int[] yearning2 = {27, 53, 3};
        String[][] photo2 = {{"현규", "관호"}, {"해나", "아영"}, {"남명", "동환"}};

        String[] name3 = {"may", "kein", "kain", "radi"};
        int[] yearning3 = {5, 10, 1, 3};
        String[][] photo3 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};

        System.out.println(Arrays.toString(jinhyuk.solution(name1, yearning1, photo1)));
        System.out.println(Arrays.toString(jinhyuk.solution(name2, yearning2, photo2)));
        System.out.println(Arrays.toString(jinhyuk.solution(name3, yearning3, photo3)));
    }
}

/*
    {{ Trouble Shooting }}
1.int[] answer = new int[][photo.length];로 행 길이 선언하려 했으나
int[] answer = new int[photo.length]; 로 수정하여서 해결

2. switch case 에 for 문을 섞어서 case 를 줘보려고 하였으나
생각해보아도 표현 방법을 잘 모르겠어서 추후 시도 예정

3. 이중 for문에 if문을 시도하려 했으나 실패
for문을 3개 써야 기존의 수에 해당하는 맞는 값을 넣을 수 있음을 확인

    [[ 시간 복잡도 0.02~21.53ms ]]
테스트 1 〉	통과 (0.02ms, 67.9MB)
테스트 2 〉	통과 (0.04ms, 67.7MB)
테스트 3 〉	통과 (0.54ms, 77.8MB)
테스트 4 〉	통과 (0.51ms, 71.3MB)
테스트 5 〉	통과 (7.17ms, 82.9MB)
테스트 6 〉	통과 (12.12ms, 77.2MB)
테스트 7 〉	통과 (9.46ms, 81.5MB)
테스트 8 〉	통과 (7.26ms, 81.3MB)
테스트 9 〉	통과 (15.19ms, 87.9MB)
테스트 10 〉	통과 (21.53ms, 95.8MB)
테스트 11 〉	통과 (21.46ms, 101MB)
테스트 12 〉	통과 (16.38ms, 102MB)
테스트 13 〉	통과 (0.11ms, 77.1MB)
테스트 14 〉	통과 (0.02ms, 73.2MB)
*/