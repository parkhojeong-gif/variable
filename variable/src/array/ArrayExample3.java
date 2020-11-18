package array;

public class ArrayExample3 {

	public static void main(String[] args) {
		double result = 0;
		double[] doubleAry;
		doubleAry = new double[] {23.2, 55.3, 52.8, 62.8};
		result = doubleSum(doubleAry);
		System.out.println("결과값: " + result);
		System.out.println(23.2 + 55.3 + 52.8 + 62.8);

	}

	public static double doubleSum(double[] ary) {

		double sum = 0;
		for (double num : ary) {
			sum += num;
		}
		return sum;

	}public static double doubleAvg(double[] ary) {
		double avg = 0;
		double avg = double
	}

}