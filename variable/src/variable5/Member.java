package variable5;

public class Member {
	private int memberNo;
	private String memberName;
	private String memberCall;
	private String memberClass;
	
	public Member() {// 기본생성자:매개변수X
		
	}
	public Member(int memberNo, String memberName, String memberCall, String memberClass) {
	this.memberNo = memberNo;
	this.memberName = memberName;
	this.memberCall = memberCall;
	this.memberClass = memberClass;
	}
	
	public Member(int memberNo, String memberName) {
		this.memberNo = memberNo;
		this.memberName = memberName;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getMemberCall() {
		return memberCall;
	}
	public String getMemberClass() {
		return memberClass;
	}

}
