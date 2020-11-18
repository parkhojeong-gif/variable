package array;

public class MethodExample1 {
	public static void main(String[] args) {
		showInfo("45");
		int result = showDouble(45);
		System.out.println("반환값: " + result);
		System.out.println("반환: " + divide(33, 10));
		int z = 10;
		int x = 15;
		if (z > x) {
			System.out.println("반환: " + divide(z, x));
		} else {
			System.out.println("z는 x보다 작습니다.");
		}

	}

	public static void showInfo(String name) { // String name 매개변수
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	public static double showDouble(double num) {
		return num * 2;
	}

	public static int showDouble(int num) {
		return num * 2;
	}

	// 정수형 변수 2개를 받아서 두수의 합을 반환해주는 메소드(sum)
	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	// 정수형 변수 3개를 받아서 세수의 곱을 반환 메소드(multi)
	public static int multi(int d, int e, int f) {
		int result1 = 0;
		result1 = d * e * f;
		return result1;

	}

	// double 2개를 받아서 첫번째 매개변수/ 두번째 매개변수 (divide)
	public static double divide(double z, double x) {
		double result2 = 0;
		result2 = z / x;
		return result2;

	}

}
