package test.main;

import test.mypac.MemberInfo;

public class MainClass09 {
	
	public static void main(String[] args) {
		/*
		 *  1. 한명의 회원 정보를 MemberInfo 객체에 담아 보세요.
		 *  (번호, 이름, 주소 는 본인 마음대로 설정해서)
		 */
		MemberInfo mem1 = new MemberInfo();
		mem1.num = 1;
		mem1.name = "김도현";
		mem1.addr = "묵동" ;
		
		mem1.printData();
	}	
}
