package variable5;

public class MemberExample {

	public static void main(String[] args) {
		
		Member m1 = new Member() ;
		System.out.println("회원이름: "+m1.getMemberNM()); 
		
		Member m2 = new Member(1,"Hong", "010-1234-5678", "수영") ;
		System.out.println("회원이름: " + m2.getMemberNM());
		
		Member m3 = new Member(2, "Hwang");
		System.out.println("회원이름: "+ m3.getMemberNB());
	}

}
