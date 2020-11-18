package array;

public class ArrayExample4 {
	public static void main(String[] args) {

		int num1 = 40, num2 = 20, num3 = 30;
		// 세변수에 들어 있는 값중 가장 큰 값을
		int i = 0;
		if (num1 > num2 && num1 > num3) {
			i = num1;
		} else if (num2 > num1 && num2 > num3) {
			i = num2;
		} else if (num3 > num1 && num3 > num2) {
			i = num3;
		}

		System.out.println("큰 수는: " + i);
		int temp = 0;
		int[] intAry = {34, 25, 57, 39, 55};
		for(int num : intAry) {
			if(temp < num) {
			temp = num; 	
			}
	}
		System.out.println("큰 수는: "+ temp);
}
}