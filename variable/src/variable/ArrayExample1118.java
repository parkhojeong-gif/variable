package variable;

public class ArrayExample1118 {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		intAry[0] = 15;
		intAry[4] = 33;
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}

		double[] doubleAry;
		doubleAry = new double[] {2.3, 2, 4.5, 2.2, 1.6}; //두라인의 걸쳐 쓰는 방법
		System.out.println(doubleAry[0]);
		double sum = 0;
		for(int i=0; i<doubleAry.length; i++) {
			sum += doubleAry[i];
		}System.out.println("sum: "+ sum);
		
		// enhanced for 
		sum = 0;
		for(double db1 : doubleAry) {        //크기에 들어있는 갯수만큼 반복문
			sum += db1;
			System.out.println(db1);
		}System.out.println("sum: "+ sum);
			
	}//main
}
