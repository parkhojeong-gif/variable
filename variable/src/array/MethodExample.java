package array;

public class MethodExample {
	public static void main(String[] args) {
// 두수를 더해서 2로 나누고 50 더하고 다시 10 나눔.
		int num1, num2, result;
		num1 = 34;
		num2 = 55;
		result = sumMethod(num1, num2);
		System.out.println(result);
		int val1 = 22, val2 = 54;
		result = sumMethod(val1, val2);
		System.out.println(result);
		int val3 = 23, val4 = 55;
		result = sumMethod(val3, val4);
		System.out.println(result);
		int val5 = 24, val6 = 56;
		result = sumMethod(val5, val6);
		System.out.println(result);
		int val7 = 25, val8 = 57;
		result = sumMethod(val7, val8);
		System.out.println(result);
	}

	public static int sumMethod(int numb1, int numb2) {
		int result = numb1 + numb2;
	result = result / 2;             //메소드 정의하여 복잡한 연산을 정의
	result = result + 50;
	result = result / 10;
	return result;
		
	}// main
}
