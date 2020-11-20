package variable6;

public class Member {
	private int memberNo;
	private String memberName;
	private String memberCall;
	private String memberClass;

	
	public Member(int memberNo, String memberName, String memberCall, String memberClass)
	{
		
	}
		
	

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberName=" + memberName + ", memberCall=" + memberCall
				+ ", memberClass=" + memberClass + "]";
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

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setMemberCall(String memberCall) {
		this.memberCall = memberCall;
	}

	public void setMemberClass(String memberClass) {
		this.memberClass = memberClass;
	}

	
}
