package Test08.t0802;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

    }

    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder(); //선언 부분
        StringBuilder backFood = new StringBuilder();

        int[] foodNum = new int[food.length-1]; // foodNum 으로  반복해줄 숫자 구함

        for (int i = 1; i < foodNum.length; i++) {
            foodNum[i - 1] = food[i] / 2; // food[i]를 1부터 시작해서 몫을 저장해준다
        }

        for (int i = 0; i < foodNum.length; i++) { //foodNum의 수만큼 j를 추가해준다
            for (int j = 0; j < foodNum[i]; j++) {
                answer.append(i + 1); // answer 의 i+1의 위치에 추가해준다
            }
        }

        backFood = answer.reverse(); //뒤집어서 넣기위해서 저장해주고
        answer.append("0"); //0을 가운데에 넣고
        answer.append(backFood); //뒤집은거 다시 넣고

        return answer.toString(); //반환
    }
}


/* 통과시간 0.03~1.03ms
테스트 1 〉	통과 (0.46ms, 75MB)
테스트 2 〉	통과 (0.57ms, 75.1MB)
테스트 3 〉	통과 (0.48ms, 77.3MB)
테스트 4 〉	통과 (0.58ms, 77.1MB)
테스트 5 〉	통과 (0.29ms, 82.1MB)
테스트 6 〉	통과 (0.71ms, 77.3MB)
테스트 7 〉	통과 (0.59ms, 73.1MB)
테스트 8 〉	통과 (0.48ms, 66.1MB)
테스트 9 〉	통과 (0.33ms, 74.1MB)
테스트 10 〉	통과 (0.51ms, 74.9MB)
테스트 11 〉	통과 (0.03ms, 78.6MB)
테스트 12 〉	통과 (0.04ms, 72.5MB)
테스트 13 〉	통과 (0.05ms, 75.5MB)
테스트 14 〉	통과 (1.03ms, 81.9MB)
테스트 15 〉	통과 (0.04ms, 71.2MB)
테스트 16 〉	통과 (0.03ms, 74.1MB)
테스트 17 〉	통과 (0.04ms, 72.5MB)
테스트 18 〉	통과 (0.04ms, 78.7MB)
테스트 19 〉	통과 (0.05ms, 77.9MB)
테스트 20 〉	통과 (0.04ms, 66.7MB)

{{ Trouble Shooting }}

1. for (int i = 1; i < food.length; i++) 로 오류 발생
---------------------------------------------
(int i = 1; i < foodNum.length; i++) 로 수정

2.
answer.append("0");
backFood = answer.reverse();
answer.append(backFood); 로 잘못 작성
-----------------------------------
backFood = answer.reverse();
answer.append("0");
answer.append(backFood); 로 수정

*/
