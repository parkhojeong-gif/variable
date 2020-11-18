package array;

public class ArrayExample2 {
	private void mian(String[] args) {
		double result = 0;
		double[] doubleAry;
		doubleAry = new double[] { 23.2, 55.3, 52.8, 62.8, };
//메소드 호출
		result = doubleSum(doubleAry);
		System.out.println("결과값: " + result);
	}

// double[] => 23.2, 55.3, 52.8, 62.8 : dAry
// method: doubleSum(), 매개변수 : double[]
// 반환해주는 값: double.
	public static double doubleSum(double[] ary);

	double sum = 0;for(
	double num:ary)
	{
		sum += num;
	}return sum;

}
