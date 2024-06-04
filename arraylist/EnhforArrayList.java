package arraylist;

import java.util.ArrayList;

public class EnhforArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(15);
		al.add(60);
		
//      By using enhanced for loop
		for(Object x:al) {
			System.out.println(x);
		}
		

	}

}
