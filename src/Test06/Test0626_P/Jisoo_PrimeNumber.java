package Test06.Test0626_P;

public class Jisoo_PrimeNumber {
	public static void main(String[] args) {
		Jisoo_PrimeNumber jp = new Jisoo_PrimeNumber();
		System.out.println(jp.isPrimeNumber(433_494_437L));
		System.out.println(jp.isPrimeNumber(2_971_215_073L));

	}

	public boolean isPrimeNumber(long n) {
		// 제곱수인지 판별하는 boolean
		boolean square = (int)Math.sqrt(n) * (int)Math.sqrt(n) == n;

		// 루트 n까지의 약수의 개수
		int numDivisor = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				numDivisor++;
			}
		}

		// 약수의 개수 구하기
		// 제곱수이면 2배-1을 해주고, 제곱수가 아니라면 두배를 해줍니다.
		if (square) {
			numDivisor = numDivisor * 2 - 1;
		} else {
			numDivisor = numDivisor * 2;
		}

		// 약수의 개수가 2개이면 소수. 그렇지 않으면 false.
		return numDivisor == 2 ? true : false;
	}
}
