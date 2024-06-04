package arraylist;

import java.util.ArrayList;

public class ForArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(15);
		al.add(60);
		
//		printing collections using for loop
		for(int i=0;i<al.size()-1;i++) {
			System.out.println(al.get(i));
		}

	}

}
