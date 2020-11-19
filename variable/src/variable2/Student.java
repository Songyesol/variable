package variable2;

public class Student {

	// 필드
	private String name;
	private int sdid;
	private int mScore;
	private int eScore;

	// 메소드
	public void setName(String name) {
		this.name = name;
	}

	public void setSdid(int sdid) {
		this.sdid = sdid;
	}

	public void setMScore(int mScore) {
		this.mScore = mScore;
	}

	public void setEScore(int eScore) {
		this.eScore = eScore;
	}

	public void studentInfo() { // 반환값이 없음
		System.out.println("이름:"+name+", 학번:"+sdid+"입니다.");
	}
	public int totalScore() { // 반환값,타입 있음
		return mScore+eScore;
	}
}
