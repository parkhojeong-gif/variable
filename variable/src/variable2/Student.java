package variable2;

public class Student { // 학생이름, 학번, 영어점수, 수학점수
	// 필드
	private String Sname;
	private int Scode;
	private double En;
	private double Math;
	// 메소드

	public Student(String sname, int scode, double en, double math) {
		this.Sname = sname;
		this.Scode = scode;
		this.En = en;
		this.Math = math;

	}
	public void setSName(String SName) {
		this.Sname = SName;
	}
	public void setSCode(int SCode) {
		this.Scode = SCode;
	}
	public void setEN(double EN) {
		this.En = EN;
	}
	public void setMAth(double MAth) {
		this.Math = MAth;
	}
	
	
	
	public double totalScore() {
		return En + Math;
		
	}
	
	
	
	
	public void studentInfo() {
		System.out.println("학생이름: " + Sname + " 학번: " + Scode + " 영어점수: " + En + " 수학점수 : " + Math);
	
	}



	public String getSname() {
		return this.Sname;
	}

	public int getScode() {
		return this.Scode;
	}

	public double getEn() {
		return this.En;
	}

	public double getMath() {
		return this.Math;
	}
}