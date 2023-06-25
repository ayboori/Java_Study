// lv.1 제일 작은 수 제거하기
package Test06.Test0616_P;

public class Jinhyuk {


    public int[] solution(int[] arr) {
        int[] answer = {};
        //리스트의 크기가 1이면
        if (arr.length == 1) {
            //배열의 크기가 1이고
            arr = new int[1];
            //그 값은 -1로 지정하며
            arr[0] = -1;
            //answer은 -1이 들어있는 배열 arr가 된다
            answer = arr;
            //리스트의 크기가 1이 아닌 2이상이면
        } else {
            //minNum이라는 최솟값이 들어갈 배열 숫자 하나를 정의하고
            int minNum = arr[0];
            //arr의 길이는 최솟값 하나가 빠지는 arr.length-1이 되며
            answer = new int[arr.length - 1];
            //for문을 돌려서 math.min함수를 통해 최솟값인 minNum을 찾아주고

            for (int i = 1; i < arr.length; i++) {

                minNum = Math.min(minNum, arr[i]);
            }
            int index = 0;
            //for문을 또 돌려서 나머지 숫자를 배열에 넣어줄 것 인데
            for (int i = 0; i < arr.length; i++) {
                //이때 또 if문을 안에 넣어서 최솟값에 해당하는 값을 빼준다.
                if (arr[i] != minNum) {
                    //arr에 제거한 나머지 값을 넣어주면
                    answer[index++] = arr[i];
                }
            }
        }
        return answer;
    }
}









