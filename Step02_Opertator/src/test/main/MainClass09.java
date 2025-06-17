package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		
		int dosum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				dosum += i;
			}
		}
		System.out.println("1~100까지 숫자 중에 짝수만 더한 값:" + dosum);
		
		
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
	}
}
