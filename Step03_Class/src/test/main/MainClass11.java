package test.main;

import test.mypac.Post;

public class MainClass11 {
	
	public static void main(String[] args) {
		Post p1 = null;
		Post p2 = new Post();
		Post p3 = p2;
		
		p2.id = 1;
		p2.content = "hello";
		p2.author = "kim";
		
		p3.id = 2;
		System.out.println(p2.id);
		
		p3.printData();		
	}
}
