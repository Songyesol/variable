package variable2;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("송솔");
		s1.setSdid(110017);
		s1.setEScore(44);
		s1.setMScore(50);
		s1.studentInfo();
		System.out.println(s1.totalScore()); 
		
		Student s2 = new Student();
		s2.setName("cz");
		s2.setSdid(88);
		s2.setEScore(99);
		s2.setMScore(77);
		s2.studentInfo();
		System.out.println(s2.totalScore()); 
	}

}


