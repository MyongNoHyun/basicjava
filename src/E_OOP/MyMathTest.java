package E_OOP;

public class MyMathTest {
	public static void main(String[] args) {
	
		MyMath.add();
		
		MyMath a =new MyMath();
		a.add2(10);//인자값(내가주는값)
		 
		MyMath.add3(5,(float) 4);
		
		a.add4(1, 2, 'a');
		
		int result = MyMath.add5(7);
		System.out.println(result);
		
		int result2 =a.add6(16, 5);
		System.out.println(result2);
		
		long result3 = a.multiply(300000000, 3000);
		System.out.println(result3);
		
		String result4 = a.divide(7, 2);
		System.out.println(result4);
		
	}
}


class MyMath{
	
	static int number =50;
	
	static void add(){
		System.out.println(number*2);
	}
	
	void add2(int a){ //매개변수
		System.out.println(number*a);
	}
	
	static void add3(int a, float c){
		System.out.println(a*c);
	}
	
	void add4(int c, int d, char e){
		System.out.println(c+d+e);//c의 입력값 + d의 입력값 + e유니코드값
	}
	
	// 클래스 매서드명은 add5
	// 매개변수는 int하나
	// 수행내용 매개변수와 umber의 합을 반환
	
	static int add5(int a){
		int result = a + number;
		return result;
	}
	int add7(int a, int b){
		int result = a + b;
		return result;
	}
	// 매서드명 add6
	// 먀개변수 int 두개
	// 앞에 받은 값에서 뒤에 받은 값을 뺀 결과를 반환하는 매서드를 만드세요
	
	int add6(int a, int b){
		int result= a-b;
		return result;
	}
	
	// multiply
	// int 값 두개
	// 두개의 수를 곱해서 변환해주세요
	// 단. overflow고려해주세요
	
	long multiply(int a, int b){
		long result=(long)a*b;
		return result;
	}
	
	//인스턴스 메서드 divide
	//int 값 두개
	// 앞의 값을 뒤의 값으로 나눈 결과를 반환해주세요
	//단. 소수점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요
	
	String divide(int a, int b){
		String result;
		if(b!=0){
			result = (int) ((float)a/b*1000+0.5)/1000f+"";
		}else {
			result = "나가";
		}
		return result;
	}
	
	
	
}

