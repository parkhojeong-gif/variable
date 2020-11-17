package condition;

public class ConditionExample2 {
	public static void main(String[] args) {
		int score = 57;
		score /= 10;
		String grade = "";
		switch (score) {
		case 9:
		case 8:
			grade = "양호";
			break; // 케이스에 만족하면 브레이크라는 함수로 멈춰서 출력 브레이크구문이 없으면
		case 7:
		case 6:
			grade = "보통";
			break;
		default: // 해당되는 값이 없으면 디폴트 값으로 출력 =else와 의미가 비슷 
			grade = "미흡";
			break;
		}
		System.out.println(score * 10 + "점은" + grade + "입니다.");

	}

}
