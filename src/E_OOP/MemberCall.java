package E_OOP;

public class MemberCall {

	int iv = 10;
	static int cv = 100;
	
	int iv2 = iv;
	int iv3 = cv;
	
	static int cv2 = cv;
//	static int cv3 = iv;//불가능함 이유는 class가 만들어지긴 했지만 인스턴스화후에 넣어야함
	//로드되는 시점을 중요히생각
	static void method(){
		cv=500;
//		ic=500;
	}
	
	void method2(){
		cv = 1000;
		iv = 1000;
	}
	
	static void method3(){
		method();
//		method2();
	}
	
	void method4(){
		method();
		method2();
	}
	
	
	
	
	
	
	
}
