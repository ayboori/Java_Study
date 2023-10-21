package Test09.t0911;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hojoong {

    public static void main(String[] args) {
        Hojoong hojoong = new Hojoong();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        System.out.println(Arrays.toString(hojoong.solution(id_list, report, k)));
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        // 중복은 1번 (String[] report-> set 변경)
        Set<String> reports = new HashSet<>(List.of(report));

        // 유저별 신고 당한 횟수를 구하기 Key-value
        Map<String, Integer> reportCount = new HashMap<>();
        for (String id : id_list) {
            reportCount.put(id, 0);
        }

        // 중복 제거된 repots에서 map에 저장된 유저를 찾고 count++;
        Iterator<String> iteratorReports = reports.iterator();
        while (iteratorReports.hasNext()) {
            String[] whoReport = iteratorReports.next().split(" ");
            reportCount.replace(whoReport[1], reportCount.get(whoReport[1]) + 1);
        }

        // 정지되는 사람들
        // map에 저장된 유저의 카운터가 k와 같거나 클 경우 list에 저장
        ArrayList<String> reportUser = new ArrayList<>();
        for (String user : reportCount.keySet()) {
            if (reportCount.get(user) >= k) {
                reportUser.add(user);
            }
        }

        // 유저가 신고한 유저 리스트
        // Map <String, Arraylist>
        Map<String, ArrayList<String>> id_Reports = new HashMap<>();
        for (String id : id_list) {
            id_Reports.put(id, new ArrayList<>());
        }

        // map에 저장된 user가 신고한 유저 arraylist.add():
        Iterator<String> iterator_Id_Reports = reports.iterator();
        while (iterator_Id_Reports.hasNext()) {
            String[] whoReport = iterator_Id_Reports.next().split(" ");
            ArrayList<String> reportList = id_Reports.get(whoReport[0]);
            reportList.add(whoReport[1]);
        }

        // 신고한 유저 리스트에 정지된 유저가 포함되어 있으면 ++;
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            ArrayList<String> reportList = id_Reports.get(id_list[i]);
            for (String user : reportUser) {
                if (reportList.contains(user)) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }

//    테스트 1 〉	통과 (0.27ms, 77.7MB)
//    테스트 2 〉	통과 (0.32ms, 75.5MB)
//    테스트 3 〉	통과 (648.81ms, 180MB)
//    테스트 4 〉	통과 (0.59ms, 85.4MB)
//    테스트 5 〉	통과 (0.75ms, 72.3MB)
//    테스트 6 〉	통과 (6.12ms, 78.6MB)
//    테스트 7 〉	통과 (7.70ms, 81MB)
//    테스트 8 〉	통과 (10.09ms, 101MB)
//    테스트 9 〉	통과 (245.35ms, 140MB)
//    테스트 10 〉	통과 (141.90ms, 129MB)
//    테스트 11 〉	통과 (349.46ms, 180MB)
//    테스트 12 〉	통과 (7.69ms, 73.7MB)
//    테스트 13 〉	통과 (2.80ms, 78.7MB)
//    테스트 14 〉	통과 (282.27ms, 138MB)
//    테스트 15 〉	통과 (149.51ms, 152MB)
//    테스트 16 〉	통과 (3.13ms, 84.2MB)
//    테스트 17 〉	통과 (2.20ms, 72.8MB)
//    테스트 18 〉	통과 (5.01ms, 78.6MB)
//    테스트 19 〉	통과 (7.82ms, 85MB)
//    테스트 20 〉	통과 (236.04ms, 120MB)
//    테스트 21 〉	통과 (399.06ms, 145MB)
//    테스트 22 〉	통과 (0.17ms, 73.7MB)
//    테스트 23 〉	통과 (0.24ms, 75.9MB)
//    테스트 24 〉	통과 (0.26ms, 80.6MB)
}
