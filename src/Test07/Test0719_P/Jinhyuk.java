package Test07.Test0719_P;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        String s1 = "one4seveneight";
        String s2 = "23four5six7";
        String s3 = "2three45sixseven";
        String s4 = "123";

        System.out.println(jinhyuk.solution(s1));
        System.out.println(jinhyuk.solution(s2));
        System.out.println(jinhyuk.solution(s3));
        System.out.println(jinhyuk.solution(s4));
    }

    public int solution(String s) {
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");
        return Integer.parseInt(s);
    }
}
/*
        통과 시간 (0.06~0.09ms)
        테스트 1 〉	통과 (0.06ms, 70.5MB)
        테스트 2 〉	통과 (0.07ms, 76.3MB)
        테스트 3 〉	통과 (0.08ms, 73.4MB)
        테스트 4 〉	통과 (0.06ms, 73.3MB)
        테스트 5 〉	통과 (0.06ms, 72.9MB)
        테스트 6 〉	통과 (0.07ms, 77.1MB)
        테스트 7 〉	통과 (0.07ms, 69.9MB)
        테스트 8 〉	통과 (0.06ms, 76.7MB)
        테스트 9 〉	통과 (0.08ms, 70.9MB)
        테스트 10 〉	통과 (0.09ms, 72.8MB)
        채점 결과
        정확성: 100.0
        합계: 100.0 / 100.0
*/