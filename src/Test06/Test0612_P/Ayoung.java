// 최댓값과 최솟값

package Test06.Test0612_P;

public class Ayoung {

	 // 예시를 이용하여 solution 메서드를 잘 구현했는지 확인하는 main 메서드
    public static void main( String[] args ) {
        Ayoung ay = new Ayoung();

     // 프로그래머스 문제에서 나오는 예제들
        String t1 = "1 2 3 4";
        String t2 = "-1 -2 -3 -4";
        String t3 = "-1 -1";

        System.out.println( ay.solution( t1 ) );
        System.out.println( ay.solution( t2 ) );
        System.out.println( ay.solution( t3 ) );
    }

        public String solution(String s) {
            String [] cutter = s.split(" "); // 입력받은 스트링을 자르는 함수다
            
            String answer = min(cutter) + " " + max(cutter);  // 최소, 최대값 함수를 답변 문자열에 삽입한다
            return answer;
        }
        
        public int max(String [] inputNum){ // 최댓값을 구하는 함수
            int maxNum = Integer.parseInt(inputNum[0]); // 배열의 첫번째 값을 int로 변경해서 비교할 값 세팅
            try{
                for(String a : inputNum){
                    int compareNum = Integer.parseInt(a); // 비교할 숫자를 숫자로 변환함 
                    if(maxNum < compareNum){
                        maxNum = compareNum;
                    } // 값을 비교하여 더 큰 수를 maxNum에 대입
                }
            }catch (NumberFormatException ex){
                ex.printStackTrace();
            }
            return maxNum; // 구해온 최댓값 maxNum을 리턴
        }
        
        public int min(String [] inputNum){
            int minNum = Integer.parseInt(inputNum[0]);
            try{
                for(String a : inputNum){
                    int compareNum = Integer.parseInt(a);
                    if(minNum > compareNum){
                        minNum = compareNum;
                    }
                }
            }catch (NumberFormatException ex){
                ex.printStackTrace();
            }
                
            return minNum;
        }
    
}