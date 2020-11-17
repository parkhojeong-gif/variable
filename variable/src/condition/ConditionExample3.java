package condition;

public class ConditionExample3 {
	public static void main(String[] args) {
		//int randomValue = (int) (Math.random() * 5) + 1; // 0부터 5사이의 임의 숫자 출력 int형이라서 정수만 출력
		//System.out.println(randomValue); // 0< ramdom < 1

		int num = (int)(Math.random()*6) + 2
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		 default :
			System.out.println("6번이 나왔습니다.");
			break;
			
		}
		
		
		
		
}
}