package variable;

public class MorningCode1 {
	public static void main(String[] args) {
		int[] numbers = { 23, 56, 34, 65, 28, 21 };
		int sum = 0;
		int i = 0;
		int s = 0;
		int sum2 = 0;
		double avg = 0;
		while (i < 6) {
			if (numbers[i] % 2 != 0) {
				sum += numbers[i];
				i++;

			} else {
				i++;
			}

		}
		System.out.println(sum);
		for(s = 0; s < numbers.length; s++) {
			sum2 += numbers[s];
			avg = sum2 / numbers.length;
			
			
		}System.out.println(avg);
		
		
		

	}// main
}// end  완료
