package Test06.Test0621_P;

public class jinhyuk_try {
    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        System.out.println(jinhyuk.solution(13, 17));
        System.out.println(jinhyuk.solution(24, 27));
    }

    public int solution(int left, int right) {
        // 선언, 초기화
        int answer = 0;
        int plusNum = 0;
        int miNum = 0;

        // for문으로 left값부터 right값까지의 수를 하나씩 넣으면서
        // 각 각 수들의 약수의 개수를 구할 예정

        //left부터 right까지 값을 a로 지정
        for (int a = left; a < right; a++) {
            int num = 0;
            //a에 i를 하나씩 나눠주면 약수의 갯수를 구함
            for (int i = a; i > 0; i--) {
                //i로 나누어진 나머지가 0이면
                if (a % i == 0) {
                    //num을 하나 높인다
                    num++;
                } else { //나머지가 0이 아니라면 num은 높이지 않는다.
                }
            }
            if (num % 2 == 0) {  //num 즉 약수의 갯수가 짝수이면
                //결과값에 a를 더한다
                plusNum = plusNum + a;
                answer = plusNum / 2;  //초기 반복문에 포함되어있어서 여러번 들어가게되어서 만들었던 잘못된 부분
                num = 0; //끝나고 num을 초기화해서 다시 쓰게할려고 했었다.
                //약수의 갯수가 홀수이면
            } else {
                //결과값에 a를 마이너스 한다.
                miNum = miNum - a; //플러스와 같은 생각으로 만들었던 부분
                answer = miNum / 2;
                num = 0;
            }
        }
        return answer; //결과 출력부분
    }
}
