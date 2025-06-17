package test.main;

public class MainClass10 {

	/*
	 * 3항 연산자
	 * 
	 * 조건 ? 값1 : 값2
	 */
	
	public static void main(String[] args) {
		boolean isWait = false;
		String result = isWait ? "기다려요" : "기다리지 않아요";
		System.out.println(result);
		
		String result2 = null;
		if (isWait) {
			result2 = "기다려요";
		} else {
			result2 = "기다리지 않아요";
		}
		System.out.println(result2);
		
		boolean i = 1 + 2 == 2;
		int result3 = i ? 1 : -1;
		
		System.out.println(result3);
	}
}
