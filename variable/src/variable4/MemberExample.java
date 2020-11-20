package variable4;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setNumber(1);
		m1.setName("박민수");
		m1.setCall("010-2222-2222");
		m1.setClassName("스포츠댄스");
		
		System.out.println(m1.getNumber());
		System.out.println(m1.getName());
		System.out.println(m1.getCall());
		System.out.println(m1.getClassName());
		System.out.println(m1);
	}
}
