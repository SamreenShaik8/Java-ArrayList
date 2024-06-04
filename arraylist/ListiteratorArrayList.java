package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListiteratorArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(15);
		al.add(60);
//		Printing collections by using list iterator 
//		by using listiterator
		
        ListIterator listitr= al.listIterator((al.size()));
        System.out.println("By using list iterator");
//        list will be printed in reversed order
        while(listitr.hasPrevious()==true) {
        	System.out.println(listitr.previous());
        }
        System.out.println("after reversing");
        
//        using iterator
        Iterator itr=al.iterator();
        System.out.println("By using iterator");
        while(itr.hasNext()==true) {
        	System.out.println(itr.next());
        }
        

	}

}
