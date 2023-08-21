package Test08.t0821;

public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(ay.solution("z-+.^."));
        System.out.println(ay.solution("=.="));
        System.out.println(ay.solution("123_.def"));
        System.out.println(ay.solution("abcdefghijklmn.p"));
    }
    public String solution(String new_id) {
        StringBuilder temp_id = new StringBuilder();

        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();

// 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        boolean flag = false;

        for(int i = 0 ; i < new_id.length() ; i++){
            // ASCII 코드를 이용해 범위 내의 값만 StringBuilder에 추가
            int tempAscii = (int)new_id.charAt(i);
            if(tempAscii == 45 || tempAscii == 95 || tempAscii == 46
                    || (tempAscii >= 48 && tempAscii <= 57)
                    || (tempAscii >= 97 && tempAscii <= 122)){

                // 직전에 마침표였는데 또 마침표면 append 하지 않음
                if(flag == true && tempAscii == 46){
                    continue;
                }

// 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
                if(tempAscii == 46){ // 마침표 있으면 flag 세팅
                    flag = true;
                }else{
                    flag = false;
                }
                temp_id.append(new_id.charAt(i));
            }
        }

// 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if(temp_id.charAt(0) == '.'){
            temp_id.deleteCharAt(0);
        }

        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.

        if(temp_id.length() == 0){
            temp_id.append("a");
        }

        // 아래에서 length()가 0이면 오류가 발생하기 때문에 a를 대입하는 과정을 먼저 함

        if(temp_id.charAt(temp_id.length()-1) == '.'){
            temp_id.deleteCharAt(temp_id.length()-1);
        }

// 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.

        if(temp_id.length() >= 16){
            temp_id = new StringBuilder(temp_id.substring(0,15));
// 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
            if(temp_id.charAt(14) == '.'){
                temp_id.deleteCharAt(14);
            }

        }

// 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(temp_id.length() <= 2){
            for(int i = temp_id.length() ; i < 3; i++){
                temp_id.append(temp_id.charAt(temp_id.length() - 1));
            }
        }

        return temp_id.toString();
    }
}

/*
통과 시간 : 0.03ms ~ 0.34ms
테스트 1 〉	통과 (0.03ms, 74.6MB)
테스트 2 〉	통과 (0.06ms, 83.5MB)
테스트 3 〉	통과 (0.04ms, 75MB)
테스트 4 〉	통과 (0.08ms, 74.8MB)
테스트 5 〉	통과 (0.07ms, 73.4MB)
테스트 6 〉	통과 (0.07ms, 73.3MB)
테스트 7 〉	통과 (0.04ms, 74.4MB)
테스트 8 〉	통과 (0.05ms, 74MB)
테스트 9 〉	통과 (0.03ms, 75.8MB)
테스트 10 〉	통과 (0.04ms, 77.9MB)
테스트 11 〉	통과 (0.07ms, 75.5MB)
테스트 12 〉	통과 (0.06ms, 71.2MB)
테스트 13 〉	통과 (0.07ms, 75.6MB)
테스트 14 〉	통과 (0.09ms, 72MB)
테스트 15 〉	통과 (0.07ms, 75.4MB)
테스트 16 〉	통과 (0.11ms, 77.9MB)
테스트 17 〉	통과 (0.16ms, 76MB)
테스트 18 〉	통과 (0.20ms, 78.7MB)
테스트 19 〉	통과 (0.34ms, 72MB)
테스트 20 〉	통과 (0.19ms, 78MB)
테스트 21 〉	통과 (0.19ms, 80.5MB)
테스트 22 〉	통과 (0.22ms, 79.2MB)
테스트 23 〉	통과 (0.15ms, 71.3MB)
테스트 24 〉	통과 (0.26ms, 73MB)
테스트 25 〉	통과 (0.23ms, 73.5MB)
테스트 26 〉	통과 (0.16ms, 74.2MB)
 */