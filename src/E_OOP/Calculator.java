package E_OOP;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Op a = new Op();
		for(;;){
			int b = a.num();
			String d = a.oper();
			int c = a.num();
			if(d.equals("+")){
				System.out.println(a.add(b, c)+"");
			} else if(d.equals("-")){
				System.out.println(a.add2(b, c)+"");
			} else if(d.equals("*")){
				System.out.println(a.multiply(b, c)+"");
			} else if(d.equals("/")){
				System.out.println(a.divide(b, c)+"");
			} else if(d.equals("x")){
				break;
			}
		}
		
		
		
		
		
		
	}
}

class Op{
	int num(){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("숫자를입력");
		int result = sc1.nextInt();
		return result;
	}
	
	String oper(){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("연산자입력");
		String result = sc1.next();
		return result;
	}
	
	int add(int a , int b){
		int result = a+b;
		return result;		
	}

	int add2(int a , int b){
		int result = a-b;
		return result;
	}

	long multiply(int a, int b){
		long result = (long)a * b;
		return result;
	}
	
	float divide(int a, int b){
		float result;
		if(b==0){
			result = divide(a, b);
		} else {
			result =(int) ((float)a/b*1000+0.5)/1000f;
		}
		return result; 
	}
	
}
