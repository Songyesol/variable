package iteration;

public class ForExample {

	public static void main(String[] args) {
	// for 반복문 - for(초깃값; 조건식; 증감치)
		int sum = 0;
		for (int i = 0; i < 10; i++) { // 반복조건식
			sum += 10; 
	// 반복조건식이 성립하면 이 문장을 실행.조건식이 끝나면 문장을 빠져나감.
			System.out.println("i : " + i); // for 구문안에서 i값이 변하는 것을 나열해서 보여줌
			System.out.println("sum" + sum);
		}
		System.out.println(sum); //ln은 줄바꿈

	}
}