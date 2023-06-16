// lv.1 가운데 글자 가져오기
package Test06.Test0614_P;

public class Jinhyuk {

        public String solution(String s) {

            int strNum = s.length() / 2;

            String midStr = "";
            int midNum = s.length() / 2;


            if (s.length() % 2 == 1) {
                midStr = s.substring(midNum, midNum + 1);
            } else {
                midStr = s.substring(midNum - 1, midNum + 1);

            }
            String answer = midStr;
            return answer;
        }
    }
