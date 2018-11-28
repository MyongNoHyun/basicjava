package A_variableBasic;

public class VariableType {
	public static void main(String[] arge) {
		/*
		 변수의 타입
		 
		 1. 기본형타입(primitive type)
		   -boolean, char, byte, short, int, long, float, double
		 
		 2. 참조형타입(reference type)
		   -주소를 저장한다. (4byte)
		 
		 3. 종류
		   - 논리형: true와 false만을 값으로 갖는다. 조건식과 논리적 계산에 많이 사용 ex)boolean
		   - 문자형: 분자를 하나 저장하는데 사용된다. ex) char
		   - 정수형: 정수값을 저장하는데 사용한다. ex) byte, short, int, long
		   - 실수형: 실수값을 저장하는데 사용한다. ex) float, double
		   
		 4. 크기 (1byte = 8bit) 
		   - 1byte : boolean, byte 
		   - 2byte : char, short
		   - 4byte : int. float
		   - 8byte : long, double
		
		 5. 논리형 : boolean(기본값 false)
		     boolean형 변수는 true, false는 하나의 값을 저장 할수 있다
		       대답 (YES or NO), 스위치(ON or OFF)등의 논리구현에 주로 사용한다
		     1byte의 크기를 가진다
		     
		 6. 문자형 char ('\u0000')
		    문자 하나를 저장하는 용도로 사용된다
		    java는 unicode 문자 체계를 사용한다
		    2byte의 크기를 가진다.
		        
		 */
		
		char code = ('A');		
		char code2 = '\u0041';
		char code3 = 65;
		
		System.out.println(code);
		System.out.println(code2);
		System.out.println(code3);
		
		/*
		 정수형 : byte short int long
		 		기본 자료형은 int형이다 변수에 저장하고자 하는 정수값의 범위에 따라 4개를 하나로 선택		  
		 */
		
		// byte 나입의 변수 b1에 150의 값을 지정해준다
		byte b1 = 100;
		//9508312111111
		long b2 = 950831211111L;
		// 4byte보다 길면 숫자뒤에 L을 붙인다
		
		
		
		/*
		 8. 실수형 : float double
		    실수형 값을 저장하는데 사용한다
		    float: 1+8+26
		    double: 1+11+52
		   기본형은 double이다
		 */
//		 3.14159254863
		
		double s1 = 3.14159257863;
		float s2 = 3.14159257863F;//기본형이 double이기 때문에 F를 붙여줘야 한다
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		double d2 = 0.5;
		float f2 = 0.5f;
		
		System.out.println(d2 == f2);
		
		/*
		 9. 문자열 : String
		 */
		String str = "================\n----";
		System.out.println(str);
		
		/*
		 10. overflow
		     자신이 표현할수 있는 값을 넘어섰을때 최소값으로 돌아가는 현상
		 */
		
		byte c1 = 126;
		System.out.println(c1);//126
		c1++;
		System.out.println(c1);//127
		c1++;
		System.out.println(c1);//-128
		c1++;
		System.out.println(c1);//-127
		
		
		/*
		11. 변화형(casting) 
			기본형 간에는 서로 다른 타입으로 변환이 가능하다
			byte-short-int-long-float-double
						ㅣ
					char-
		 */
		
		int a2 = 40000;
		byte b3 = (byte) a2;
		System.out.println(b3);
		
		
		int a3 = 65;
		char c3 = (char) a3;
		System.out.println(c3);
		
		
		char c4 = 'B';
		int i4 = (int) c4;
		
		long aa = 180;
		short ff = (short) aa;
		
		
		
		/*
		 12 문자열 결합
		 
		 */
		
		System.out.println(55 + 10);
		System.out.println("하이"+55); //"하이" + "55  = 하이55
		System.out.println("45" + 20);
		System.out.println("56"+"32");
		System.out.println(""+45);
		System.out.println(true+"34");
		System.out.println('T'+"G"+45);
		System.out.println('A'+4+"44");
		
		
		double d = 1.4e3f;
		float d1 = 1.4e6f;
		System.out.println(d);
		System.out.println(d1);
				
		
	}
}
