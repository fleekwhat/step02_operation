package test.main;

/*
 * 2.증감 연산자 테스트
 * 	 변수에 있는 숫자 값을 1씩 증가 혹은 1씩 감소 시킬 때 사용한다.
 * 	 ++, --
 */

public class MainClass02 {
	
	public static void main(String[] args) {
		int num = 0;
		num++;
		num++;
		num++;
		System.out.println(num);
		
		int num2 = 0;
		num2--;
		num2--;
		num2--;
		System.out.println(num2);
		
		int num3 = 0;
		int result1 = num3++;
		System.out.println(result1);
		
		int num4 = 0;
		int result2 = ++num4;
		System.out.println(num4);
	}
}
