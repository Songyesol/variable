package variable6;

public class Member {
	private int memberNO;
	private String memberNM;
	private String memberNB;
	private String cls;
	
	public Member (int memberNO, String memberNM) {
	this.memberNO = memberNO;
	this.memberNM = memberNM;
	}	
	public Member(int memberNO, String memberNM, String memberNB, String cls) {
		this.memberNO = memberNO;
		this.memberNM = memberNM;
		this.memberNB = memberNB;
		this.cls = cls;
	}

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
	@Override
	public String toString() {
		return "Member [memberNO=" + memberNO + ", memberNM=" + memberNM + ", memberNB=" + memberNB + ", cls=" + cls
				+ "]";
	}
	
	
}

