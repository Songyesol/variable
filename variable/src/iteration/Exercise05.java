package iteration;

public class Exercise05 {

	public static void main(String[] args) {
	
		for (int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				int result =(4*x)+(5*y);
				
				if(result == 60) {
					break;
				}
				System.out.println("("+x+","+y+")");
			} 
		} 

	}

}
