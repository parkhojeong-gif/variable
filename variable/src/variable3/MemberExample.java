package variable3;

public class MemberExample {
	public static void main(String[] args) {
// 회원번호1, 회원이름 홍길도, 회원전화번호010-2233-2232 
// 강좌명: 스포츠댄스 / 수영
		Member m1 = new Member();
		Member m2 = new Member();
		m1.number = 1;
		m1.name = "홍길동";
		m1.call = "010-1234-1234";
		m1.className = "스포츠댄스/수영";
		m1.showMemberInfo();
		
		m2.number = 2;
		m2.name = "김민수";
		m2.call = "010-2323-1414";
		m2.className = "야구/수영";
		m2.showMemberInfo();
		
		Member[] members = {m1,m2};
		
		for(Member mem : members) { //Member클래스를 mem으로 치환
			mem.showMemberInfo();
			
		}
	}
}
