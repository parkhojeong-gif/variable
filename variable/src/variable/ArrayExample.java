package variable;

public class ArrayExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int[] numbers = { 10, 20, 30, 40, 50 }; // <-여러가지 값을 담을 수 있음
		numbers[1] = 200; // 중간에 값을 대입하여 넘버즈안에 있는 값 변경 가능
		System.out.println(numbers[1]); // numbers[%] %의 값은 위치값 0~

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
			sum += numbers[i];
		}
		System.out.println("합: " + sum);

		String[] strings = { "Hello ", "World ", "Good ", "to ", "meet " }; //문자열 배열 
		strings[2] = "Nice ";
		strings[6]  = "you";
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]);
		}
	}// main
}// end
