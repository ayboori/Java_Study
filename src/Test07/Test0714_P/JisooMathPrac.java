package Test07.Test0714_P;

public class JisooMathPrac {
	public static void main(String[] args) {
		// 절대값
		System.out.println(Math.abs(-10.0)); // 10.0
		System.out.println(Math.abs(-10)); // 10

		// 소수 첫째 자리에서 올림
		System.out.println(Math.ceil(10.1)); // 11.0
		System.out.println(Math.ceil(-10.1)); // -10.0
		System.out.println(Math.ceil(10.000015)); // 11.0

		// 소수 첫째 자리에서 버림
		System.out.println(Math.floor(10.8)); // 10.0
		System.out.println(Math.floor(-10.8)); // -11.0

		// 0보다 크거나 같고 1보다 작은 double return.
		System.out.println(Math.random()); // 0.6968283775002195
		System.out.println(Math.random()); // 0.8194208942217567
		System.out.println(Math.random()); // 0.10117044630545224

		// 주어진 double 값과 가장 가까운 정수값을 double로 return
		// 단 .5는 가까이 있는 짝수를 반환
		System.out.println(Math.rint(1.2)); // 1.0
		System.out.println(Math.rint(2.6)); // 3.0
		System.out.println(Math.rint(3.5)); // 4.0
		System.out.println(Math.rint(4.5)); // 4.0

		// 소수점 첫째 자리에서 반올림한 정수값(long)을 반환.
		System.out.println(Math.round(1.2)); // 1
		System.out.println(Math.round(2.6)); // 3
		System.out.println(Math.round(3.5)); // 4
		System.out.println(Math.round(4.5)); // 5

		// n째 자리에서 반올림, 올림, 버림하고 싶다고 가정할 때,
		// Math.round(d * Math.pow(10, n - 1)) / Math.pow(10, n - 1);를 해 보면 된다!

		// ex.
		// 내가 셋째 자리에서 반올림하고 싶다!!
		// 90.7558 -> 90.76 이 되게끔 하고 싶다!
		double d = 90.7552;
		System.out.println(Math.round(d * 100) / 100.0); // 90.76
		System.out.println(Math.ceil(d * 100) / 100.0); // 90.76
		System.out.println(Math.floor(d * 100) / 100.0); // 90.75

		// 거듭제곱, double 로 return
		System.out.println(Math.pow(3, 3)); // 3의 3제곱 -> 27.0

		// 제곱근
		System.out.println(Math.sqrt(17)); // 17의 제곱근 -> 4.123105625617661

	}
}
