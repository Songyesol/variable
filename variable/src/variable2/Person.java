package variable2;

public class Person {

	// 필드
	// private 외부에서 접근하지 못하도록 숨기겠다는 선언
	// 필드에 직접 입력하는 방법을 막고 메소드를 통해 입력하게 하는 것이 대부분
	private String name;
	private int age;
	private double height;
	private double weight;

	// 생성자1 : 필드의 초기값 지정 (클래스 이름을 따라서 만들어진 메소드 / 필드에 값을 저장하는 기능)
	// 특징 : 반환타입이 없음 
	public Person() {
		this.name = "초기이름";
		this.age = 10;
		this.height = 170.0;
		this.weight = 65.0;
	}
	//생성자2
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height= height;
		this.weight=weight;
	}
	
	
	// 메소드
	// public 다른 클래스에서 공공연하게 접근이 가능하다는 선언
	// void 반환값이 없음 (return이 없다는 뜻)
	public void showInfo() {
		System.out.println("이름: " + name + " " + "나이: " + age + " 키: " + height);
	}

	// 필드에 값을 저장, 불러오는 기능
	public void setName(String name) {
		this/* 클래스의 필드 */.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			this.age = 0;

	}

	public int getAge() {
		return this.age;
	}

	public double getHeight() {
		return this.height;

	}

	public void setHeight(double height) {
		this.height = height;

	}
}
