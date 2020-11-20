package variable2;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student("Choi", 121212, 80, 70);
//		s1.name ="김민수";
//		s1.code = 123456;
//		s1.en = 77.5;
//		s1.math = 55.5;
//		
		Student s2 = new Student("Choi", 20, 175.5, 70.2);
//		s2.name ="이민수";
//		s2.code = 135790;
//		s2.en = 57.5;
//		s2.math = 75.5;

		Student s3 = new Student("Choi", 20, 175.5, 70.2);
//		s3.name ="박민수";
//		s3.code = 135550;
//		s3.en = 23.5;
//		s3.math = 35.5;
//		
//		Student[] students = {s1, s2, s3};
//		for(Student stu : students) {
//			
//			System.out.println(stu.학생이름);
//			System.out.println(stu.학번);
//			System.out.println(stu.영어점수);
//			System.out.println(stu.수학점수);
//		}
		s1.setSName("이창호");
		s1.setSCode(11111);
		s1.setEN(55.2);
		s1.setMAth(23.4);
	
		System.out.println("s1의 이름:"+s1.getSname());
		System.out.println("s1의 학번:"+s1.getScode());
		System.out.println("s1의 영어점수:"+s1.getEn());
		System.out.println("s1의 영어점수:"+s1.getMath());
		System.out.println("----------------------");
		s1.studentInfo();
		System.out.println(s1.totalScore());
		
		
		s1.studentInfo();
		
		
	}
}
