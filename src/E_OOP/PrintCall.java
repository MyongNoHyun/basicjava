package E_OOP;

public class PrintCall {
	
	int a1 = 3;
	int b1 = 5;
	
	long a2 = 6L;
	long b2 = 8L;
	
	//1. 메서드명 add
	// 매개변수 int 한개
	// 매개변수와 a1의 합계를 반환하는 매서드를 만드세요
	int add(int a){
		int result = a+a1;
		return result;
	}
	//2. 메서드명 add
	// 매개변수 long 한개
	// 매개변수와 a2의 합계를 반환하는 매서드를 만드세요
	long add(long a){
		long result = a+a2;
		return result;
	}
	//3. 메서드명 add
	// 매개변수 int 두개
	// 매개변수와 a1,a2의 합계를 반환하는 매서드를 만드세요
//	int add (int a, int b){
//		int result = a1+a2;
//		return result;
//	}
	//4. 메서드명 add
	// 매개변수 int 한개 long 한개
	// 매개변수 두개의 합계를 반환하는 매서드를 만드세요
	long add(int a, long b){
		long result = a+b;
		return result;
	}
	//5. 메서드명 add
	// 매개변수 int 두개
	// 매개변수와 두개와 b2의 합계를 반환하는 매서드를 만드세요
//	long add(int a, int b){
//		long result =a+b+b2;
//		return result;
//	} 반환 타입이 달라야한다
	
	
	
	
}
