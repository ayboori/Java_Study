package Test08.t0821;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        String new_id = "...!@BaT#*..y.abcdefghijklm";

        System.out.println(hojoong.solution(new_id));
    }

    public String solution(String new_id) {
        String answer = "";

        // 1,2,3 단계 대문자를 소문자로 치환 // 알파벳 소문자, 숫자, 빼기-,밑줄_,마침표. // 마침표가 2번 이상이면 .개로 치환
        String checkId = new_id.toLowerCase().replaceAll("[^a-z0-9-_.]", "")
                .replaceAll("\\.{2,}", ".");

        //문자열 수정 삭제로인한 스트링빌더 생성
        StringBuilder sb = new StringBuilder(checkId);

        // 4단계 마침표가 처음이나 끝에 위치한다면 제거합니다.
        // 5단계 빈 문자열이라면, "a"를 대입합니다.
        // -> 마침표 사이에 중간 문자열이 없다면 무조건 마침표 1개만 거나, 아예 빈 문자열이기 때문에
        // -> 아예 빈문자열일 경우 제거 전 a를 넣어 준다
        // -> 첫번째 마침표가 지워질때 빈문자열이 된다면 a로 채워준다
        //?????프로그래머스에 stringbuilder.empty가 안먹네..
        if (sb.length() == 0) {
            sb.append("a");
        }
        if (sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
            if (sb.length() == 0) {
                sb.append("a");
            }
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }

        // 6단계 길이가 16자 이상이면, 나머지 문자들을 모두 제거합니다.
        // 스트링빌더 substring 반환이 string이라 복사가 안되네;;
        // 기존 스트링 사용하고 다시만듬.. 별로야
        if (sb.length() > 15) {
            checkId = sb.substring(0, 15);
            sb = new StringBuilder(checkId);
        }

        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }

        // 7단계 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙입니다
        if (sb.length() < 3) {
            char x = sb.charAt(sb.length() - 1);
            while (sb.length() < 3) {
                sb.append(x);
            }
        }

        answer = sb.toString();
        return answer;
    }
}
