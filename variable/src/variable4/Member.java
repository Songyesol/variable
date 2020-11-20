package variable4;

public class Member {
	private int memberNo;
	private String memberNM;
	private String memberNB;
	private String cls;
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberNM() {
		return memberNM;
	}
	public void setMemberNM(String memberNM) {
		this.memberNM = memberNM;
	}
	public String getMemberNB() {
		return memberNB;
	}
	public void setMemberNB(String memberNB) {
		this.memberNB = memberNB;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}


	public void showInfo() {
		System.out.println("학생번호: "+ memberNo +",학생이름: "+ memberNM);
	}
	@Override
	public String toString() {
		return "Member [회원번호:" + memberNo + ", 회원이름:" + memberNM + ", 연락처:" + memberNB + ", 강좌:" + cls
				+ "]";
	}
	
	
}
