package Test08.t0828;
// lv 1. 카드 뭉치

public class Ayoung {
    public static void main(String[] args) {
        Ayoung ay = new Ayoung();
        System.out.println(ay.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(ay.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 재사용 불가 / 생략 불가 / 순서 뒤엎기 불가 / 중간 삽입만 가능

        int cards1index = 0;
        int cards2index = 0;

        for (String g : goal){
            if(cards1index < cards1.length){
                if (cards1[cards1index].equals(g)){
                    cards1index ++;
                    continue;
                }
            }

            if(cards2index < cards2.length){
                if(cards2[cards2index].equals(g)){
                    cards2index ++;
                    continue;
                }
            }
            return "No";
        }

        return "Yes";
    }
}
/*

테스트 1 〉	통과 (0.02ms, 66MB)
테스트 2 〉	통과 (0.02ms, 76.8MB)
테스트 3 〉	통과 (0.02ms, 79MB)
테스트 4 〉	통과 (0.01ms, 73.8MB)
테스트 5 〉	통과 (0.01ms, 84.9MB)
테스트 6 〉	통과 (0.03ms, 80.8MB)
테스트 7 〉	통과 (0.03ms, 73.3MB)
테스트 8 〉	통과 (0.03ms, 73.9MB)
테스트 9 〉	통과 (0.03ms, 77.4MB)
테스트 10 〉	통과 (0.02ms, 67MB)
테스트 11 〉	통과 (0.03ms, 72.8MB)
테스트 12 〉	통과 (0.03ms, 74.2MB)
테스트 13 〉	통과 (0.02ms, 77.7MB)
테스트 14 〉	통과 (0.02ms, 69.7MB)
테스트 15 〉	통과 (0.02ms, 79.4MB)
테스트 16 〉	통과 (0.03ms, 77.5MB)
테스트 17 〉	통과 (0.03ms, 66.2MB)
테스트 18 〉	통과 (0.03ms, 66.7MB)
테스트 19 〉	통과 (0.04ms, 70.6MB)
테스트 20 〉	통과 (0.03ms, 71.1MB)
테스트 21 〉	통과 (0.03ms, 84.6MB)
테스트 22 〉	통과 (0.02ms, 72.1MB)
테스트 23 〉	통과 (0.03ms, 83MB)
테스트 24 〉	통과 (0.03ms, 91.3MB)
테스트 25 〉	통과 (0.03ms, 75MB)
 */