package test.main;

public class MainClass02 {
	
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		
		int kor = 95;
		int eng = 100;
		
		double avg = (kor + eng) / 2d;
		System.out.println(avg);
		
		String info = "평균:" + avg;
		String info2 = "국어:" + kor + " 영어:" + eng + " 평균:" + avg;
		System.out.println(info);
		System.out.println(info2);
	}
}
