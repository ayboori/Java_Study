// lv.1 제일 작은 수 제거하기
package Test06.Test0616_P;

import java.util.Arrays;

public class Ayoung {
	public static class Solution {
	    public int[] solution(int[] arr) {
	        int[] answer = new int[arr.length-1]; // 입력받은 크기보다 한 칸 작게 배열 설정 (작은 값 하나 사라지니까)
	        int minNum = arr[0]; // 가장 작은 수 초깃값 설정
	        int j =0; // answer 배열을 위한 변수
	                
	        if (arr.length <= 1){ // 배열 길이가 1칸 이하일 경우
	            return new int[] {-1}; // 값이 -1인 배열 리턴
	        }else{ // 아닌 경우
	            for (int i=0; i<arr.length ; i++){ // 최솟값 구하기
	                if(minNum > arr[i]){
	                    minNum = arr[i];
	                }
	            }
	            
	            for(int i=0; i<arr.length; i++){ // 정답으로 리턴할 배열 설정
	                if(arr[i] != minNum){ // 가장 작은 숫자가 아닐 경우에만
	                    answer[j] = arr[i]; // 정답 배열에 값 세팅
	                     j++;
	                }
	            }                  
	        return answer;
	        }
	    	}
	    }
	    
	    public static void main(String args[]) {
	    	Solution solution = new Solution();
	    	// 테스트 케이스들
	    	int [] arr1 = {1,2,3,4};
	    	int [] arr2 = {3,7,4,8};
	    	int[] arr3 = {10};
	    	
	    	// 테스트 케이스들 문자열로 바꿔 출력
	    	System.out.println(Arrays.toString(solution.solution(arr1)));
	    	System.out.println(Arrays.toString(solution.solution(arr2)));
	    	System.out.println(Arrays.toString(solution.solution(arr3)));
	    }
}
