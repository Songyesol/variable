package variable;

public class VariableExample2 {

	// 문장정렬 : ctrl + shift + f

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;

		int pencilPerstudent = pencils / students;
		System.out.println(pencilPerstudent);

		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}
