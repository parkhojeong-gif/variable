package variable;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 10;
		int result = num2 - num1;
		String resultStr = "결과값은 ";
		System.out.println(resultStr + result);
		if(num1 > num2) {
			result = num1 - num2;
			}else  {
				result = num2 - num1;
				
			}
		System.out.println(resultStr + result);
	}
	

}
