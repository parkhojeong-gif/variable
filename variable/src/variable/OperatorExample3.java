package variable;

public class OperatorExample3 {

	public static void main(String[] args) {

		int num1 = 3;
		String sd = "나머지는 홀수입니다";
		String dd = "나머지는 짝수입니다";
		/*
		 * int result = 0; // 짝수:0. 홀수:1
		 */ // 1) if 구문
			// 2) ? : 구문

		if (num1 % 2 == 0) {
			System.out.println(dd);
		} else {
			System.out.println(sd);
		}
		String result1 = (num1 % 2) == 0 ? "0" : "1";
		System.out.println(result1);
		boolean result3 = true;                           //boolean 트루펄스 선언 이후 나머지값이 참인지 아닌지를 식써야함
		 result3 = (num1 % 2 == 0) ? true : false;   //불린 선언이후 트루펄스만 사용가능 숫자사용시 스트링타입으로 변경해야함
		System.out.println(result3);
	
		int num3 = 15;
		String q = "짝수";
		String e = "홀수";
		
		if(num3 % 2 == 0) {
			System.out.println(q);
		} else {
			System.out.println(e);
		
		}

	
	
	}

	
	
}
