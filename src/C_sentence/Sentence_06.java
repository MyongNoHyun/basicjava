package C_sentence;

import java.util.Scanner;

public class Sentence_06 {
	public static void main(String[] args) {
		/*
		 1. do-while
		 	-while문의 변형으로 기본구조는 while비슷하다.
		 		최소 1회는 블럭을 {}를 수행한다.
		 	-구조
		 	 do{
		 	 	수행할 문장;
		 	 }while(조건식);
		 */
		
//		int aa=0;
//		int sum=0;
//		while(sum<100){
//			aa++;
//			sum += aa;
//		}
//		System.out.println(aa);
		
//		int i = 1;
//		int sum = 0;
//		do{
//			i++;
//			sum += 1;
//		}while(sum<100);
		
		//1.문자를 입력받는다.
		//2.문자를 출력한다.
		//3. 문자에 "x"를 입력하면 종료한다.
//		Scanner sc = new Scanner(System.in);
//		String str = "";
//		do{
//			System.out.println("문자를 입력해주세요");
//			str = sc.next();
//			System.out.println(str);
//		}while(!str.equals("x"));
		
		/*
		 2.continue
		 - 반복문 내에서만 사용 가능하다
		 - 반복문의 끝으로 이동하여 다른 반복문으로 넘어간다
		 */
		for (int i=0; i<11; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		
		for (int i=0; i<11; i++){
			if(i%2==0){
				continue;
			}
			System.out.println(i);
		}
		
		//3.break는 반복문의 끝으로 이동한다
//		int aa=0;
//		int sum=0;
//		while(sum<100){
//			aa++;
//			sum += aa;
//		}
//		System.out.println(aa);

		int aa=1;
		int sum=0;
		while(true){
			sum += aa;
			if(sum >= 100){
				break;
			}
			aa++;
		}
		System.out.println(aa);

		
	}
}

