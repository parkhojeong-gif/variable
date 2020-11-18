package array;

public class ArrayExamlpe1 {
	public static void main(String[] args) {
		int[] intAry;
		int sum = 0;
		intAry = new int[] { 34, 66, 82 }; // 이어서 쓸경우 new 타입을 적어 알려야함
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[1];
		}
		System.out.println("결과값1: " + sum);
		sum = 0;
		sumAry(intAry);
		System.out.println("결과값2: " + sum);
		sum = 0;
		int[] intAry2 = { 11, 22, 33, 44, 55, 66, 77 };
		sum = sumAry(intAry2);
		System.out.println("결과값3: " + sum);
	}// main

	public static int sumAry(int[] ary) {
		int sum = 0;
		for(int num:ary) {
			sum += num;
		}
		return sum;
	}
}
