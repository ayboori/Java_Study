package Test09.t0911;

import java.util.*;

// 프로그래머스 lv.1 신고 결과 받기
public class Haena {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고 중복 제거
        Set<String> reportSet = new HashSet<>(List.of(report));
        List<String> reportList = new ArrayList<>(reportSet);

        // 신고 수 확인
        Map<String, Integer> reportMap = new HashMap<String, Integer>();
        for (String str : reportList) {
            String[] strArr = str.split(" ");
            String blackUser = strArr[1];
            if (reportMap.containsKey(blackUser)) {
                reportMap.put(blackUser, reportMap.get(blackUser)+1);
            } else {
                reportMap.put(blackUser, 1);
            }
        }

        // 정지 확인 및 메일 발송 횟수 체크
        Map<String, Integer> mailMap = new HashMap<String, Integer>();
        for (String str : reportList) {
            String[] strArr = str.split(" ");
            String reportUser = strArr[0];
            String blackUser = strArr[1];
            if (reportMap.get(blackUser) >= k) {
                if (mailMap.containsKey(reportUser)) {
                    mailMap.put(reportUser, mailMap.get(reportUser)+1);
                } else {
                    mailMap.put(reportUser, 1);
                }
            }
        }

        // 정답 배열 만들기
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            if (mailMap.containsKey(id_list[i])) {
                int value = mailMap.get(id_list[i]);
                answer[i] = value;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Haena sol = new Haena();
        System.out.println(Arrays.toString(sol.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));
        System.out.println(Arrays.toString(sol.solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 2)));
    }
}

/*
테스트 1 〉	통과 (0.20ms, 81.8MB)
테스트 2 〉	통과 (0.38ms, 77.1MB)
테스트 3 〉	통과 (200.07ms, 171MB)
테스트 4 〉	통과 (1.04ms, 72.5MB)
테스트 5 〉	통과 (0.55ms, 80.2MB)
테스트 6 〉	통과 (5.33ms, 79.3MB)
테스트 7 〉	통과 (6.81ms, 82.1MB)
테스트 8 〉	통과 (7.85ms, 93.8MB)
테스트 9 〉	통과 (107.76ms, 127MB)
테스트 10 〉	통과 (158.14ms, 147MB)
테스트 11 〉	통과 (217.45ms, 180MB)
테스트 12 〉	통과 (2.13ms, 67.8MB)
테스트 13 〉	통과 (2.15ms, 78.2MB)
테스트 14 〉	통과 (113.34ms, 138MB)
테스트 15 〉	통과 (193.78ms, 145MB)
테스트 16 〉	통과 (1.80ms, 86.4MB)
테스트 17 〉	통과 (2.18ms, 80.8MB)
테스트 18 〉	통과 (3.62ms, 76.4MB)
테스트 19 〉	통과 (3.49ms, 80.4MB)
테스트 20 〉	통과 (135.96ms, 139MB)
테스트 21 〉	통과 (140.81ms, 166MB)
테스트 22 〉	통과 (0.12ms, 72MB)
테스트 23 〉	통과 (0.19ms, 73MB)
테스트 24 〉	통과 (0.21ms, 72.8MB)
 */