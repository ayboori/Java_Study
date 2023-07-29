package Test07.Test0726_P;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class hojoog {
    public static void main(String[] args) throws ParseException {

        String today="2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        //날짜 더하기 -> SimpleDateFormat통해 String을 date 타입 변경 -> cal로 만들어서 날짜 더하기 메서드 사용 -> string으로 다시 뽑아내는 순서
        //구글링~
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        Date date = format.parse(today);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);


        //날짜 수식 pre date + terms month < today
        //pre date < today - terms month
        //->for i+1 리스트에 저장


        HashMap<String, String> term = new HashMap<>();

        //hashmap 에 약관 종류, 로직에 사용될 만료되엇어야할 날짜 저장
        for (String t : terms) {
            int month = Integer.parseInt(t.substring(2));
            cal.add(Calendar.MONTH, -month);
            String lastDate = format.format(cal.getTime());
            term.put(t.substring(0,1),lastDate);
            cal.add(Calendar.MONTH, month);
        }


        ArrayList<Integer> answer = new ArrayList<>();

        //for문을 통해 개인 정보를 1개씩 꺼내가며
        //hashmap에 저장된 key값을 찾아 날짜비교.

        for (int i = 0; i < privacies.length ; i++) {

            if(term.containsKey(privacies[i].substring(11))){
                Date x = format.parse(term.get(privacies[i].substring(11)));
                Date y = format.parse(privacies[i].substring(0,10));
                if (x.compareTo(y) >= 0) {
                    //폐기
                    answer.add(i+1);
                }
            }

        }

        System.out.println(answer);


    }
}
