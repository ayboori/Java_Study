package Test06.Test0628_P;

// chatGPT에게 물어보고 만든 코드.
// 자바에서 소문자, 대문자, 공백으로 이루어진 랜덤의 문자열을 만들고 싶은데 어떻게 코드로 구현할 수 있을까?

import java.util.Random;

public class RandomStringGenerator {
    public static void main(String[] args) {
        int length = 10; // 생성할 문자열의 길이

        String randomString = generateRandomString(length);
        System.out.println(randomString);
    }

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int choice = random.nextInt(3); // 0, 1, 2 중에서 선택

            // choice 값에 따라 소문자, 대문자, 공백 중 하나를 선택하여 문자열에 추가
            if (choice == 0) {
                char lowercase = (char) (random.nextInt(26) + 'a');
                sb.append(lowercase);
            } else if (choice == 1) {
                char uppercase = (char) (random.nextInt(26) + 'A');
                sb.append(uppercase);
            } else {
                sb.append(' '); // 공백 추가
            }
        }

        return sb.toString();
    }
}

