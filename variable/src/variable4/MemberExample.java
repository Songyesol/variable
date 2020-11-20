package variable4;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member();
		/*메소드의 매개값으로 넣는 값이기 때문에 대입의 의미인 '=' 사용하지않고 괄호사용*/
		m1.setMemberNo(1);
		m1.setMemberNM("송예솔");
		m1.setMemberNB("010-7424-9559");
		m1.setCls("필라테스");
		
		System.out.println(m1.getMemberNo());
		System.out.println(m1.getCls());
		
		System.out.println(m1);

		
		
		
		
		
		
		
	}

}
