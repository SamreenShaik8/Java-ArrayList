package arraylist;

public class Car {
	String name;
	int milage;
	int cost;
	
	Car(String name,int milage,int cost){
		this.name=name;
		this.milage=milage;
		this.cost=cost;
	}
	public String toString() {
//		tostring method gives the actual values
		return name+" "+milage+" "+cost+" ";
	}
}


