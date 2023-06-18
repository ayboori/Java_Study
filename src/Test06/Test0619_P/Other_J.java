package Test06.Test0619_P;
public class Other_J {
    public static void main( String[] args ) {
        Other_J otherJ = new Other_J();
        String t1 = "3people unFollowed me";
        String t2 = "for  the last week";   // 기존 예제에서 중간에 공백 추가
        String t3 = "  a a   ";             // 내가 만든 예제
        System.out.println( otherJ.solution( t1 ) );
        System.out.println( otherJ.solution( t2 ) );
        System.out.println( otherJ.solution( t3 ) );
    }

    // 다른 사람의 풀이입니다.
    // 저와 로직은 같은데 코드가 간단해져서 신기해서 들고왔습니다!
    public String solution(String s) {
        String answer = "";
        // 주어진 String을 소문자로 변환 후 하나하나 쪼개기
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }
        return answer;
    }

}
