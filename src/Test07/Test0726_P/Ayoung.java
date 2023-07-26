package Test07.Test0726_P;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

// lv.1 개인정보 수집 유효기간

public class Ayoung {
    public static void main(String[] args) {
        Ayoung sol = new Ayoung();
        System.out.println(Arrays.toString(sol.solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
        // [1,3]
        System.out.println(Arrays.toString(sol.solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"})));
        // [1,4,5]
    }
        public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
            // 입력 받은 오늘 날짜 String 데이터 > Date 형식으로 변환
            SimpleDateFormat transFormat = new SimpleDateFormat("yyyy.MM.dd");
            Date todayDate = transFormat.parse(today);
            Date inputArr [] = new Date[privacies.length];
            char[] inputTermsArr = new char[privacies.length];
            Calendar calendar = Calendar.getInstance();
            ArrayList<Integer> ans = new ArrayList<>();


            for (int i = 0 ; i < privacies.length ; i++){
                // 입력 받은 privacies 날짜, 약관으로 분리 / 날짜 > Date로 변환
                String[] temp = privacies[i].split(" ");

                inputArr[i] = transFormat.parse(temp[0]);
                calendar.setTime(inputArr[i]);

                // 입력 받은 약관, 해당 날짜 비교해서 만료일자 설정
                for (String a : terms) {
                    String[] temp2 = a.split(" ");
                    if (temp2[0].equals(temp[1])) {
                        calendar.add(Calendar.MONTH, Integer.parseInt(temp2[1]));
                        Date expireDate = calendar.getTime();

                        // 오늘 날짜, 만료 날짜 비교
                        if( todayDate.compareTo(expireDate) >= 0){ // 만료 X 시
                            ans.add(i+1);
                        }
                        continue;
                    }
                }
            }
            // ArrayList<Integer>를 int[]로 변환
            int[] result = new int[ans.size()];
            for (int i = 0; i < ans.size(); i++) {
                result[i] = ans.get(i);
            }

            return result;
        }
}
