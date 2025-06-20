package test.main;

import test.mypac.MemberDto;

public class MainClass13 {
	
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
			dto.setNum(1);
			dto.setName("김도현");
			dto.setAddr("중랑구");
			System.out.println("번호: " + dto.getNum() + " 이름: " + dto.getName() + " 주소: " + dto.getAddr());
			
			//dt 의 getter 메소드를 호출해서 리턴되는 값을 변수에 연습삼아 담아보
			int num = dto.getNum();
			String name = dto.getName();
			String addr = dto.getAddr();
			System.out.println(num);
			System.out.println(name);
			System.out.println(addr);
			
	}
}
