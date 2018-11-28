package F_OOP2;

public class ChildTest {
	public static void main(String[] args) {
		Child c1 = new Child();
		
		c1.channel = 10;
		c1.channerlup();
		System.out.println(c1.channel);
		
		c1.volume=5;
		c1.volumeup();
		System.out.println(c1.volume);
	}
}


class Parent{
	int volume;
	void volumeup(){
		volume++;
	}
}


class Child extends Parent{
	int channel;
	int volume;
	void channerlup(){
		channel++;
	}
}