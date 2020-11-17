package variable;

public class DataTypeExample {
	public static void main(String[] args) {
		byte num1 = 12;
		short num2 = 128;
		int num3 = 1000000000;
		long num4 = 10000000000000L;

		byte vall = 10;
		num3 = vall; // promotion 자동으로 형변환해줌

		byte result = (byte) (num1 + vall); // casting 형변환 강제로 함
		num1 = 120; // -128 ~ 127

		for (int i = 0; i < 20; i++) {
			System.out.println(num1++);
		}

		char char1 = 66; // 65 a 66 b 숫자를 담을 수 있눈 문자 표현
		for (int i = 0; 1 < 26; i++)
			System.out.println(char1++);
		
		float floatVal = 4.567F; //
		double doubleVal = 3.4567;// 둘다 실수형이지만 더블을 기준
		
	    
	} //main
} //end
