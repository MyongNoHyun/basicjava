package D_array;

import java.util.Arrays;

public class Array_03 {
	public static void main(String[] args) {
		/*
		1. 다차원 배열
		 - 자바에서는 1차원 배열뿐만아니라 2파원 이상의 다차원 배열도 허용한다.
		 -  2차원 배열의 선언
		 	 선언방법
		 	 변수타입[][] 변수명;이것만 쓸것임
		 	 변수타입[] 변수명[];
		 	 변수타입 변수명[][];
		 	 
		 	 -2차원 배역의 생성
		 	  new 변수타입[][];기본형태
		*/
		int[][] a = new int[3][];
		a[0] =new int[2];
		a[1] =new int[3];
		a[2] =new int[4];
		
		int[][] b =new int[][]{
								{1,2},
								{3,4,5},
								{6,7,8,9},
							   };
		
		System.out.println(Arrays.toString(b[0]));
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[1][0]);
		System.out.println(b[1][1]);
		System.out.println(b[1][2]);
		System.out.println(b[2][0]);
		System.out.println(b[2][1]);
		System.out.println(b[2][2]);
		System.out.println(b[2][3]);
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				System.out.println(b[i][j]);
			}
		}
		
		//변수 a의 각방에  10,20,30,......,90까지 입력해주세요
		a[0][0] = 10;
		a[0][1]	= 20;
		int s=1;
		for(int j=0;j<a[0].length;j++){
			a[0][j] = s*10;
			s++;
			System.out.println(a[0][j]);
		}
		a[1][0] = 30;
		a[1][1] = 40;
		a[1][2] = 50;
		for(int j=0;j<a[1].length;j++){
			a[1][j] = s*10;
			s++;
			System.out.println(a[1][j]);
		}
		a[2][0] = 60;
		a[2][1] = 70;
		a[2][2] = 80;
		a[2][3] = 90;
		for(int j=0;j<a[2].length;j++){
			a[2][j] = s*10;
			s++;
			System.out.println(a[2][j]);
		}
		int k=1;
		for (int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=k*10;
				System.out.println(a[i][j]);
				k++;
			}
		}
		
		
		Math.random();
		
	}
}
