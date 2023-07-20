package Test07.Test0719_P;

public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution("one4seveneight"); //1478
        System.out.println(ay.solution("23four5six7"); //234567
        System.out.println(ay.solution("2three45sixseven"); //234567
        System.out.println(ay.solution("123"); //123
    }

    public int solution(String s) {
        String [] engNum = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i = 0 ; i<engNum.length; i++){
            if(s.contains(engNum[i])){ // 영문 포함 확인
                s = s.replace(engNum[i], Integer.toString(i) ); // 앞을 뒤로 변경
                // 이때 인덱스 값으로 대체하면 된다.
            }
        }
        return Integer.parseInt(s);
    }
}
