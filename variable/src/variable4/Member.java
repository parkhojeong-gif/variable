package variable4;

public class Member {
	private int number;
	private String name;
	private String call;
	private String className;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Member [회원번호: " + number + ", 회원이름: " + name + ", 전화번호: " + call + ", 강의명: " + className + "]";
	}
	
	
	
}
