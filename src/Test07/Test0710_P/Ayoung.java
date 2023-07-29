package Test07.Test0710_P;

public class Ayoung {
    public static void main(String[] args) {

    }

    int R,T,C,F,J,M,A,N = 0; // 성격 유형 변수들

    public String solution(String[] survey, int[] choices) {
        for (int i = 0 ; i<choices.length ; i++){
            scoring(survey[i],choices[i]); // 루프를 돌며 연산 수행
        }
        return result(); // 결과 리턴
    }

    public void scoring(String survey, int choice){
        if(choice > 4){ // 동의 관련 선택지 > 1번째 char에 가산
            oneElement(survey.charAt(1),choice-4);
        }else if(choice < 4){ // 비동의 관련 선택지 > 0번째 char에 가산
            oneElement(survey.charAt(0),4-choice);
        }
    }

    public void oneElement(char c, int plus){ // char 값에 따라 해당 변수에 +
        switch (c){
            case 'R':
                R += plus;
                break;
            case 'T':
                T += plus;
                break;
            case 'C':
                C += plus;
                break;
            case 'F':
                F += plus;
                break;
            case 'J':
                J += plus;
                break;
            case 'M':
                M += plus;
                break;
            case 'A':
                A += plus;
                break;
            case 'N':
                N += plus;
                break;
        }
    }

    public String result(){ // 결과 값 리턴을 위해 변수 비교, answer에 append
        StringBuilder answer = new StringBuilder();
        answer.append(R >= T ? "R" : "T");
        answer.append(C >= F ? "C" : "F");
        answer.append(J >= M ? "J" : "M");
        answer.append(A >= N ? "A" : "N");
        return answer.toString();
    }
}

/*
0.03ms ~ 0.31ms

테스트 1 〉	통과 (0.05ms, 75.3MB)
테스트 2 〉	통과 (0.04ms, 76.8MB)
테스트 3 〉	통과 (0.03ms, 75.8MB)
테스트 4 〉	통과 (0.03ms, 70.1MB)
테스트 5 〉	통과 (0.05ms, 73.7MB)
테스트 6 〉	통과 (0.05ms, 74.3MB)
테스트 7 〉	통과 (0.05ms, 75.3MB)
테스트 8 〉	통과 (0.04ms, 77.2MB)
테스트 9 〉	통과 (0.06ms, 71.7MB)
테스트 10 〉	통과 (0.06ms, 78MB)
테스트 11 〉	통과 (0.05ms, 74.7MB)
테스트 12 〉	통과 (0.09ms, 72.2MB)
테스트 13 〉	통과 (0.17ms, 70.8MB)
테스트 14 〉	통과 (0.20ms, 75.4MB)
테스트 15 〉	통과 (0.22ms, 74.3MB)
테스트 16 〉	통과 (0.31ms, 88.8MB)
테스트 17 〉	통과 (0.27ms, 76.8MB)
테스트 18 〉	통과 (0.30ms, 75.3MB)
테스트 19 〉	통과 (0.25ms, 85.5MB)
테스트 20 〉	통과 (0.24ms, 80MB)
 */