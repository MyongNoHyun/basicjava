package C_sentence;

import java.util.Scanner;

public class Sentence_04 {
	public static void main(String[] args) {

//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int result1 = sc1.nextInt();
//
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("문자를 입력하시오");
//		String result2 = sc2.next();
//
//		Scanner sc3 = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int result3 = sc3.nextInt();
		
		for ( ; ; ){
			Scanner sc1 = new Scanner(System.in);
			System.out.println("숫자를 입력하시오");
			int result1 = sc1.nextInt();

			Scanner sc2 = new Scanner(System.in);
			System.out.println("문자를 입력하시오");
			String result2 = sc2.next();

			Scanner sc3 = new Scanner(System.in);
			System.out.println("숫자를 입력하시오");
			int result3 = sc3.nextInt();

			if (result2.equals("*")){
				System.out.println(result1*result3);
			} else if (result2.equals("+")){
				System.out.println(result1+result3);
			} else if (result2.equals("-")){
				System.out.println(result1-result3);
			} else if (result2.equals("/")){
				System.out.println((float)result1/result3);
			} else if(result2.equals("x")){
				break;
			} 
			
		}
	}
}
