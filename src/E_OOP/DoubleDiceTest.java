package E_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
		// throwDice메서드를 호출하여라
		DoubleDice a = new DoubleDice();
		int result = a.thorwDice();
		System.out.println(result);
	}
}

class DoubleDice {
	// 인스턴스메서드 throwDice
	int thorwDice() {
		int a = (int) (Math.random() * 6 + 1);
		int b = (int)( Math.random() * 6 + 1);
		System.out.println(a+","+b);
		int result= a+b;
		if (a == b){
			result += thorwDice();
		} 
		return result;
	}

}