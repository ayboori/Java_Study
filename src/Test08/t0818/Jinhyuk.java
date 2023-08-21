package Test08.t0818;

import java.util.HashSet;

public class Jinhyuk {
    public static void main(String[] args) {
        Jinhyuk jinhyuk = new Jinhyuk();

        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        System.out.println(jinhyuk.solution(nums1)); //예상 답 2
        System.out.println(jinhyuk.solution(nums2)); //예상 답 3
        System.out.println(jinhyuk.solution(nums3)); //예상 답 2
    }

    public int solution(int[] nums) {
        int answer = 0;
        int maxPonketmonPick = nums.length / 2; //최대로 고를 수 있는 폰켓몬의 수

        HashSet<Integer> ponketmon = new HashSet<>(); // 중복 제거로 set을 사용
        for (int i = 0; i < nums.length; i++) {
            ponketmon.add(nums[i]); //set에 넣어주고
        }

        if (ponketmon.size() > maxPonketmonPick) { //set 의 크기가 최대로 고를 수 있는 폰켓몬의 수보다 크면
            answer = maxPonketmonPick; //최대로 고를 수 있는 폰켓몬의 수를 반환
        } else { //그게 아니면
            answer = ponketmon.size(); //set 의 크기를 반환
        }

        return answer; //정답
    }
}

/*
    {{ Trouble Shooting }}
아침 일찍 문제를 푸니까 머리가 안돌아가서 이해하는데 한참 걸림

폰켓몬의 최대 마릿 수를 넘어가는 ponketmon 배열의 사이즈만 생각하고
else 로 answer = ponketmon.size(); 를 주지 않아서 정확도 30.0 으로 한번 틀림

    [[ 시간 복잡도 0.03~3.69ms ]]
테스트 1 〉	통과 (0.03ms, 73.6MB)
테스트 2 〉	통과 (0.07ms, 76.7MB)
테스트 3 〉	통과 (0.04ms, 74.8MB)
테스트 4 〉	통과 (0.10ms, 72.4MB)
테스트 5 〉	통과 (0.13ms, 72.8MB)
테스트 6 〉	통과 (0.11ms, 72.2MB)
테스트 7 〉	통과 (0.31ms, 73.3MB)
테스트 8 〉	통과 (0.19ms, 77MB)
테스트 9 〉	통과 (0.24ms, 72.7MB)
테스트 10 〉	통과 (0.13ms, 75.1MB)
테스트 11 〉	통과 (0.28ms, 78.6MB)
테스트 12 〉	통과 (0.44ms, 77.7MB)
테스트 13 〉	통과 (1.02ms, 76.2MB)
테스트 14 〉	통과 (0.50ms, 79.4MB)
테스트 15 〉	통과 (1.03ms, 75.6MB)
테스트 16 〉	통과 (2.85ms, 79.9MB)
테스트 17 〉	통과 (3.69ms, 85.9MB)
테스트 18 〉	통과 (2.12ms, 82.1MB)
테스트 19 〉	통과 (1.99ms, 77MB)
테스트 20 〉	통과 (2.45ms, 81.5MB)
*/