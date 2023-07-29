// 문자열 내 마음대로 정렬하기
package Test07.Test0728_P;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Donghwan {
    public static void main(String[] args) {
        Donghwan donghwan = new Donghwan();

        String[] strings = {"sun", "bed", "car"};
        String[] strings1 = {"cbce", "abcd", "cdx"};

        System.out.println(Arrays.toString(donghwan.solution(strings,1)));
        System.out.println(Arrays.toString(donghwan.solution(strings1,2)));

    }
    public String[] solution(String[] strings, int n) {
        char[] chars = new char[strings.length]; // n번째로 받는 알파벳을 사전순으로 정렬하기 위한 char[] 생성
        List<String> answer = new ArrayList<>(); // String 배열은 값 중복방지 조건문에서 null exception이 뜨기때문에 ArrayList 생성

        for (int i =0; i< strings.length; i++) {
            chars[i]=strings[i].charAt(n); // i번째 strings에서 charAt을 이용해 n번째에 위치한 알파벳을 뽑아와 chars에 넣어주기
        }

        Arrays.sort(chars); // sort를 이용해 뽑아온 알파벳을 사전순으로 정렬
        Arrays.sort(strings); // strings도 같이 사전순으로 정렬해줘야 중복되는 알파벳이 있을때 사전순으로 정렬되기 때문에 sort 진행

        for (int i =0; i<chars.length; i++) {
            for (int j = 0; j <strings.length; j++) {
                String string = strings[j]; // j번째 strings를 뽑아와 string에 입력
                if (string.charAt(n)==chars[i]) { // 뽑아온 string을 charAt을 사용해 chars에 담겨있는 알파벳들과 대조
                    if (!answer.contains(string)){ // 값이 중복되는 문제를 해결하기 위해 contains를 사용해 중복방지
                        answer.add(string); // 중복이 안된 string은 생성해준 ArrayList answer에 add
                    }
                }
            }
        }
        String[] stringArr = new String[answer.size()]; // 만들어준 ArrayList를 String[]로 변환해주기 위해 String[] 생성
        stringArr = answer.toArray(stringArr); // 만들어준 String[]에 answer.toArray를 사용하여 값 넣어주기

        return stringArr;
    }
}
//        Troubleshooting
//        1.같은 알파벳을 가지는 string이 있을 경우 answer에 값이 중복돼서 생기는 일이 발생 (contains을 통해 중복방지 해결)
//        2.원래 알파벳과 대조하는 조건문을 indexOf를 사용해 알파벳이 위치하는 인덱스 위치와 n값으로 넣어준 인덱스 위치가 동일 시 add를 해줬었다.
//          예를 들어 대조하는 알파벳이 cbce이고 n이 2라고 가정했을때 c가 중복되어 있기 때문에 indaxOf는 앞에 c를 반환해 조건문이 false가 됐다. (charAt으로 해결)
//        3.같은 알파벳을 가졌을 시에 사전 순으로 정렬해야된다는 제한 조건이 있어 if문 중간에 sort를 해줬지만 ArrayList는 sort가 불가능 (대조하기 전 미리 strings를 sort 해줘 해결)


//        테스트 1 〉	통과 (0.77ms, 74.7MB)
//        테스트 2 〉	통과 (0.64ms, 73.6MB)
//        테스트 3 〉	통과 (0.74ms, 73.9MB)
//        테스트 4 〉	통과 (1.02ms, 85.2MB)
//        테스트 5 〉	통과 (0.70ms, 79.9MB)
//        테스트 6 〉	통과 (0.86ms, 75.7MB)
//        테스트 7 〉	통과 (0.71ms, 70.3MB)
//        테스트 8 〉	통과 (0.66ms, 75.3MB)
//        테스트 9 〉	통과 (0.63ms, 73.1MB)
//        테스트 10 〉	통과 (1.63ms, 79.7MB)
//        테스트 11 〉	통과 (0.90ms, 76.1MB)
//        테스트 12 〉	통과 (1.67ms, 73.3MB)
