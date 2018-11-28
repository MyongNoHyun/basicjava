package E_OOP;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("red","auto",2);
		Car c3 = new Car("yellow","auto");
	}
}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){					//기본생성자 첫번째
		color = "black";
		gearType = "stick";
		door = 4;
	}
	Car(String color, String gearType){	
		this();
		this.color = color;		
		this.gearType = gearType;
	}

	Car(String color, String gearType, int door){	//참조변수가 있는 생성자
		this.color = color;		//this는 인스턴스변수에만 붙일수 있다.
		this.gearType = gearType;
		this.door = door;
	}

	
}