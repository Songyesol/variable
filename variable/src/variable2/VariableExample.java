package variable2;

public class VariableExample {

	public static void main(String[] args) {
		int num =10;
		String str = "Hello";
		double dbl = 3.4;
		
		String name = "Hong";
		int age=10;
		double height = 178.8;
		
		String name1 = "Hwang";
		int age1 =15;
		double height1 = 188.8;
	
	Person p1= new Person("choi", 20, 175.5, 72.4); //'person'클래스의 p1변수이름 
	/*생성자1*/
	System.out.println("p1의 이름: "+p1.getAge());
	System.out.println("p1의 나이: "+p1.getAge());
	System.out.println("p1의 키 : "+p1.getHeight());
	
	
	System.out.println("================================");
	//p1.name = "Hong"; //p1이 가지고 있는 name 필드 
	p1.setName("홍");
		//p1.age = 10;
	p1.setAge(17);
	//p1.height = 179.8;
	p1.setHeight(179.8);
	System.out.println("p1의 이름: "+p1.getName());
	System.out.println("p1의 나이: "+p1.getAge());
	System.out.println("p1의 키: "+p1.getHeight());
	p1.showInfo();
	
	Person p2= new Person(); //'person'클래스의 p1변수이름 
//	p2.name = "Hwang"; //p1이 가지고 있는 name 필드 
//	p2.age = 15;
//	p2.height = 188.8;
	p2.showInfo();
	
	Person p3= new Person(); // person의 구조를 본뜬 실체(p3)가 만들어지는데 그것을 인스턴스(instance)라고 부름 
	p3.showInfo();
	
	Person[] persons = {p1,p2,p3};
	for(Person per:persons) {
//		System.out.println(per.height);

	}
	
	
	
	
	
/*	System.out.println(p1.name);
	System.out.println(p2.age);
	System.out.println(p1.weight); *///값을 넣지않으면 초기값이 들어가있다
	
	
		
	}

}
