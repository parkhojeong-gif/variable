package condition;

public class ConditionExample1 {
	public static void main(String[] args) {
		int score = 76;
		String grade = "";
// if 와 else if 차이는 if  만족하는 구간이 다맞으면 다 실행됨
		// if 구문안에 if 사용 가능
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}

		else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score >= 60) {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		} else if (score < 60) {
			grade = "F";
		}
		System.out.println(score + "점은" + grade + "입니다.");

	}

}
