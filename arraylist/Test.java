package arraylist;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Car c1=new Car("Alto",15,800000);
		Car c2=new Car("kia",12,900000);
		Car c3=new Car("Swift",13,700000);
		ArrayList al=new ArrayList();
		al.add(c1);
		al.add(c2);
		al.add(c3);
//		it will print the address of the object
		System.out.println(al);
//		if we don't need to print address of the object then we have to override the to string method
		
		

	}

}
