package oday01;

public class Ex01 { //page43,44

	public static void main(String[] args) {
		
		boolean x= true, y = true;
		if (x && y) 
			System.out.println("Âü");
		else
			System.out.println("°ÅÁş");
		if (!(!x || !y))
			System.out.println("Âü");
		else
			System.out.println("°ÅÁş");
		
		boolean xx = false, yy = true;
		if (xx && yy) 
			System.out.println("Âü");
		else
			System.out.println("°ÅÁş");
		if (!(!xx || !yy))
			System.out.println("Âü");
		else
			System.out.println("°ÅÁş");
		
	}

}
