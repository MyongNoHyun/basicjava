package Y_exam;

public class Exam_02 {
	public static void main(String[] atge) {
		/*

		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
				
					1byte		2byte		4byt		8byte
			----------------------------------------------------------------
			논리형	boolean		
			----------------------------------------------------------------
			문자형				char
			----------------------------------------------------------------
			정수형	byte		short		int			long
			----------------------------------------------------------------
			실수형							float		double
			----------------------------------------------------------------
			
		
			
		[2-2] 	주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
				(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
				초기화 하는 한 줄의 코드를 적으시오.
				답: long
					long regNo = 9302101031631L;
		
		
		
		
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 ss적으시오.
				int i = 100;
				long l =100L;
				final float PI = 3.14f;
				
				- 리터럴 : 100, 100L, 3.14f 그 자체로 값을 의미하는 것
				- 변수 : i, l 단 하나의 값을 저장할 수있는 메모리 공간
				- 키워드 : final
				- 상수 : PT => final로 선언된 변수는 상수이다
		
		
		
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
				a. int
				b. Byte
				c. double
				d. boolean
		
				답: Byte 첫글짜가 대문자이기 때문에 클래스명이다
		
		
		
		[2-5] 	다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
				류’라고 적으시오.
				System.out.println(“1” + “2”) → ( ) => String + String => String
				System.out.println(true + “”) → ( ) => boolean + String => String + String => String
				System.out.println(‘A' + 'B') → ( ) => chr + chr =  <-(틀림) 둘다 4byte이하일 경우에는 int로 변환하여 연산한다
				System.out.println('1' + 2) → ( ) => char + byte = char + char = char <-(틀림) 2가 int로 인지 된다
				System.out.println('1' + '2') → ( ) => char + char = char <-(틀림) char는 int로 변환하여 사용되기 때문에 1의 uniecode인 49로 변환되서 계산 된다
				System.out.println('J' + “ava”) → ( ) => char + String = String + String = String
				System.out.println(true + null) → ( )  => boolean + ??? = 오류	이유:null 	  
		  
		 
		 */
				System.out.println("1" + "2");
				System.out.println(true + "");
				System.out.println('A' + 'B');
				System.out.println('1' + 2);
				System.out.println('1' + '2');
				System.out.println('J' + "ava");
				
				

		/*
		 [2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
				a. if		키워드
				b. True		클래스명
				c. NULL		상수의 명칭
				d. Class	클래스명
				e. System	클래스명
			
			
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
				a. $ystem		사용가능
				b. channel#5	특수문자는 '_', "$"만 사용가능
				c. 7eleven		숫자로 시작하면 안되기 떄문에 변수명이 될수없다
				d. If			사용가능
				e. 자바			한글은 사용할수없다	
				f. new			예약어(key word, reserved word)라 변수로 사용할수없다
				g. $MAX_NUM		사용가능
				h. hello@com	특수문자는 '_', "$"만 사용가능	
			 
				답 : $ystem, If, $MAX_NUM
			
			
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은?
		 	  (모두 고르시오)
				a. int
				b. long
				c. short
				d. float
				e. double	
			
				답 : int, double		(정수형 byte, short, int, long의 기본형은 int이고 실수형 float, double의 기본은 double 이다)
			
			
		
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
				byte b = 10;
				char ch = 'A';
				int i = 100;
				long l = 1000L;
				
				a. b = (byte)i;			b는 byte이고 i는 int이기 때문에 byte가 더 작아서 생략 불가능하다
				b. ch = (char)b;		ch는 char이고 b는 byte이기 때문에 char가 더 크기 생략 가능하다 <-(틀림) char은 문자기 때문에 음수의 버위에 안들어간다
				c. short s = (short)ch; short는 ch(int)보다 용량이 크기 때문에 생략 가능 <-(틀림) 
				d. float f = (float)l;	float는 l(long)보다 용량이 작기 때문에 생략 불가능 <-(틀림)
				e. i = (int)ch;			i(int)는 ch(char)보다 용량이 크기 때문에 생략 가능
					
				byte -> short -> int -> long -> float -> double
								  ㅣ
							char -
				
				
		
		
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		
			답 : char는 2byte이고 16bite를 사용 문자이기 떄문에 0~2^16이 저장될수 있다
			
		
		
		
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
				a. byte b = 256;		byte의 저장값은 -2^7 ~ 2^7-1 이기떄문에 저장값을 초과
				b. char c = '';			문자르 하나는 저장해야 하는데 공란이라 문제가 된다
				c. char answer = 'no';	char은 문자하나만 저장할떄 사용한다
				d. float f = 3.14		기본형이 더블이기 때문에 F를 붙여줘야 한다
				e. double d = 1.4e3f;	1.4e3f는 1.4*10^3 이기 때문에 문제가 없다





		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
				a. boolean - false	boolean은 true, false 값을 갖는데 기본값은 false이다
				b. char - '\u0000'	chra의 기본값은 '\u0000'이
				c. float - 0.0		float의 기본값은 0.0F이다
				d. int - 0			int의 기본값은 0이다
				e. long - 0			long의 기본값은 0L이다
				f. String - ""		String의 기본값은 null이다
			
						   자료형				 기본값
				  boolean	 		false
				  char    	 		'\u0000'
				  byte				0
				  short         	0
				  int           	0
				  long 				0L   
				  float				0.0f
				  double			0.0d 또는 0.0
				   참조형 변수(String)	null 
								출처: http://linuxism.tistory.com/94 [linuxism]

			
			
			
		 */

				
				
				
				
		
				
				
				
				
				
				
				
				
				
	}
}
