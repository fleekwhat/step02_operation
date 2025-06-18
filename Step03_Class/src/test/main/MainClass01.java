package test.main;

import java.io.File;
import java.io.IOException;
// java.util 패키지에 있는 Random 클래스를 import
import java.util.Random;
import java.util.Scanner;

public class MainClass01 {
	
	public static void main(String[] args) throws IOException {
		//기본 데이터 type 의 값이 담길 수 있는 빈 공간은 만들 수 없다.
		//int num = null;
		int num; //선언만 하면 변수가 만들어지지 않는다. (만들어질 준비만 한다)
		
		//문자열을 다룰 때는 String type 을 사용하면 된다.
		String name = "kim";
		//랜덤한 숫자를 얻어내고 싶다면? 랜덤한 숫자를 생성해주는 기능을 가지고 있는 객체가 필요하다.
		Random ran = null;
		ran = new Random();
		boolean randomBool = ran.nextBoolean();
		
		System.out.println(randomBool);
		Random ran2 = new Random();
		int randomInt = ran2.nextInt();
		System.out.println(randomInt);
		
		Random ran3 = new Random();
		int randomByte = ran3.nextInt(10);
		System.out.println(randomByte);
		
		
		
		
		//콘솔창에 문자열을 출력하고 싶다면? 콘솔창에 문자열을 출력해 주는 기능을 가지고 있는 객체가 필요하다.
		
		//파일 시스템에 memo.txt 파일을 만들고 싶다면? 파일을 만들 수 있는 기능을 가지고 있는 객체가 필요하다.
//		File f = new File();
//		f.createNewFile();
		
		//콘솔창에 입력한 숫자나 문자열을 읽어들이고 싶다면? 콘솔창에서 입력한 내용을 이용해서 int 나 String 을
		//만들어내는 기능을 가지고 있는 객체가 필요하다.
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
