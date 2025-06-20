package test.mypac;

public class PostDto{
	
	private int num;
	private String content;
	private String author;
	
	public int getNum() {
		return num;
	}
	public String content() {
		return content;
	}
	public String author() {
		return author;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public PostDto(int num, String content, String author) {
		this.num = num;
		this.content = content;
		this.author = author;
	}
	
	public PostDto() {
		System.out.println("hi");
	}
}