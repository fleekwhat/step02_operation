package test.main;

import java.io.PrintStream;

import test.auto.Car;
import test.util.MyUtil;

public class MainClass06 {
	
	public static void main(String[] args) {
		//c1 은 null 이다.
		Car c1 = MyUtil.car;
		//Car 객체를 생성해서 MyUtil 클래스의 car 라는 필드에 담
		MyUtil.car = new Car();
		//c1 은 위에서 생성한 car 객체의 참조값이 들어 있다.
		Car c2 = MyUtil.car;
		c2.drive();
		c2.name = "소나타";
		//MyUtil클래스의 car 라는 필드를 직접 참조해서 drive() 메소드를 
		//호출 할 수도 있다.
		c2.drive();
		MyUtil.car.drive();
		
		PrintStream p = System.out;
		
		p.println("xxx");
		
	}
}
