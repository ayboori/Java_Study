package Test07.Test0714_P;

public class Ayoung {

    int maxWidth = -1, maxHeight = -1; // 크기가 될 수 없는 값으로 세팅해두기
    public int solution(int[][] sizes) {

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) { // 가로가 세로보다 크면
                setMax(sizes[i][1], sizes[i][0]); // 큰 수를 가로로 세팅
            }else{
                setMax(sizes[i][0], sizes[i][1]); // 아닐 경우 그대로 세팅
            }
        }

        return maxWidth * maxHeight; // 크기 리턴
    }

    // 둘 중 더 큰 숫자로 max 값 세팅
    public void setMax(int width, int height) {
        if (maxWidth < width) {
            maxWidth = width;
        }
        if (maxHeight < height) {
            maxHeight = height;
        }
    }
}

/*
테스트 1 〉	통과 (0.02ms, 73.6MB)
테스트 2 〉	통과 (0.02ms, 70.2MB)
테스트 3 〉	통과 (0.02ms, 79.1MB)
테스트 4 〉	통과 (0.02ms, 76.9MB)
테스트 5 〉	통과 (0.03ms, 69MB)
테스트 6 〉	통과 (0.02ms, 74.5MB)
테스트 7 〉	통과 (0.03ms, 70.4MB)
테스트 8 〉	통과 (0.04ms, 76.8MB)
테스트 9 〉	통과 (0.02ms, 74.1MB)
테스트 10 〉	통과 (0.04ms, 80.9MB)
테스트 11 〉	통과 (0.04ms, 77.8MB)
테스트 12 〉	통과 (0.05ms, 78.9MB)
테스트 13 〉	통과 (0.14ms, 77.3MB)
테스트 14 〉	통과 (0.30ms, 78.6MB)
테스트 15 〉	통과 (0.31ms, 76.2MB)
테스트 16 〉	통과 (0.82ms, 84.9MB)
테스트 17 〉	통과 (1.04ms, 83.9MB)
테스트 18 〉	통과 (1.07ms, 83.7MB)
테스트 19 〉	통과 (1.14ms, 88.5MB)
테스트 20 〉	통과 (1.03ms, 86.3MB)
 */
