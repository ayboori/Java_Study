package Test08.t0828;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        System.out.println(donghwan.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(donghwan.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int card1Index = 0; // 이중반복문을 사용하지않기 위해 인덱스 변수를 생성.
        int card2Index = 0; // 이중반복문을 사용하지않기 위해 인덱스 변수를 생성.

        for (int i=0;i<goal.length;i++) { // goal 배열에 접근하기위한 반복문.
            if(card1Index < cards1.length && goal[i].equals(cards1[card1Index])) { // Index가 cards1에 length보다 커지면 해당하는 인덱스 값을 못가져오기 때문에 && 연산자로 조건문 생성.
                card1Index++; // 조건문을 탈시에 다음 문자열을 뽑아와야되기 때문에 1추가.
                continue; // 조건문 탈출.
            }

            if(card2Index < cards2.length && goal[i].equals(cards2[card2Index])) {// Index가 cards1에 length보다 커지면 해당하는 인덱스 값을 못가져오기 때문에 && 연산자로 조건문 생성.
                card2Index++; // 조건문을 탈시에 다음 문자열을 뽑아와야되기 때문에 1추가.
                continue; // 조건문 탈출.
            }

            return "No"; // 위 두개의 조건문을 안 탔을 경우 GOAL 문자열을 못 만들기 때문에 No를 반환.
        }
        return "Yes"; // 아닐시에 Yes를 반환.
    }
}


//        테스트 1 〉	통과 (0.02ms, 73.8MB)
//        테스트 2 〉	통과 (0.03ms, 77.6MB)
//        테스트 3 〉	통과 (0.02ms, 73.8MB)
//        테스트 4 〉	통과 (0.03ms, 67.4MB)
//        테스트 5 〉	통과 (0.02ms, 79.7MB)
//        테스트 6 〉	통과 (0.02ms, 76.3MB)
//        테스트 7 〉	통과 (0.02ms, 75.5MB)
//        테스트 8 〉	통과 (0.01ms, 76.1MB)
//        테스트 9 〉	통과 (0.02ms, 79.3MB)
//        테스트 10 〉	통과 (0.03ms, 72.5MB)
//        테스트 11 〉	통과 (0.02ms, 66.3MB)
//        테스트 12 〉	통과 (0.02ms, 74.5MB)
//        테스트 13 〉	통과 (0.02ms, 78.6MB)
//        테스트 14 〉	통과 (0.02ms, 73.8MB)
//        테스트 15 〉	통과 (0.02ms, 75.7MB)
//        테스트 16 〉	통과 (0.02ms, 75.1MB)
//        테스트 17 〉	통과 (0.02ms, 84.4MB)
//        테스트 18 〉	통과 (0.02ms, 73.5MB)
//        테스트 19 〉	통과 (0.02ms, 78.7MB)
//        테스트 20 〉	통과 (0.03ms, 78.3MB)
//        테스트 21 〉	통과 (0.01ms, 78MB)
//        테스트 22 〉	통과 (0.02ms, 70.7MB)
//        테스트 23 〉	통과 (0.02ms, 72.5MB)
//        테스트 24 〉	통과 (0.02ms, 78.9MB)
//        테스트 25 〉	통과 (0.03ms, 72.7MB)