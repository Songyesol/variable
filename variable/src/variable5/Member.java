package variable5;

public class Member {
	//필드
	private int memberNO;
	private String memberNM;
	private String memberNB;
	private String cls;
	
	public Member() { //매개변수가 없는 생성자: 기본생성자
	}
	//생성자
	public Member(int memberNO, String memberNM) {
		this.memberNO = memberNO;
		this.memberNM = memberNM;
	}


	public Member(int memberNO, String memberNM, String memberNB,String cls) {
		this.memberNO = memberNO;
		this.memberNM = memberNM;
		this.memberNB = memberNB;
		this.cls = cls;
	}
	//메소드
	public int getMemberNO() {
		return memberNO;
	}
	public String getMemberNM() {
		return memberNM;
	}
	public String getMemberNB() {
		return memberNB;
	}
	public String getCls() {
		return cls;
	}
	
}
