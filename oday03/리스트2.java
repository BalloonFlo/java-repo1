package oday03;

import java.util.List;
import java.util.Vector;

public class 리스트2 {

	public static void main(String[] args) {

		List<Board> vlist = new Vector<Board>();
		
		vlist.add(new Board("제목1", "내용1", "작성자1"));
		vlist.add(new Board("제목2", "내용2", "작성자2"));
		vlist.add(new Board("제목3", "내용3", "작성자3"));
		
		System.out.println(vlist.get(0));
		
	}

}

class Board {
	
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}