package Test08.t0811;

public class Jihye {
    public static void main(String[] args) {
        Jihye jh = new Jihye();

        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {{"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}};

        System.out.println(jh.solution(name1, yearning1, photo1));
    }
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length]; // 점수 함계를 담을 배열

        for(int i=0; i<photo.length; i++){ // photo의 길이 만큼 0, 1, 2
            for(int j=0; j<photo[i].length; j++){ // photo[i]의 길이만큼 4, 4, 4
                for(int k=0; k<name.length; k++){ // name 배열 길이 만큼 0, 1, 2, 3
                    if(photo[i][j].equals(name[k])){ // photo의 배열 하나하나 name과 비교한다.
                        answer[i] += yearning[k]; // yearning의 길이와 name의 길이와 같기에 배열 방번호를 k로 넣어준다.
                    }
                }
            }
        }

        return answer;
    }

//    테스트 1 〉	통과 (0.03ms, 75.1MB)
//    테스트 2 〉	통과 (0.03ms, 76.2MB)
//    테스트 3 〉	통과 (0.73ms, 68.2MB)
//    테스트 4 〉	통과 (0.28ms, 76.3MB)
//    테스트 5 〉	통과 (6.02ms, 80.8MB)
//    테스트 6 〉	통과 (6.74ms, 82.1MB)
//    테스트 7 〉	통과 (9.36ms, 85.4MB)
//    테스트 8 〉	통과 (9.62ms, 84.2MB)
//    테스트 9 〉	통과 (15.69ms, 80.4MB)
//    테스트 10 〉	통과 (20.99ms, 96.3MB)
//    테스트 11 〉	통과 (19.52ms, 95.4MB)
//    테스트 12 〉	통과 (13.46ms, 97.4MB)
//    테스트 13 〉	통과 (0.11ms, 75.9MB)
//    테스트 14 〉	통과 (0.02ms, 72.7MB)

}
