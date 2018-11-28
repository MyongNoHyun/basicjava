package D_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		/*
		1. 배열(array)이란?
			-같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
			 ex) 5명의 점수
				int score1 = 100;
				int score2 = 50;
				int score3 = 30;
				int score4 = 70;
				int score5 = 63;
				
		2. 배열의 선언
		  - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는[]를 붙여준다.
			int[] a1;//이것만 사용
			int a2[];
		*/
		
		/*
		3. 배열의 생성
		  - 배열을 선언한 다음에는 배열을 생성해야 한다.
		  - 배역생성을 위새서는 'new'와 함께 배열의 타입과 크기를 지정해주면 된다
	
		*/
		int[] a = new int[3];		
//		int[] a1 = new int[]{3,4,5};
		int[] a2;
		a2 = new int []{3,4,5};
		
		int[] a3 = {3,4,5};
//		int[] a3;
//		a3 = {3,4,5};
	
		int[] score = new int[4];
		
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
		
		for(int i=0 ;i< score.length ;i++ ){
			System.out.println(score[i]);
		}
		
		//1. score의 0번쨰 방에 10을 저장해주세요
		score[0] = 10; 
		//2. score의 1번쨰 방에 20을 저장해주세요
		score[1] = 20;
		//3. score의 2번쨰 방에 30을 저장해주세요
		score[2] = 30;
		//4. score의 3번쨰 방에 40을 저장해주세요
		score[3] = 40;
		
		for (int i=0; i<score.length; i++){
			score[i] = (i+1)*10;
		}
	
		//1. 207호의 자바초급 점수를 저장할수 있는 변수를 선언 및 생성해주세요(17명)
		int[] class207 = new int[17];
		//2. 각사람의 점수를 0~100점 사이의 랜덤한 점수값으로 저장해주세요 
//			class207[0] =(int)(Math.random()*100+1);
//			class207[1] =(int)(Math.random()*100+1);
//			class207[2] =(int)(Math.random()*100+1);
//			class207[3] =(int)(Math.random()*100+1);
//			class207[4] =(int)(Math.random()*100+1);
//			class207[5] =(int)(Math.random()*100+1);
//			class207[6] =(int)(Math.random()*100+1);
//			class207[7] =(int)(Math.random()*100+1);
//			class207[8] =(int)(Math.random()*100+1);
//			class207[9] =(int)(Math.random()*100+1);
//			class207[10] =(int)(Math.random()*100+1);
//			class207[11] =(int)(Math.random()*100+1);
//			class207[12] =(int)(Math.random()*100+1);
//			class207[13] =(int)(Math.random()*100+1);
//			class207[14] =(int)(Math.random()*100+1);
//			class207[15] =(int)(Math.random()*100+1);
//			class207[16] =(int)(Math.random()*100+1);
		for(int i = 0; i < class207.length ;i++){
			class207[i] = (int)(Math.random()*101);
		}
//			
		//2.5 각 사람의 점수를 출력해주세요
		for(int i=0;i<class207.length;i++){
			class207[i] = (int)(Math.random()*101);
			System.out.println(class207[i]);
		}
		//3. 모든 사람의 합계를 구해주세요.
		int sum =0;
//			sum += claas207[0]
//			sum += claas207[1]
//			sum += claas207[2]
//			sum += claas207[3]
//			sum += claas207[4]
//			sum += claas207[5]
//			sum += claas207[6]
//			sum += claas207[7]
//			sum += claas207[8]
//			sum += claas207[9]
//			sum += claas207[10]
//			sum += claas207[11]
//			sum += claas207[12]
//			sum += claas207[13]
//			sum += claas207[14]
//			sum += claas207[15]
//			sum += claas207[16]
//			sum += claas207[17]
		
		for(int i=0;i<class207.length;i++){
			sum += class207[i];
		}
		System.out.println(sum);
	
		//1. 7개의 정수를 저장할수 있는 변수 input을 선언및 생성해주세요
		int[] input = new int[7];
			
		//2. input변수의 각각의 방을 사용자로부터 입력받아 저장해주세요
	
		Scanner str = new Scanner(System.in);
//		input[0]="입력"
//		input[1]="입력"
//		input[2]="입력"
//		input[3]="입력"
//		input[4]="입력"
//		input[5]="입력"
//		input[6]="입력"
//		for (int i = 0; i<input.length;i++){
//			System.out.println("입력하시오");
//			input[i] = str.nextInt();
//		}
		
		//3 입력한것을 확인하시요
//		input[0]='입력값'
//		input[1]='입력값'
//		input[2]='입력값'
//		input[3]='입력값'
//		input[4]='입력값'
//		input[5]='입력값'
//		input[6]='입력값'
		
//		for (int i =0; i<input.length;i++){;
//			System.out.println("입력하시오");
//			input[i]= str.nextInt();
//		}	
//		for (int i =0; i<input.length;i++){
//			System.out.println(input[i]);
//		}
		
//		4.합계를 구하시요
//		sum=0
//		sum=sum+input[0]
//		sum=sum+input[1]
//		sum=sum+input[2]
//		sum=sum+input[3]
//		sum=sum+input[4]
//		sum=sum+input[5]
//		sum=sum+input[6]
		for(int i=0; i<input.length;i++){
			System.out.println("입력하시오");
			input[i]= str.nextInt();
		}
		
		for(int i=0; i<input.length;i++){
			System.out.println(input[i]);
		}

		int sum1=0;
		for(int i=0; i<input.length;i++){
			sum1+=input[i];
		}
		System.out.println(sum1);
		//평균을 구하시오
		float aver = (int)(sum1 /(float) input.length *100 + 0.5)/100f;		
		System.out.println(aver);
		//최대값
		int max = input[0];
		for(int i =1; i<7;i++){
			if(max<input[i]){
				max=input[i];
			} 
		}
		System.out.println(max);
		//최소값
		int min= input[0];
		for(int i=1;i<input.length;i++){
			if(min>input[i]){
				min=input[i];
			}
		}
		System.out.println(min);
		
		
		
		
		
		
		
	}
}
