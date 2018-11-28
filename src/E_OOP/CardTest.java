package E_OOP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import D_array.Array_01;

public class CardTest {
	public static void main(String[] args) {
		//1. Card클래스의 너비를 출력하세요 100
		System.out.println(Card.width);
		//2. Card클래스의 높이를 출력하세요 250
		System.out.println(Card.height);
		//3. Card클래스의 객체를 만들어주세요 변수명 : cd1
		Card cd1 = new Card();
		//4. cd1의 문양을 SPADE로 변경해주세요
		cd1.kind = "SPADE";
		cd1.method();
		//5. cd1의 숫자 7로 변경해주세요 
		cd1.number = 7;
		//6. Card클래스의 객체를 만들어주세요 변수명 : cd2
		Card cd2 = new Card();
		//7. cd2의 문양을 HEART로 변경해주세요
		cd2.kind = "HEART";
		//8. cd2의 숫자 3로 변경해주세요 
		cd2.number = 3;
		//9. 아래와같이 출력해주세요 
		//	 cd1의 모양: 숫자: 너비: 높이:		;모양:SPADE 숫자:7 너비:100 높이:250
		//	 cd2의 모양: 숫자: 너비: 높이:		;모양:HEART 숫자:7 너비:100 높이:250
		System.out.println("모양:"+cd1.kind+"숫자:"+cd1.number+"너비:"+cd1.width+"높이:"+cd1.height);
		System.out.println("모양:"+cd2.kind+"숫자:"+cd2.number+"너비:"+cd2.width+"높이:"+cd2.height);
		//10. cd1의 너비를 50으로 변경해주세요
		cd1.width=50;
		//11. cd2의 너비를 80으로 변경해주세요
		cd2.height=80;
		int aa=10;
		//12. 아래와같이 출력해주세요
		//	 cd1의 모양: 숫자: 너비: 높이:   ;모양:SPADE 숫자:7 너비:50 높이:250 
		//	 cd2의 모양: 숫자: 너비: 높이:   ;모양:SPADE 숫자:7 너비:50 높이:80
		System.out.println("모양:"+cd1.kind+"숫자:"+cd1.number+"너비:"+Card.width+"높이:"+Card.height);
		System.out.println("모양:"+cd2.kind+"숫자:"+cd2.number+"너비:"+Card.width+"높이:"+Card.height);
		
		
		
		
		
		
		
		
		
	}

}


class Card{
	
	//인스턴스변수
	String kind;
	int number;
	void m(){System.out.println("m호출");}
	//클래스변수
	static int width = 100;
	static int height = 250;
	
	void method(){
		
		int v = 3; //지역변수
		m();
	}
	
	static void method2(){
		
	}
	
	
	
}

