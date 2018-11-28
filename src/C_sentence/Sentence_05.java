package C_sentence;

import java.util.Scanner;

public class Sentence_05 {
	public static void main(String[] args) {
	
		/*
		 1. while문
		  	- 반복횟수를 모를때 사용한다.
		  	- 조건식과 수행해야할 블록{}으로 구성되어 있다
		 	- 구조
		 	while(조건식){
		 	
		 	}
		 */
				
		//1. 3~33까지의 합계를 구하세요
//		int i = 3;
//		int sum = 0;
//		while(i<34){
//			sum +=i;
//			i++;
//		}
//		System.out.println(sum);
		
		//2. 1.에서 짝수의 합을 구하시오
//		int i1 = 3;
//		int sum1 = 0;
//		while(i1<34){
//			if(i1%2==0){
//			 sum1 += i1;
//			}
//			i1++;
//		}	
//		System.out.println(sum1);
		
		//3. for문으로 구구단을 찍으시오
//		for(int x=2; x<10;x++){
//			for(int y=1; y<10;y++){
//				System.out.println(x+"*"+y+"="+x*y);
//			}
//		}
		
		//4. while문으로 구구단을 바꾸시오
		int x=2;
		while(x<10){
			int y=1;
			while(y<10){
				System.out.println(x+"*"+y+"="+x*y);
				y++;
			}
			x++;
		}
		
		//5. while문 짝수단의 홀수단
		
//		int x=2;
//		while(x<10){
//			int y=1;
//			while(y<10){
//				if(y%2!=0 && x%2==0){
//					System.out.println(x+"*"+y+"="+x*y);
//				}
//				y++;
//			}
//			x++;
//		}
		
		//3. 1~? 더했을때 합계가 100이상이 되는가?
//		int aa=0;
//		int sum=0;
//		while(sum<100){
//			aa++;
//			sum += aa;
//		}
//		System.out.println(aa);
		
		//4.시작로부터 시작하는 숫자와 끝나는 숫자를 입력받으세요
		//	시작하는 문자부터 끝나는 숫자를 5의 배수의 합계를 구하세요
		//	단 while문을 사용하세요
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("시작 숫자를 입력하세요");
//		int a = sc.nextInt();
//		
//		System.out.println("끝나는 숫자를 입력하세요");
//		int b = sc.nextInt();
//		
//		int sum2=0;
//		while(a<b+1){
//			if(a%5==0){
//				sum2+=a;
//			}
//			a++;
//		}
//		System.out.println(sum2);
		
	}
}
