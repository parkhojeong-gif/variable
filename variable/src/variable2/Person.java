package variable2;

public class Person { // person 이라는 클래스는 name,age,height의 데이터를 가지는 유형
	// 필드 = 데이터를 담는 역할
	private String name;
	private int age;
	private double height;
	private double weight;
	
	//생성자: 필드의 초기값 지정.
	public Person() {
		this.name ="초기이름";
		this.age = 0;
		this.height = 0.0;
		this.weight = 0.0;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	// 메소드 = 기능
	public void showInfo() {
		System.out.println("이름: " + name + " 나이: " + age + " 키: " + height + " 몸무게 : " + weight);
	}

	// 필드에 값을 저장, 불러오는 기능. set메소드
	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			this.age = 0;
	}

	public void setHeight(double height){
		this.height = height;
	}
	
	
	
}
