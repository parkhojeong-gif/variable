package method;

public class MethodExample {
	public static void main(String[] args) {
		Math m1 = new Math();
		double sum = m1.sum(10.5, 20);
		System.out.println("결과: " + sum);
		double a = m1.getArea(5.5);
		System.out.println("결과: " + a);
		System.out.println(5.5*5.5*3.14);
		// 정사각형 넓이: getRectagle, 매개변수: 4.2
		double c = m1.getRectangle(4.2);
		System.out.println("결과: " + c);
		double b = m1.getRectangle(4.2, 2.4);
		System.out.println("결과: " + b);
		// 직사각형 넓이: getRectagle, 매개변수: 4.2, 2.4
		int[] numbers = {5,10,15}; //배열 선언 타입[] 변수명 = {변수 값};
		int d = m1.getArySum(numbers);
		System.out.println(d);
		int f = m1.getArySum(new int[] {10,2,2}); //배열선언
		System.out.println(f);
		Person p1 = new Person("이창호", 10, 135.5, 32.5); // 적정 무게 메소드
		double d1 = m1.getProperWeight(p1);
		System.out.println(d1);
		if(p1.weight > d1) {
			System.out.println("비만");
			}else if(p1.weight == d1) {
				System.out.println("보통");
			}else {
				System.out.println("멸치");
			}
	
	
	}
}
