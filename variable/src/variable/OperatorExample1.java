package variable;

public class OperatorExample1 {
	public static void main(String[] args) {
		String str = "Hello";
		str += "World";
		System.out.println(str);

		int num1 = 10;
		num1 += 5;
		num1 -= 3; // 12
		num1 *= 5; // 60
		num1 /= 6; // 10
		System.out.println(num1);

		int num2 = 10;
		num2++; // 1을 증가시킴
		num2--; // 1을 뺌
		num2--;
		num2--;
		num2--;
		num2--;
		System.out.println("num2: " + num2);

		int num3 = 10;
		num3 -= 5;
		num3 -= 5;
		num3 -= 5;
		num3 += 15;
		if (num3 > 0) {
			System.out.println("num3은 0보다 큽니다.");

		} else if (num3 < 0) {
			System.out.println("num3은 0보다 작습니다.");
		} else {
			System.out.println("num3은 0입니다.");
		}
		int num4 = 30;
		num4 /= 2;
		num4 /= 2;
		num4 /= 2;
		num4 /= 2;
		num4 /= 2;
//		if (num4 % 2 == 0) {
//			System.out.println("num4는 짝수입니다.");
//		} else {
//			System.out.println("num4는 홀수입니다.");
//		}

		boolean result = true;
		String result1 = (num4 % 2) == 0 ? "True" : "False"; // 0이면 첫번째 값이 0을 반환 참이 아니면 두번째 값을 반환
		System.out.println(result1);
	}

}
