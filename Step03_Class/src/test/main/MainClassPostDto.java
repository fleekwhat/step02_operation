package test.main;

import test.mypac.PostDto;

public class MainClassPostDto {
	
	public static void main(String[] args) {
		
		new PostDto();
		
		PostDto pDto = new PostDto(1, "hi", "dosum");
		
		PostDto pDto2 = new PostDto();
		pDto2.setNum(1);
		pDto2.setContent("hi");
		pDto2.setAuthor("zest");
		
 }
}