package condition;

public class ConditionExample {
	public static void main(String[] args) {
		int score = 56;
		String grade = "";
		
		if(score >= 90) {
			grade ="A";
		} else if (score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade ="D";
		} else if (score >= 50) {
			grade = "F";
		}
		System.out.println(score + "점은" + grade + "입니다.");
		
	
	}

}

