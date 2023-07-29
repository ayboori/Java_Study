package Test07.Test0712_P;

public class Jinhyuk {
    public static void main(String[] args) {

        Jinhyuk jinhyuk = new Jinhyuk();

        int[] number1 = {-2, 3, 0, 2, -5};
        int[] number2 = {-3, -2, -1, 0, 1, 2, 3};
        int[] number3 = {-1, 1, -1, 1};

        System.out.println(jinhyuk.solution(number1));
        System.out.println(jinhyuk.solution(number2));
        System.out.println(jinhyuk.solution(number3));
    }

    public int solution(int[] number) {
        int answer = 0, samchongsa; // samchongsa 는 선언만

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {

                    samchongsa = number[i] + number[j] + number[k];

                    if (samchongsa == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
