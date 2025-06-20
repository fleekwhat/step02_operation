package test.main;

import test.mypac.MemberDto;
import test.mypac.PostDto;

public class MainClass14 {
	
	public static void main(String[] args) {
		//객체 생성해서 default 생성자에 실행의 흐름이 들어오는지 확인 하기
		new MemberDto();
		MemberDto dto = new MemberDto();
		MemberDto dto2 = new MemberDto(1, "김구라", "노량진");
		
		MemberDto dto3 = new MemberDto();
		dto3.setNum(2);
		dto3.setName("해골");
		dto3.setAddr("행신동");
		System.out.println(dto2.getName());

		
	}
	
		
}
//생성자는 필요에 따라서 다른 모양으로 여러 개 정의 할 수도 있다.
