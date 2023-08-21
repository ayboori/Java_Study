package Test08.t0821;

// 신규 아이디 추천
public class HaenaOther {
    public String solution(String new_id) {
        String s = new KAKAOID(new_id)
                .replaceToLowerCase()
                .filter()
                .toSingleDot()
                .noStartEndDot()
                .noBlank()
                .noGreaterThan16()
                .noLessThan2()
                .getResult();


        return s;
    }

    private static class KAKAOID {
        private String s;

        KAKAOID(String s) {
            this.s = s;
        }

        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        private KAKAOID replaceToLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        private KAKAOID filter() {
            s = s.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        private KAKAOID toSingleDot() {
            s = s.replaceAll("[.]{2,}", ".");
            return this;
        }

        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        private KAKAOID noStartEndDot() {
            s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }

        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        private KAKAOID noBlank() {
            s = s.isEmpty() ? "a" : s;
            return this;
        }

        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        private KAKAOID noGreaterThan16() {
            if (s.length() >= 16) {
                s = s.substring(0, 15);
            }
            s = s.replaceAll("[.]$", "");
            return this;
        }

        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        private KAKAOID noLessThan2() {
            StringBuilder sBuilder = new StringBuilder(s);
            while (sBuilder.length() <= 2) {
                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
            }
            s = sBuilder.toString();
            return this;
        }

        private String getResult() {
            return s;
        }
    }

    public static void main(String[] args) {
        HaenaOther sol = new HaenaOther();
        System.out.println(sol.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(sol.solution("z-+.^."));
        System.out.println(sol.solution("=.="));
        System.out.println(sol.solution("123_.def"));
        System.out.println(sol.solution("abcdefghijklmn.p"));
    }
}

/*
테스트 1 〉	통과 (0.40ms, 74.2MB)
테스트 2 〉	통과 (0.56ms, 77.2MB)
테스트 3 〉	통과 (0.63ms, 79.3MB)
테스트 4 〉	통과 (0.64ms, 78MB)
테스트 5 〉	통과 (0.55ms, 72.9MB)
테스트 6 〉	통과 (0.52ms, 75MB)
테스트 7 〉	통과 (0.56ms, 82.7MB)
테스트 8 〉	통과 (0.48ms, 76.1MB)
테스트 9 〉	통과 (0.46ms, 67.6MB)
테스트 10 〉	통과 (0.47ms, 71.3MB)
테스트 11 〉	통과 (0.46ms, 73.2MB)
테스트 12 〉	통과 (0.79ms, 74.5MB)
테스트 13 〉	통과 (0.61ms, 71.7MB)
테스트 14 〉	통과 (0.76ms, 71.9MB)
테스트 15 〉	통과 (0.62ms, 71.1MB)
테스트 16 〉	통과 (0.93ms, 73.2MB)
테스트 17 〉	통과 (1.35ms, 73.2MB)
테스트 18 〉	통과 (2.07ms, 72.1MB)
테스트 19 〉	통과 (2.37ms, 75.7MB)
테스트 20 〉	통과 (2.93ms, 75.3MB)
테스트 21 〉	통과 (3.84ms, 76.6MB)
테스트 22 〉	통과 (2.91ms, 73.4MB)
테스트 23 〉	통과 (1.52ms, 70.9MB)
테스트 24 〉	통과 (1.95ms, 76MB)
테스트 25 〉	통과 (1.55ms, 73.6MB)
테스트 26 〉	통과 (1.53ms, 75.6MB)
 */