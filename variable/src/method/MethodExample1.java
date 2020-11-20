package method;

public class MethodExample1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.drawRectagle();
		String result = r1.getRectangle();
		System.out.println("결과: " + result);
		r1.drawShape("ㅇㅇ");
	}
}
커스텀(100) 배열
1계좌생성 이름 계좌번호 금액 
2. 전체리스트  
3.입금   계좌번호 111인 사람한테 입금하기 입급할 계좌를 입력 하고 111입력 후 입금할 금액 1500입금하는 기능
4.출금  위와동일
5. 종료