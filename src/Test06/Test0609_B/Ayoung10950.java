package Test06.Test0609_B;

import java.util.Scanner;

public class Ayoung10950 {
    public static void main( String[] args ) {
    	Scanner scanner = new Scanner(System.in);
    	while(scanner.hasNextInt()) {
        	int firstNum = scanner.nextInt();
        	int secondNum = scanner.nextInt();
        	System.out.println(firstNum + secondNum);
    	}
    }
}