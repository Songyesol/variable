package iteration;

public class MorningCode {
	public static void main(String[] args) {

		int sum7 = 0;
		int sum8 = 0;
		for(int i=0; i<=50; i++) {
			if(i%7==0) {
				sum7+=i;				
			} else if (i%8==0) {
				sum8+=i;
			} 			
			
		} 
		System.out.println("7의 배수의 합은 " + sum7);
		System.out.println("8의 배수의 합은 " + sum8);

		int i = 0;
		int sum9 = 0;
		int sum10 = 0;
		while (i <= 50) {
			if (i % 7 == 0) {
				sum9 += i;
			} else if (i % 8 == 0) {
				sum10 += i;				
			}
			i++;
		}
		System.out.println("7의 배수의 합은 " + sum9);
		System.out.println("8의 배수의 합은 " + sum10);
	} // 7과 8의 공통배수일때 탈출 나오는 부분이 빠져있음. 계산해보기 
}
