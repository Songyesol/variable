package variable3;

public class MemberExample {
	public static void main(String[] args) {

		Member m1 = new Member();
		m1.memberNo = 1;
		m1.memberNM = "송예솔";
		m1.memberNB ="010-7424-9559";
		m1.cls = "폴댄스";
		m1.showMemberinfo();
		
		Member m2= new Member();
		m2.memberNo = 2;
		m2.memberNM = "김유진";
		m2.memberNB = "010-7142-6359";
		m2.cls = "수영";
		m2.showMemberinfo();
		
		Member[] members = {m1,m2};
		for(int i=0; i<members.length; i++) {
			members[i].showMemberinfo();
		}

		
	}

}
